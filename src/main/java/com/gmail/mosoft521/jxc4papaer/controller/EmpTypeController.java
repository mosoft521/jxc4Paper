package com.gmail.mosoft521.jxc4papaer.controller;

import com.gmail.mosoft521.jxc4papaer.entity.EmpType;
import com.gmail.mosoft521.jxc4papaer.service.EmpTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/empType")
public class EmpTypeController {

    @Autowired
    private EmpTypeService empTypeService;

    /**
     * 获取所有员工类型列表
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<EmpType> list() {
        List<EmpType> deptList = empTypeService.list();
        return deptList;
    }

    /**
     * 保存或修改员工类型
     *
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @ResponseBody
    public boolean saveOrUpdate(@RequestParam Integer empTypeId, @RequestParam String name, @RequestParam String remark) {
        EmpType empType = new EmpType();
        empType.setEmpTypeId(empTypeId);
        empType.setName(name);
        empType.setRemark(remark);
        return empTypeService.saveOrUpdate(empType);
    }

    @PostMapping("/delete")
    @ResponseBody
    public boolean delete(@RequestParam Integer empTypeId) {
        return empTypeService.delete(empTypeId);
    }
}
