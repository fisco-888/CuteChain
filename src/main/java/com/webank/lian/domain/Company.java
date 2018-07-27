package com.webank.lian.domain;

public class Company {
	private Integer id;
	
	private String name;
	
	private String password;
	
	private String address;
	
	private String identitication;
	
	public Company(Integer id, String name, String password, String address, String identitication) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.address = address;
		this.identitication = identitication;
	}
	
	public Company() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getIdentitication() {
		return identitication;
	}
	
	public void setIdentitication(String identitication) {
		this.identitication = identitication;
	}
}