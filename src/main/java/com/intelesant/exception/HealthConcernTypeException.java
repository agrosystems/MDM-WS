/*
 * To change this template,  choose Tools | Templates
 * and open the template in the editor.
 */
package com.intelesant.exception;

/**
 *
 * @author kishor
 */
public class HealthConcernTypeException extends RuntimeException {

    /**
     *
     */
    public HealthConcernTypeException() {

    }

    /**
     *
     * @param message
     */
    public HealthConcernTypeException(String message) {
        super(message);
    }

    public HealthConcernTypeException(String message, Throwable cause) {
        super(message, cause);
    }

}
