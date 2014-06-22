/**
 * 
 */
package com.intelesant.exception;

/**
 * @author Rajashekar
 *
 */
public class AuthenticationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6720218188868911028L;

	public AuthenticationException(String message) {
		super(message);
	}
	
	public AuthenticationException(String message, Throwable t) {
		super(message, t);
	}
}
