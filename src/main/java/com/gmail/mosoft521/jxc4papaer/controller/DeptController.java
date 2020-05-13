package com.gmail.mosoft521.jxc4papaer.controller;

import com.gmail.mosoft521.jxc4papaer.entity.Dept;
import com.gmail.mosoft521.jxc4papaer.service.DeptService;
import com.gmail.mosoft521.jxc4papaer.service.EmpService;
import com.gmail.mosoft521.jxc4papaer.vo.DeptVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private EmpService empService;

    /**
     * 获取所有部门列表
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<DeptVO> list() {
        List<Dept> deptList = deptService.list();
        List<DeptVO> deptVOList = new ArrayList<>(deptList.size());
        for (Dept dept : deptList) {
            DeptVO deptVO = new DeptVO();
            BeanUtils.copyProperties(dept, deptVO);
            Integer empId = deptVO.getEmpId();
            if (null != empId) {
                deptVO.setEmpName(empService.getNameById(empId));
            }
            deptVOList.add(deptVO);
        }
        return deptVOList;
    }

    /**
     * 保存或修改部门
     *
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @ResponseBody
    public boolean saveOrUpdate(@RequestParam Integer deptId, @RequestParam String name, @RequestParam String place, @RequestParam String tel, @RequestParam String fax, @RequestParam String remark) {
        Dept dept = new Dept();
        dept.setDeptId(deptId);
        dept.setName(name);
        dept.setPlace(place);
        dept.setTel(tel);
        dept.setFax(fax);
        dept.setRemark(remark);
        return deptService.saveOrUpdate(dept);
    }

    @PostMapping("/delete")
    @ResponseBody
    public boolean delete(@RequestParam Integer deptId) {
        return deptService.delete(deptId);
    }
}
