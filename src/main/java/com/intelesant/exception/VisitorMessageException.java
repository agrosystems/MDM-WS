/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intelesant.exception;

/**
 *
 * @author kishor
 */
public class VisitorMessageException extends RuntimeException {

    public VisitorMessageException() {
    }

    public VisitorMessageException(String message) {
        super(message);
    }

    public VisitorMessageException(String message, Throwable cause) {
        super(message, cause);
    }

}
