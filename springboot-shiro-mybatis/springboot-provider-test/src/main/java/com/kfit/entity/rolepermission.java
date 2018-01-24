package com.kfit.entity;

import java.io.Serializable;

public class rolepermission implements Serializable{
private int roleid;
public int getRoleid() {
	return roleid;
}
public void setRoleid(int roleid) {
	this.roleid = roleid;
}
public int getPermissionid() {
	return permissionid;
}
public void setPermissionid(int permissionid) {
	this.permissionid = permissionid;
}
private int permissionid;
}
