package it.sevenbits.packages.array.container.implementation;

/**
 * My own exception class
 */
public class ArrayContainerException extends Exception {
    /**
     * @param message "Incoming argument is null"
     * @param e
     */
    public ArrayContainerException(final String message, final Throwable e) {
        super(message, e);
    }
}