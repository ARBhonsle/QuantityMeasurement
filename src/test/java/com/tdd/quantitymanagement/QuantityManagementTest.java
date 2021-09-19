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
            InputLength length = new InputLength("0 ft");
            InputLength length1 = new InputLength("0 ft");
            assertTrue(measure.compareInputLengths(length,length1));
        } catch (QuantityMeasurementException e){
            e.printStackTrace();
        }
    }
    // checks if both of given parameters are null
    @Test
    public void givenBothParametersAsNull_shouldThrowsNullException() throws Exception {
        try{
            InputLength length = new InputLength("");
            InputLength length1 = new InputLength("");
            assertTrue(measure.compareInputLengths(length,length1));
        }catch (QuantityMeasurementException e){
            assertEquals(QuantityMeasurementException.ExceptionType.NULL_EXCEPTION,e.exceptionType);
        }
    }
    // checks if any one of given parameters is null
    @Test
    public void givenOneParameterAsNull_shouldThrowsNullException() throws Exception {
        try{
            InputLength length = new InputLength("0 ft");
            InputLength length1 = new InputLength("");
            assertTrue(measure.compareInputLengths(length,length1));
        }catch (QuantityMeasurementException e){
            assertEquals(QuantityMeasurementException.ExceptionType.NULL_EXCEPTION,e.exceptionType);
        }
        try{
            InputLength length = new InputLength("");
            InputLength length1 = new InputLength("0 ft");
            assertTrue(measure.compareInputLengths(length,length1));
        }catch (QuantityMeasurementException e){
            assertEquals(QuantityMeasurementException.ExceptionType.NULL_EXCEPTION,e.exceptionType);
        }
    }
    // Checks if reference of parameters passed is equal
    @Test
    public void givenTwoParameters_ChecksReference_shouldReturnReferenceException() throws Exception{
        try{
            InputLength length = new InputLength("0 ft");
            InputLength length1 = new InputLength("0 ft");
            assertTrue(measure.compareInputLengths(length,length1));
        } catch (QuantityMeasurementException e){
            assertEquals(QuantityMeasurementException.ExceptionType.REFERENCE_EXCEPTION,e.exceptionType);
        }
    }
    // checks if same parameter passed for both parameters
    @Test
    public void givenParameter_ChecksReference_shouldReturnTrue() throws Exception{
        try{
            InputLength length = new InputLength("0 ft");
            assertTrue(measure.compareInputLengths(length,length));
        } catch (QuantityMeasurementException e){
            assertEquals(QuantityMeasurementException.ExceptionType.REFERENCE_EXCEPTION,e.exceptionType);
        }
    }
    //
    @Test
    public void givenInputLength_checksReference_shouldReturnTrue() throws Exception{
        try{
            InputLength input = new InputLength();
            input.setLength("0 ft");
            input.setLength1("0 ft");
            assertTrue(measure.compareInputLengths(input));
        } catch (QuantityMeasurementException e){
            assertEquals(QuantityMeasurementException.ExceptionType.REFERENCE_EXCEPTION,e.exceptionType);
        }
    }
}
