package com.capgemini.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Admin_data")
public class Admin_data implements Serializable {

	@Id
	@Column(name = "Admin_id")
	private Integer admin_id;
	@Column(name = "Mail_id")
	private String mail_id;
	@Column(name = "Full_name")
	private String full_name;
	@Column(name = "Password")
	private String password;
	public Integer getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(Integer admin_id) {
		this.admin_id = admin_id;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin_data [admin_id=" + admin_id + ", mail_id=" + mail_id + ", full_name=" + full_name + ", password="
				+ password + "]";
	}
	
}
