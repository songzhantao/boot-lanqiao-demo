package com.example.service.impl;

import com.example.mapper.EmpMapper;
import com.example.service.EmpService;
import com.example.utils.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class EmpServiceImpl  implements EmpService{

    @Autowired
    EmpMapper  empMapper;



    @Override
    public List<HashMap> findEmps() {
        return empMapper.findEmps();
    }

    @Override
    public List<HashMap> findCustomers() {
        return empMapper.findCustomers();
    }

    @Override
    public PageModel findPageCustomers(PageModel model, String name, Integer age) {
        List  list =  empMapper.findPageCustomers(model.startRow()-1,model.getPageSize(),name ,age);
        model.setList(list);
        return model;
    }


}
