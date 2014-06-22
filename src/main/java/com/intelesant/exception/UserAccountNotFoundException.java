/*
 * To change this template,  choose Tools | Templates
 * and open the template in the editor.
 */
package com.intelesant.exception;

/**
 * 
 * @author kishor
 */
public class UserAccountNotFoundException extends Exception {

	/**
     *
     * @param message
     */
    public UserAccountNotFoundException(String message) {
		super(message);
	}

	/**
     *
     * @param message
     * @param t
     */
    public UserAccountNotFoundException(String message, Throwable t) {
		super(message, t);
	}
}
