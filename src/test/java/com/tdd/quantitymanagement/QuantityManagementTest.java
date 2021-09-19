package com.tdd.quantitymanagement;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple QuantityManagement.
 */
public class QuantityManagementTest
{
    QuantityManagement measure = new QuantityManagement();
    @Test
    public void givenParametersIfEqual_shouldAnswerWithTrue()
    {
        assertTrue( measure.compareInputLengths("0ft","0ft"));
    }
}
