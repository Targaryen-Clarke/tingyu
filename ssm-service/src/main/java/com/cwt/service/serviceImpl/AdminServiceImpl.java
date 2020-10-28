package com.cwt.service.serviceImpl;

import com.cwt.mapper.AdminMapper;
import com.cwt.pojo.Admin;
import com.cwt.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;
    @Override
    public List<Admin> selectAll() {
        return adminMapper.selectAll();
    }
}
