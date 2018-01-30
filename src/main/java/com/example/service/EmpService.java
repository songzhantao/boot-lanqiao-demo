package com.example.service;

import com.example.utils.PageModel;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface EmpService {
    public List<HashMap> findEmps();
    public List<HashMap>  findCustomers();
    public PageModel  findPageCustomers( PageModel model,String name ,Integer age);


}
