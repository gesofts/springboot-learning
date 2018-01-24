package com.kfit.entity;

import java.io.Serializable;

public class permission implements Serializable{
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPermission() {
	return permission;
}
public void setPermission(String permission) {
	this.permission = permission;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
private String permission;
private String url;
}
