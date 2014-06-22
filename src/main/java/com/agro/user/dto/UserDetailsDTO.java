/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agro.user.dto;

import java.io.Serializable;

/**
 *
 * @author ramulu
 */
public class UserDetailsDTO implements  Serializable{

    private String name;
    private String fatherName;
    private String age;
    private String address;

    public UserDetailsDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserDetailsDTO{" + "name=" + name + ", fatherName=" + fatherName + ", age=" + age + ", address=" + address + '}';
    }


}
