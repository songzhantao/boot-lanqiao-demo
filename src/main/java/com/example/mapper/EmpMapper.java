package com.example.mapper;

import com.example.utils.PageModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface EmpMapper {
    public List<HashMap>  findEmps();
    public List<HashMap>  findCustomers();
    public List<HashMap>  findPageCustomers(@Param("start") Integer start ,
                                            @Param("end") Integer  end,
                                            @Param("name") String name ,
                                            @Param("age") Integer age);

}
