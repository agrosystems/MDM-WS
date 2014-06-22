/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.agro.mdm.userAccount.dto;

import java.io.Serializable;

/**
 *
 * @author RAMU-VB
 */
public class UserAccountDTO implements Serializable{
    private String userId;
    private String userName;
    private String password;
    private Boolean active;
    private Integer numberOfAttempts;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getNumberOfAttempts() {
        return numberOfAttempts;
    }

    public void setNumberOfAttempts(Integer numberOfAttempts) {
        this.numberOfAttempts = numberOfAttempts;
    }
    
}
