package com.amazon.kinesis.streaming.agent.extension;

/**
 * Created by myltik on 18/01/2016.
 */
public class DataConversionException extends Exception {

    public DataConversionException() {
    }

    public DataConversionException(String message) {
        super(message);
    }

    public DataConversionException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataConversionException(Throwable cause) {
        super(cause);
    }

    public DataConversionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
