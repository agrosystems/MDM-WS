/*
 * To change this template,  choose Tools | Templates
 * and open the template in the editor.
 */
package com.intelesant.exception;

/**
 * 
 * @author kishor
 */
public class ContactInfoEncryptionException extends RuntimeException {

	/**
     *
     */
    public ContactInfoEncryptionException() {

	}

	/**
     *
     * @param message
     */
    public ContactInfoEncryptionException(String message) {
        super(message);
    }

    public ContactInfoEncryptionException(String message, Throwable cause) {
        super(message, cause);
    }

}
