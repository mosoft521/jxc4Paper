package com.gmail.mosoft521.jxc4papaer.controller;

import com.gmail.mosoft521.jxc4papaer.entity.Provider;
import com.gmail.mosoft521.jxc4papaer.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    /**
     * 获取所有供应商列表
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<Provider> list() {
        List<Provider> providerList = providerService.list();
        return providerList;
    }

    /**
     * 保存或修改供应商
     *
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @ResponseBody
    public boolean saveOrUpdate(@RequestParam Integer providerId, @RequestParam String name, @RequestParam String linkman, @RequestParam String tel, @RequestParam String address, @RequestParam String zip, @RequestParam String fax, @RequestParam String remark) {
        Provider provider = new Provider();
        provider.setProviderId(providerId);
        provider.setName(name);
        provider.setLinkman(linkman);
        provider.setTel(tel);
        provider.setAddress(address);
        provider.setZip(zip);
        provider.setFax(fax);
        provider.setRemark(remark);
        return providerService.saveOrUpdate(provider);
    }

    @PostMapping("/delete")
    @ResponseBody
    public boolean delete(@RequestParam Integer providerId) {
        return providerService.delete(providerId);
    }
}
