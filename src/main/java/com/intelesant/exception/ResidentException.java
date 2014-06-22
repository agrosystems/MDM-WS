/*
 * To change this template,  choose Tools | Templates
 * and open the template in the editor.
 */
package com.intelesant.exception;

/**
 * 
 * @author kishor
 */
public class ResidentException extends RuntimeException {

	/**
     *
     */
    public ResidentException() {

	}

	/**
     *
     * @param message
     */
    public ResidentException(String message) {
        super(message);
    }

    public ResidentException(String message, Throwable cause) {
        super(message, cause);
    }

}
