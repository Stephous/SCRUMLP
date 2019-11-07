/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.shared;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author talend
 */
public class FieldVerifierTest {
    
    public FieldVerifierTest() {
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
     * Test of isValidName method, of class FieldVerifier.
     */
    @Test
    public void testIsValidNameOK() {
        System.out.println("isValidName");
        String name = "abc";
        boolean expResult = true;
        boolean result = FieldVerifier.isValidName(name);
        assertEquals(expResult, result);
    }
    /**
     * Test of isValidName method, of class FieldVerifier.
     */
    @Test
    public void testIsValidNameKO() {
        System.out.println("isValidName");
        String name = "";
        boolean expResult = false;
        boolean result = FieldVerifier.isValidName(name);
        assertEquals(expResult, result);
    }
    /**
     * Test of isValidName method, of class FieldVerifier.
     */
    @Test
    public void testIsValidNameNULL() {
        System.out.println("isValidName");
        String name = null;
        boolean expResult = false;
        boolean result = FieldVerifier.isValidName(name);
        assertEquals(expResult, result);
    }

    /**
     * Test of isValidDecimal method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDecimalOK() {
        System.out.println("isValidDecimal");
        Integer nbr = 1;
        boolean expResult = true;
        boolean result = FieldVerifier.isValidDecimal(nbr);
        assertEquals(expResult, result);
    }
    /**
     * Test of isValidDecimal method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDecimalNULL() {
        System.out.println("isValidDecimal");
        Integer nbr = null;
        boolean expResult = false;
        boolean result = FieldVerifier.isValidDecimal(nbr);
        assertEquals(expResult, result);
    }
    /**
     * Test of isValidDecimal method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDecimalNEG() {
        System.out.println("isValidDecimal");
        Integer nbr = -5;
        boolean expResult = false;
        boolean result = FieldVerifier.isValidDecimal(nbr);
        assertEquals(expResult, result);
    }
    

    /**
     * Test of isValidPourcentage method, of class FieldVerifier.
     */
    @Test
    public void testIsValidPourcentageOK() {
        System.out.println("isValidPourcentage");
        Integer nbr = 50;
        boolean expResult = true;
        boolean result = FieldVerifier.isValidPourcentage(nbr);
        assertEquals(expResult, result);
    }
    /**
     * Test of isValidPourcentage method, of class FieldVerifier.
     */
    @Test
    public void testIsValidPourcentagenull() {
        System.out.println("isValidPourcentage");
        Integer nbr = null;
        boolean expResult = false;
        boolean result = FieldVerifier.isValidPourcentage(nbr);
        assertEquals(expResult, result);
    }
    /**
     * Test of isValidPourcentage method, of class FieldVerifier.
     */
    @Test
    public void testIsValidPourcentageKOM() {
        System.out.println("isValidPourcentage");
        Integer nbr = -105;
        boolean expResult = false;
        boolean result = FieldVerifier.isValidPourcentage(nbr);
        assertEquals(expResult, result);
    }
    /**
     * Test of isValidPourcentage method, of class FieldVerifier.
     */
    @Test
    public void testIsValidPourcentageKOP() {
        System.out.println("isValidPourcentage");
        Integer nbr = 105;
        boolean expResult = false;
        boolean result = FieldVerifier.isValidPourcentage(nbr);
        assertEquals(expResult, result);
    }

    /**
     * Test of isValidDecimalAtoR method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDecimalAtoROK() {
        System.out.println("isValidDecimalAtoR");
        Integer nbr = 200;
        boolean expResult = true;
        boolean result = FieldVerifier.isValidDecimalAtoR(nbr);
        assertEquals(expResult, result);
    }
    /**
     * Test of isValidDecimalAtoR method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDecimalAtoRKO() {
        System.out.println("isValidDecimalAtoR");
        Integer nbr = 3000;
        boolean expResult = false;
        boolean result = FieldVerifier.isValidDecimalAtoR(nbr);
        assertEquals(expResult, result);
    }
    /**
     * Test of isValidDecimalAtoR method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDecimalAtoRKOP() {
        System.out.println("isValidDecimalAtoR");
        Integer nbr = 0;
        boolean expResult = false;
        boolean result = FieldVerifier.isValidDecimalAtoR(nbr);
        assertEquals(expResult, result);
    }
    /**
     * Test of isValidDecimalAtoR method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDecimalAtoRNull() {
        System.out.println("isValidDecimalAtoR");
        Integer nbr = null;
        boolean expResult = false;
        boolean result = FieldVerifier.isValidDecimalAtoR(nbr);
        assertEquals(expResult, result);
    }

    /**
     * Test of isValidRoman method, of class FieldVerifier.
     */
    @Test
    public void testIsValidRoman() {
        System.out.println("isValidRoman");
        String nbr = "";
        boolean expResult = true;
        boolean result = FieldVerifier.isValidRoman(nbr);
        assertEquals(expResult, result);
    }

    /**
     * Test of isValidDate method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDate() {
        System.out.println("isValidDate");
        String date = "";
        boolean expResult = true;
        boolean result = FieldVerifier.isValidDate(date);
        assertEquals(expResult, result);
    }
    
}
