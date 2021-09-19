package com.tdd.quantitymanagement;

public class QuantityMeasurementException extends Exception{
    enum ExceptionType{
        NULL_EXCEPTION,REFERENCE_EXCEPTION,TYPE_EXCEPTION
    }
    ExceptionType exceptionType;
    public QuantityMeasurementException(String message,ExceptionType type){
        super(message);
        this.exceptionType=type;
    }
}
