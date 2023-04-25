package com.example.whatsappdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity


public class Student {
   @Id
	private int id;
	private String name;
	private int regno;
	private String place;
	private String grade;
	private int mark;
	private String remark;
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRegno() {
	return regno;
}
public void setRegno(int regno) {
	this.regno = regno;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public int getMark() {
	return mark;
}
public void setMark(int mark) {
	this.mark = mark;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}
public void setId(int id) {
	this.id = id;
}
}
