/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rob
 */
public class LocationControlTest {
    
    public LocationControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getRandomRow method, of class LocationControl.
     */
    @Test
    public void testGetRandomRow() {
        System.out.println("getRandomRow");
        int row = 5;
        LocationControl instance = new LocationControl();
        double expResult = 3;
        double result = instance.getRandomRow(row);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
