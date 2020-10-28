package com.cwt;

import com.cwt.pojo.Admin;
import com.cwt.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("admin")
public class Admincontroller {
    @Resource
    private AdminService service;

    @RequestMapping("list")
    @ResponseBody
    public List<Admin> list() {
        List<Admin> admins = service.selectAll();
        System.out.println(admins);
        return admins;
    }
}
