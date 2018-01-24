package com.kfit.dao;

import java.util.List;




import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.kfit.entity.permission;
import com.kfit.entity.role;



@Mapper
public interface RoleDao {
//  @Select("select permission from permission RIGHT JOIN(SELECT permissionid from rolepermission RIGHT  JOIN(SELECT * from role where role=#{role})b on b.id=rolepermission.roleid)c on c.permissionid=permission.id")
//  List<String> findpermissionsByRole(@Param("role")String role);
	@Select("select * from role where id=#{id}")
	role getRole(@Param("id") int id);
}
