package cn.itcast.controller;

import cn.itcast.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/productList")
    @ResponseBody  // 自动把map数据转换为json格式
    public Map<String,Object> queryProduct(){
        return service.findProuductMap();
    } 
}
