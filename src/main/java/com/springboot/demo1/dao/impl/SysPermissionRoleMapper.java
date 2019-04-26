package com.springboot.demo1.dao.impl;

import java.util.List;

import com.springboot.demo1.dao.SysPermissionRole;

public interface SysPermissionRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysPermissionRole record);

    SysPermissionRole selectByPrimaryKey(Long id);

    List<SysPermissionRole> selectAll();

    int updateByPrimaryKey(SysPermissionRole record);
}