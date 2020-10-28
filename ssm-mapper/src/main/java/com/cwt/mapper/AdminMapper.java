package com.cwt.mapper;

import com.cwt.pojo.Admin;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AdminMapper {
    @Select("select * from t_admin")
    List<Admin> selectAll();
}
