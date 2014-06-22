/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intelesant.exception;

/**
 *
 * @author kishor
 */
public class AlbumAlreadyExistException extends RuntimeException {

    public AlbumAlreadyExistException() {
    }

    public AlbumAlreadyExistException(String message) {
        super(message);
    }
}
