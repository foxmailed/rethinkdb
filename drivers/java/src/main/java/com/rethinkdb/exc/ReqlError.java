// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../templates/Exception.java
package com.rethinkdb;

public class ReqlError extends RuntimeException {
    public ReqlError() {}

    public ReqlError(String message) {
        super(message);
    }

    public ReqlError(String message, Throwable cause) {
        super(message, cause);
    }

    public ReqlError(Throwable cause) {
        super(cause);
    }
}