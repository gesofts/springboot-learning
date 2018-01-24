package com.kfit.core.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kfit.core.service.UserInfoService;
import com.kfit.entity.userInfo;
import com.sun.org.glassfish.gmbal.ParameterNames;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {
	@Autowired
	private UserInfoService userInfoService;
	/**
	 * 用户查询.
	 * @return
	 */
	@RequestMapping("/userList")
	public String userInfo(){
		return "userInfo";
	}
    @RequestMapping(value = "/findUser", method = RequestMethod.POST)
    @ResponseBody
    public userInfo findUser(@RequestParam("id") int id) {
        return userInfoService.findById(id);
    }
	
	/**
	 * 用户添加;
	 * @return
	 */
	@RequestMapping("/userAdd")
	@RequiresPermissions("add")//权限管理;
	public String userInfoAdd(){
		return "userInfoAdd";
	}
	
	/**
	 * 用户删除;
	 * @return
	 */
	@RequestMapping("/userDel")
	@RequiresPermissions("del")//权限管理;
	public String userDel(){
		return "userInfoDel";
	}
	
}
