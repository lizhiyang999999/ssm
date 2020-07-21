package cn.itcast.controller;

import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {

    @Autowired
    AccountService service;

    @RequestMapping("/transfer")
    public String transfer(String inName,String outName,double money){
        service.transfer(inName,outName,money);
        return "success";
    }

}

