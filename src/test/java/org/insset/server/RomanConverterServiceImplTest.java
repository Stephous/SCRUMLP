/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

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
public class RomanConverterServiceImplTest {
    
    public RomanConverterServiceImplTest() {
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
     * Test of convertDateYears method, of class RomanConverterServiceImpl.
    */
    @Test
    public void testConvertDateYears() {
        System.out.println("convertDateYears");
        String nbr = "";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "XV/III/MX";
        String result = instance.convertDateYears(nbr);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertRomanToArabe method, of class RomanConverterServiceImpl.
    */
    @Test
    public void testConvertRomanToArabe() {
        System.out.println("convertRomanToArabe");
        String nbr = "";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        Integer expResult = 3;
        Integer result = instance.convertRomanToArabe(nbr);
        assertEquals(expResult, result);
    }

    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRomanOK() {
        System.out.println("convertArabeToRoman");
        Integer nbr = 1234;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "MCCXXXIV";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
        
    }
    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRomanOKpetit() {
        System.out.println("convertArabeToRoman");
        Integer nbr = 123;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "CXXIII";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
        
    }
    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRomanOKpetitpetit() {
        System.out.println("convertArabeToRoman");
        Integer nbr = 12;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "XII";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
        
    }
    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRomanOKpetitpetitpetit() {
        System.out.println("convertArabeToRoman");
        Integer nbr = 1;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "I";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testConvertArabeToRomannull() {
        System.out.println("convertArabeToRoman");
        Integer nbr = null;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = null;
        try{
            String result = instance.convertArabeToRoman(nbr);
        }catch(NullPointerException e){
        
        assertTrue(true);
        }
        
    }
    
 
        
    
    
   
    
}
