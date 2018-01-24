package com.kfit.dao;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.kfit.entity.role;
import com.kfit.entity.userrole;



@Mapper
public interface UserRoleDao {
  @Select("select * from userrole where uid=#{uid}")
  List<userrole> getRoles(@Param("uid") int uid);
}
