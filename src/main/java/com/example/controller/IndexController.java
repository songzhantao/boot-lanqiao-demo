package com.example.controller;

import com.example.service.EmpService;
import com.example.service.impl.EmpServiceImpl;
import com.example.utils.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {


    @Autowired
    EmpService empService;

    @RequestMapping("/login")
    public String login() {
        return "hello";
    }


    @RequestMapping("/list")
    public Object  list(){
        List list =empService.findEmps();

        return  list;
    }



    @RequestMapping("/alls")
    public Object  alls(){
        List list =empService.findCustomers();
        return  list;
    }

    @RequestMapping("/alls/page")
    public Object listpage(Integer  page,String name ,Integer age){
        System.out.println("page:"+page);
        System.out.println("name:"+name);
        System.out.println("age:"+age);


        PageModel model =new PageModel(page,10);
        PageModel pageModel = empService.findPageCustomers(model,name,age);
        return pageModel.getList();
    }







}