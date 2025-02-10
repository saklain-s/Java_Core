/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class RectangleTest {
    
    public RectangleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getLength method, of class Rectangle.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        Rectangle instance = new Rectangle();
        double expResult = 0.0;
        double result = instance.getLength();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBreadth method, of class Rectangle.
     */
    @Test
    public void testGetBreadth() {
        System.out.println("getBreadth");
        Rectangle instance = new Rectangle();
        double expResult = 0.0;
        double result = instance.getBreadth();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLength method, of class Rectangle.
     */
    @Test
    public void testSetLength() {
        System.out.println("setLength");
        double l = 0.0;
        Rectangle instance = new Rectangle();
        instance.setLength(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBreadth method, of class Rectangle.
     */
    @Test
    public void testSetBreadth() {
        System.out.println("setBreadth");
        double b = 0.0;
        Rectangle instance = new Rectangle();
        instance.setBreadth(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of area method, of class Rectangle.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Rectangle instance = new Rectangle();
        double expResult = 0.0;
        double result = instance.area();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of perimeter method, of class Rectangle.
     */
    @Test
    public void testPerimeter() {
        System.out.println("perimeter");
        Rectangle instance = new Rectangle();
        double expResult = 0.0;
        double result = instance.perimeter();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSquare method, of class Rectangle.
     */
    @Test
    public void testIsSquare() {
        System.out.println("isSquare");
        Rectangle instance = new Rectangle();
        boolean expResult = false;
        boolean result = instance.isSquare();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
