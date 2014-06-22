/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agro.mdm.login.service;

import com.agro.mdm.exceptions.LoginFailedException;
import com.agro.mdm.userAccount.dto.UserAccountDTO;
import org.springframework.stereotype.Service;

/**
 *
 * @author RAMU-VB
 */
@Service("loginService")
public class LoginService {

    public String validateUser(UserAccountDTO accountDTO) {
        if (accountDTO.getUserName().equals("user") && accountDTO.getPassword().equals("password")) {
            return "SUCCESS";
        } else {
            throw new LoginFailedException("LoginFailedException");
        }
    }
}
