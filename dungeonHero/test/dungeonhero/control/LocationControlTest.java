/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonhero.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dylan
 */
public class LocationControlTest {
    
    public LocationControlTest() {
    }

    /**
     * Test of getRandomRow method, of class LocationControl.
     */
    @Test
    public void testGetRandomRow() {
        System.out.println("getRandomRow");
        int row = 3;
        
        LocationControl instance = new LocationControl();
        
        int expResult = 1;
        int result = instance.getRandomRow(row);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        // test case 2
        System.out.println("\tTest case #2");
        
        row = -7;
        
        expResult = 4;
        
        result = instance.getRandomRow(row);
        
        assertEquals(expResult, result, 0.0);
        
        // test case 3
        System.out.println("\tTest case #3");
        
        row = 25;
        
        expResult = 3;
        
        result = instance.getRandomRow(row);
        
        assertEquals(expResult, result, 0.0);
        
        // bountry test 1
        System.out.println("\tTest case #4");
        
        row = 5;
        
        expResult = 3;
        
        result = instance.getRandomRow(row);
        
        assertEquals(expResult, result, 0.0);
        
        // boundry test 2
        System.out.println("\tTest case #5");
        
        row = 1;
        
        expResult = 4;
        
        result = instance.getRandomRow(row);
        
        assertEquals(expResult, result, 0.0);
    }
    
}
