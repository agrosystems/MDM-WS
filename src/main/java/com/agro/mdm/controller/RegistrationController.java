/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agro.mdm.controller;

import com.agro.user.dto.UserDetailsDTO;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ramesh
 */
@Controller
@RequestMapping("/user")
public class RegistrationController {

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @Transactional
    public @ResponseBody
    String addMessageToQueue(@RequestBody UserDetailsDTO dTO) {
        System.out.println("::::::::::::::"+dTO);
        return dTO.toString();

    }
}
