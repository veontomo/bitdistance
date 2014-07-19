/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bitdistance;

import java.util.HashMap;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrea
 */
public class BitDistanceTest {
    public BitDistance b;
    public BitDistanceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        b = new BitDistance();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of markAsVisited method, of class BitDistance.
     */
    @Test
    public void testMarkAsVisitedIfExists() {
        System.out.println("mark existent node as visited");
        b.addNode("01010");
        b.addNode("01011");
        b.addNode("11010");
        b.markAsVisited(0);
        assertTrue(b.isVisited(0));
        assertFalse(b.isVisited(1));
        assertFalse(b.isVisited(2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testMarkAsVisitedIfNotExists() {
        System.out.println("mark non-existent node as visited");
        b.addNode("01010");
        b.markAsVisited(6);
    }
    
    @Test
    public void testMarkAsVisitedTwice() {
        System.out.println("mark node as visited twice");
        b.addNode("01010");
        b.addNode("01011");
        b.addNode("11010");
        b.markAsVisited(1);
        b.markAsVisited(1);
        assertTrue(b.isVisited(1));
        assertFalse(b.isVisited(0));
        assertFalse(b.isVisited(2));

    }



    /**
     * Test of getNodes method, of class BitDistance.
     */
 

    /**
     * Test of size method, of class BitDistance.
     */
    @Test
    public void testGetNumOfNodes() {
        System.out.println("get number of nodes");
        b.addNode("01010");
        b.addNode("01010");
        b.addNode("01010");
        b.addNode("01011");
        b.addNode("01111");
        assertTrue(b.size() == 5);
    }

    /**
     * Test of addNode method, of class BitDistance.
     */
    @Test
    public void testAddNode() {
        System.out.println("add nodes nodes");
        
        int pos = b.addNode("01010");
        assertTrue(pos == 0);
        assertEquals(b.getNode(0), "01010");
        assertTrue(b.size() == 1);

        int pos2 = b.addNode("0111");
        assertTrue(pos2 == 1);
        assertEquals(b.getNode(1), "0111");
        assertTrue(b.size() == 2);

        
    }

    /**
     * Test of main method, of class BitDistance.
     */

    
}
