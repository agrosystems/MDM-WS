/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agro.mdm.login.controller;

import com.agro.mdm.login.service.LoginService;
import com.agro.mdm.userAccount.dto.UserAccountDTO;
import com.agro.user.dto.UserDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author RAMU-VB
 */
@Controller
@RequestMapping("/userLogin")
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/validateUser", method = RequestMethod.POST)
    @Transactional
    public @ResponseBody
    String addMessageToQueue(@RequestBody UserAccountDTO dTO) {
        System.out.println("::::::::::::::" + dTO.toString());
        return loginService.validateUser(dTO);
    }
}
