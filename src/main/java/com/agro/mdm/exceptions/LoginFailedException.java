/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.agro.mdm.exceptions;

/**
 *
 * @author RAMU-VB
 */
public class LoginFailedException extends RuntimeException {

  

    public LoginFailedException(String message) {
        super(message);
    }

    public LoginFailedException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
