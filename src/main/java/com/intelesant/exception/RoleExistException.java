/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intelesant.exception;

/**
 *
 * @author kishor
 */
public class RoleExistException extends RuntimeException{
    
    public RoleExistException() {

	}

	/**
     *
     * @param message
     */
    public RoleExistException(String message) {
		super(message);
	}
}
