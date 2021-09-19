package com.tdd.quantitymanagement;

/**
 * Quantity Management
 *
 */
public class QuantityManagement
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Quantity Management Program" );
    }

    public boolean compareInputLengths(String s, String s1) throws Exception {
        if(s.equals("") || s1.equals("")){
            throw new QuantityMeasurementException("Null Parameter value passed", QuantityMeasurementException.ExceptionType.NULL_EXCEPTION);
        }
        return s.equals(s1);
    }
}
