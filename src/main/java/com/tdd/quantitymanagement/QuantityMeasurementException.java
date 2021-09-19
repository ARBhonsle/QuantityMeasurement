package com.tdd.quantitymanagement;

public class QuantityMeasurementException extends Exception{
    enum ExceptionType{
        NULL_EXCEPTION
    }
    ExceptionType exceptionType;
    public QuantityMeasurementException(String message,ExceptionType type){
        super(message);
        this.exceptionType=type;
    }
}
