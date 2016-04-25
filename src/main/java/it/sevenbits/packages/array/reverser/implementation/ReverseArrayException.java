package it.sevenbits.packages.array.reverser.implementation;

/**
 * ReverseArrayException
 */
public class ReverseArrayException extends Exception {
    /**
     * Default constructor
     * @param message is our message
     * @param e
     */
    ReverseArrayException(final String message, final Throwable e) {
        super(message, e);
    }
}
