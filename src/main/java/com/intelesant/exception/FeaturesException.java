/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intelesant.exception;

/**
 *
 * @author ramulu
 */
public class FeaturesException extends RuntimeException {

    public FeaturesException(String message) {
        super(message);
    }

    public FeaturesException(String message, Throwable cause) {
        super(message, cause);
    }

}
