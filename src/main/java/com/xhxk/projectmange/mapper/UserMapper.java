package com.xhxk.projectmange.mapper;

import com.xhxk.projectmange.model.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insert(SysUser record);

}
