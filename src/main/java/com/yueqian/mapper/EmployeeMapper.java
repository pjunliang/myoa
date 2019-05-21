package com.yueqian.mapper;

import com.yueqian.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
   /*根据个人用户名来查找*/
    Employee getEmployeeByEname(@Param("name") String name);
}