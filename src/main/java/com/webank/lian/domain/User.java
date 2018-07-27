package com.webank.lian.domain;

public class User {
    private Integer id;

    private String name;

    private String password;

    private String identification;

    private String phone;

    public User(Integer id, String name, String password, String identification, String phone) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.identification = identification;
        this.phone = phone;
    }

    public User() {
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

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}