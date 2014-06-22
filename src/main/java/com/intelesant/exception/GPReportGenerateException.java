/*
 * To change this template,  choose Tools | Templates
 * and open the template in the editor.
 */
package com.intelesant.exception;

/**
 * 
 * @author kishor
 */
public class GPReportGenerateException extends RuntimeException {

	/**
     *
     */
    public GPReportGenerateException() {

	}

	/**
     *
     * @param message
     */
    public GPReportGenerateException(String message) {
        super(message);
    }

    public GPReportGenerateException(String message, Throwable cause) {
        super(message, cause);
    }

}
