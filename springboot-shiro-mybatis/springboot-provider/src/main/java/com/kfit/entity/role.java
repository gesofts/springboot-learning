package com.kfit.entity;

import java.io.Serializable;

public class role implements Serializable{
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
private String role;

}
