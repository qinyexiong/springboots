package com.springboot.demo1.dao.impl;

import java.util.List;

import com.springboot.demo1.dao.SysRoleUser;

public interface SysRoleUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoleUser record);

    SysRoleUser selectByPrimaryKey(Long id);

    List<SysRoleUser> selectAll();

    int updateByPrimaryKey(SysRoleUser record);
}