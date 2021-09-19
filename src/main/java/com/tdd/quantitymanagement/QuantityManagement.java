package com.tdd.quantitymanagement;

import java.util.Objects;

/**
 * Quantity Management
 */
public class QuantityManagement
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Quantity Management Program" );
    }
    public boolean compareInputLengths(InputLength s,InputLength s1) throws Exception {
        if(s.getValue().equals("") || s1.getValue().equals("")){
            throw new QuantityMeasurementException("Parameter value Null is provided", QuantityMeasurementException.ExceptionType.NULL_EXCEPTION);
        }
        if(!s.equals(s1)){
            throw new QuantityMeasurementException("Both Parameter references is not equal", QuantityMeasurementException.ExceptionType.REFERENCE_EXCEPTION);
        }
        return s.getValue().equals(s1.getValue());
    }

    public boolean compareInputLengths(InputLength s) throws Exception {
        if(Objects.equals(s.getValue(), "") || Objects.equals(s.getValue1(), "")){
            throw new QuantityMeasurementException("Parameter value Null is provided", QuantityMeasurementException.ExceptionType.NULL_EXCEPTION);
        }
        if(!s.getValue().equals(s.getValue1())){
            throw new QuantityMeasurementException("Both Parameter references is not equal", QuantityMeasurementException.ExceptionType.REFERENCE_EXCEPTION);
        }
        return s.getValue().equals(s.getValue1());
    }
}
