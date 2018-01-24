package com.kfit.entity;

import java.io.Serializable;

public class userrole implements Serializable {
private int uid;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public int getRoleid() {
	return roleid;
}
public void setRoleid(int roleid) {
	this.roleid = roleid;
}
private int roleid;

}
