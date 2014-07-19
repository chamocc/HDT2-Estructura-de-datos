/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ed. Chamo
 */
public class StackVectorTest {
    
    public StackVectorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of push method, of class StackVector.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object item = null;
        StackVector instance = new StackVector();
        instance.push(item);
        boolean val=false;
        if(instance.size()==1)
            val=true;
        assertTrue(val);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of pop method, of class StackVector.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackVector instance = new StackVector();
        Object expResult = null;
        Object result = instance.pop();
        boolean val1=false;
        boolean val2=false;
        if(result == null){
            val1=true;
        }
        Object item=3;
        instance.push(item);
        result= instance.pop();
        if(result==item && instance.empty()==true){
            val2=true;
        }
        assertTrue(val1 && val2);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of peek method, of class StackVector.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        StackVector instance = new StackVector();
        Object item=null;
        instance.push(item);
        boolean val=false;
        if(instance.peek()==item && instance.size()==1){
            val=true;
        }
        assertTrue(val);
        

    }

    /**
     * Test of empty method, of class StackVector.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        StackVector instance = new StackVector();
        boolean expResult = true;
        boolean result = instance.empty();
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class StackVector.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        StackVector instance = new StackVector();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }
    
}
