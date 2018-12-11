package com.xhxk.projectmange.service;

import com.xhxk.projectmange.common.Constant;
import com.xhxk.projectmange.mapper.UserMapper;
import com.xhxk.projectmange.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public void save(SysUser sysUser){
        sysUser.setPassword(Constant.DEFAULT_USER_PASSWORD);
        userMapper.insert(sysUser);
    }
}
