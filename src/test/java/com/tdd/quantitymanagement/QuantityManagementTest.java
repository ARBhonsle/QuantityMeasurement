package com.tdd.quantitymanagement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple QuantityManagement.
 */
public class QuantityManagementTest
{
    QuantityManagement measure = new QuantityManagement();

    // checks if given parameters are equal
    @Test
    public void givenParametersIfEqual_shouldAnswerWithTrue() throws Exception {
        try {
            assertTrue(measure.compareInputLengths("0ft", "0ft"));
        } catch (QuantityMeasurementException e){
            e.printStackTrace();
        }
    }
    // checks if both of given parameters are null
    @Test
    public void givenBothParametersAsNull_shouldThrowsNullException() throws Exception {
        try{
            assertTrue(measure.compareInputLengths("",""));
        }catch (QuantityMeasurementException e){
            assertEquals(QuantityMeasurementException.ExceptionType.NULL_EXCEPTION,e.exceptionType);
        }
    }
    // checks if any one of given parameters is null
    @Test
    public void givenOneParameterAsNull_shouldThrowsNullException() throws Exception {
        try{
            assertTrue(measure.compareInputLengths("0ft",""));
        }catch (QuantityMeasurementException e){
            assertEquals(QuantityMeasurementException.ExceptionType.NULL_EXCEPTION,e.exceptionType);
        }
        try{
            assertTrue(measure.compareInputLengths("","0ft"));
        }catch (QuantityMeasurementException e){
            assertEquals(QuantityMeasurementException.ExceptionType.NULL_EXCEPTION,e.exceptionType);
        }
    }
}
