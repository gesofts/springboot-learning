package com.kfit.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.kfit.entity.permission;
import com.kfit.entity.role;

@Mapper
public interface PermissionDao {
	@Select("select * from permission where id=#{id}")
	permission getPermission(@Param("id") int id);
}
