package com.gmail.mosoft521.jxc4papaer.controller;

import com.gmail.mosoft521.jxc4papaer.entity.Emp;
import com.gmail.mosoft521.jxc4papaer.service.DeptService;
import com.gmail.mosoft521.jxc4papaer.service.EmpService;
import com.gmail.mosoft521.jxc4papaer.service.EmpTypeService;
import com.gmail.mosoft521.jxc4papaer.vo.EmpVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {
    //日期格式
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    //时间格式
    private SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private EmpService empService;

    @Autowired
    private DeptService deptService;

    @Autowired
    private EmpTypeService empTypeService;

    /**
     * 登录
     *
     * @param userName 用户名
     * @param password 密码
     * @return 成功或失败
     */
    @PostMapping("/login")
    @ResponseBody
    public boolean login(@RequestParam String userName, @RequestParam String password) {
        return empService.login(userName, password);
    }

    /**
     * 获取所有员工列表
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<EmpVO> list() {
        List<Emp> empList = empService.list();
        List<EmpVO> empVOList = new ArrayList<>(empList.size());
        for (Emp emp : empList) {
            EmpVO empVO = new EmpVO();
            BeanUtils.copyProperties(emp, empVO);
            empVO.setDeptName(deptService.getNameById(empVO.getDeptId()));
            empVO.setManageTypeName(empTypeService.getNameById(empVO.getManageTypeId()));
            empVOList.add(empVO);
        }
        return empVOList;
    }

    /**
     * 按部门获取员工列表
     *
     * @return
     */
    @RequestMapping("/listByDeptId")
    @ResponseBody
    public List<EmpVO> list(@RequestParam Integer deptId) {
        List<Emp> empList = empService.list(deptId);
        List<EmpVO> empVOList = new ArrayList<>(empList.size());
        for (Emp emp : empList) {
            EmpVO empVO = new EmpVO();
            BeanUtils.copyProperties(emp, empVO);
            empVO.setDeptName(deptService.getNameById(empVO.getDeptId()));
            empVO.setManageTypeName(empTypeService.getNameById(empVO.getManageTypeId()));
            empVOList.add(empVO);
        }
        return empVOList;
    }

    /**
     * 保存或修改员工
     *
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @ResponseBody
    public boolean saveOrUpdate(@RequestParam Integer empId, @RequestParam Integer deptId, @RequestParam Integer manageTypeId, @RequestParam String name, @RequestParam String empNo, @RequestParam String tel,
                                @RequestParam String userName, @RequestParam String password, @RequestParam String sex, @RequestParam String birthday, @RequestParam String degree) {
        Emp emp = new Emp();
        emp.setEmpId(empId);
        emp.setDeptId(deptId);
        emp.setManageTypeId(manageTypeId);
        emp.setName(name);
        emp.setEmpNo(empNo);
        emp.setTel(tel);
        emp.setUserName(userName);
        emp.setPassword(password);
        emp.setSex(sex);
        Date d = null;
        try {
            d = dateFormat.parse(birthday);
        } catch (ParseException e) {
            return false;
        }
        emp.setBirthday(d);
        emp.setDegree(degree);
        return empService.saveOrUpdate(emp);
    }

    @PostMapping("/delete")
    @ResponseBody
    public boolean delete(@RequestParam Integer empId) {
        return empService.delete(empId);
    }
}
