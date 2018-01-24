package com.kfit.dao;

import java.util.List;



import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.kfit.entity.userInfo;




@Mapper
public interface UserDao {
	@Select("SELECT * FROM userInfo where username=#{username}")
    userInfo finduserByName(@Param("username") String username);
//	@Select("select role from role RIGHT JOIN(SELECT roleid from userrole RIGHT  JOIN(SELECT * from userinfo where username=#{username})b on b.id=userrole.uid)c on c.roleid=role.id")
//	List<String> findrolesByName(@Param("username") String username);
	@Select("SELECT * FROM userInfo where id=#{id}")
	userInfo finduserById(@Param("id") int id);

	
}
