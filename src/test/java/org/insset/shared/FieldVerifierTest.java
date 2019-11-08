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
    public void testIsValidNameKOEmpty() {
        //given
        String name = "";
        boolean expResult = false;
        
        //when
        boolean result = FieldVerifier.isValidName(name);
        
        //then
        assertEquals(expResult, result);

    }
    
    @Test
    public void testIsValidNameOK() {
        //given
        String name = "a";
        boolean expResult = true;
        
        //when
        boolean result = FieldVerifier.isValidName(name);
        
        //then
        assertEquals(expResult, result);

    }
    
    @Test
    public void testIsValidNameKONull() {
        //given
        String name = null;
        boolean expResult = false;
        
        //when
        boolean result = FieldVerifier.isValidName(name);
        
        //then
        assertEquals(expResult, result);

    }
    

    /**
     * Test of isValidDecimal method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDecimalKONull() {
        //given
        Integer nbr = null;
        boolean expResult = false;
        
        //when
        boolean result = FieldVerifier.isValidDecimal(nbr);
        
        //then
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidDecimalKON() {
        //given
        Integer nbr = -1;
        boolean expResult = false;
        
        //when
        boolean result = FieldVerifier.isValidDecimal(nbr);
        
        //then
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testIsValidDecimalOK() {
        //given
        Integer nbr = 1;
        boolean expResult = true;
        
        //when
        boolean result = FieldVerifier.isValidDecimal(nbr);
        
        //then
        assertEquals(expResult, result);
    }

    /**
     * Test of isValidPourcentage method, of class FieldVerifier.
     */
    @Test
    public void testIsValidPourcentageKONull() {
        //given
        Integer nbr = null;
        boolean expResult = false;
        
        //when
        boolean result = FieldVerifier.isValidPourcentage(nbr);
        
        //then
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidPourcentageKONeg() {
        //given
        Integer nbr = -101;
        boolean expResult = false;
        
        //when
        boolean result = FieldVerifier.isValidPourcentage(nbr);
        
        //then
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidPourcentageKOPos() {
        //given
        Integer nbr = 101;
        boolean expResult = false;
        
        //when
        boolean result = FieldVerifier.isValidPourcentage(nbr);
        
        //then
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsValidPourcentageOK() {
        //given
        Integer nbr = 0;
        boolean expResult = true;
        
        //when
        boolean result = FieldVerifier.isValidPourcentage(nbr);
        
        //then
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of isValidDecimalAtoR method, of class FieldVerifier.
     */
    @Test
    public void testIsValidDecimalAtoRKONull() {
        //given
        Integer nbr = null;
        boolean expResult = false;
        
        //when
        boolean result = FieldVerifier.isValidDecimalAtoR(nbr);
        
        //then
        assertEquals(expResult, result);

    }
    
    @Test
    public void testIsValidDecimalAtoRKON() {
        //given
        Integer nbr = 0;
        boolean expResult = false;
        
        //when
        boolean result = FieldVerifier.isValidDecimalAtoR(nbr);
        
        //then
        assertEquals(expResult, result);

    }
    
    @Test
    public void testIsValidDecimalAtoRKOP() {
        //given
        Integer nbr = 2000;
        boolean expResult = false;
        
        //when
        boolean result = FieldVerifier.isValidDecimalAtoR(nbr);
        
        //then
        assertEquals(expResult, result);

    }
    
    @Test
    public void testIsValidDecimalAtoROK() {
        //given
        Integer nbr = 1;
        boolean expResult = true;
        
        //when
        boolean result = FieldVerifier.isValidDecimalAtoR(nbr);
        
        //then
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
