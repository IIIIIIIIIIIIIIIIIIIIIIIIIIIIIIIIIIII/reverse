package it.sevenbits.packages.array.printer.implementation;
/**
 * Created my own exception
 */
public class OutputArrayException extends Exception {
    /**
     * Default constructor
     * @param message is our message
     * @param e
     */
    OutputArrayException(final String message, final Throwable e) {
        super(message, e);
    }
}
