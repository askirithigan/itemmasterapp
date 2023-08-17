package com.telusko.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import jakarta.persistence.GenerationType;

@Entity
public class UserData {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int bank_code;
private String name;
private String branch;
private int account_no;
private char status;
public UserData(String name, String branch, int account_no, char status, float limit_amount, int gl_code) {
	super();
	this.name = name;
	this.branch = branch;
	this.account_no = account_no;
	this.status = status;
	this.limit_amount = limit_amount;
	this.gl_code = gl_code;
}
public int getBank_code() {
	return bank_code;
}
public String getName() {
	return name;
}
public String getBranch() {
	return branch;
}
public int getAccount_no() {
	return account_no;
}
public char getStatus() {
	return status;
}
public float getLimit_amount() {
	return limit_amount;
}
public int getGl_code() {
	return gl_code;
}
public void setBank_code(int bank_code) {
	this.bank_code = bank_code;
}
public void setName(String name) {
	this.name = name;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public void setAccount_no(int account_no) {
	this.account_no = account_no;
}
public void setStatus(char status) {
	this.status = status;
}
public void setLimit_amount(float limit_amount) {
	this.limit_amount = limit_amount;
}
public void setGl_code(int gl_code) {
	this.gl_code = gl_code;
}
private float limit_amount;
private int gl_code;
}
