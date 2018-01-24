package com.kfit.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.kfit.entity.permission;
import com.kfit.entity.role;
import com.kfit.entity.rolepermission;

@Mapper
public interface RolePermissionDao {
	  @Select("select * from rolepermission where roleid=#{roleid}")
	  List<rolepermission> getPermissions(@Param("roleid") int roleid);
}
