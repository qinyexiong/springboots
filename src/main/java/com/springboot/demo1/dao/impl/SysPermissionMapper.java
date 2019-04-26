package com.springboot.demo1.dao.impl;

import com.springboot.demo1.dao.SysPermission;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SysPermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysPermission record);

    SysPermission selectByPrimaryKey(Long id);

    List<SysPermission> selectAll();

    int updateByPrimaryKey(SysPermission record);

	List<SysPermission> findByAdminUserId(Long id);

	List<SysPermission> findAll();
}