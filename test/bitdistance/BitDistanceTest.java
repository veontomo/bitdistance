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
     * Test of getVisitedNodes method, of class BitDistance.
     */
    @Test
    public void testGetVisitedNodes() {
        System.out.println("get visited nodes");
        
    }

    /**
     * Test of isVisited method, of class BitDistance.
     */
    @Test
    public void testIsVisited() {
        System.out.println("isVisited");
        int n = 0;
        BitDistance instance = new BitDistance();
        boolean expResult = false;
        boolean result = instance.isVisited(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of markAsVisited method, of class BitDistance.
     */
    @Test
    public void testMarkAsVisited() {
        System.out.println("markAsVisited");
        int n = 0;
        BitDistance instance = new BitDistance();
        instance.markAsVisited(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNodes method, of class BitDistance.
     */
    @Test
    public void testGetNodes() {
        System.out.println("getNodes");
        BitDistance instance = new BitDistance();
        HashMap<Integer, String> expResult = null;
        HashMap<Integer, String> result = instance.getNodes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfNodes method, of class BitDistance.
     */
    @Test
    public void testGetNumOfNodes() {
        System.out.println("getNumOfNodes");
        BitDistance instance = new BitDistance();
        int expResult = 0;
        int result = instance.getNumOfNodes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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

        int pos2 = b.addNode("0111");
        assertTrue(pos == 1);
        assertEquals(b.getNode(0), "0111");

        
    }

    /**
     * Test of main method, of class BitDistance.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BitDistance.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
