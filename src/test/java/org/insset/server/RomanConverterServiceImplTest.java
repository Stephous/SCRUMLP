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
     
    @Test
    public void testConvertDateYears() {
        System.out.println("convertDateYears");
        String nbr = "";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "";
        String result = instance.convertDateYears(nbr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of convertRomanToArabe method, of class RomanConverterServiceImpl.
     
    @Test
    public void testConvertRomanToArabe() {
        System.out.println("convertRomanToArabe");
        String nbr = "";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        Integer expResult = null;
        Integer result = instance.convertRomanToArabe(nbr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRomanOK4() {
        //given
        Integer nbr = 1234;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "MCCXXXIV";
        
        //when
        String result = instance.convertArabeToRoman(nbr);
        
        //then
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testConvertArabeToRomanOK3() {
        //given
        Integer nbr = 123;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "CXXIII";
        
        //when
        String result = instance.convertArabeToRoman(nbr);
        
        //then
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testConvertArabeToRomanOK2() {
        //given
        Integer nbr = 12;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "XII";
        
        //when
        String result = instance.convertArabeToRoman(nbr);
        
        //then
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testConvertArabeToRomanOK1() {
        //given
        Integer nbr = 1;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "I";
        
        //when
        String result = instance.convertArabeToRoman(nbr);
        
        //then
        assertEquals(expResult, result);
        
    }
    
    
    @Test
    public void testConvertArabeToRomannull() {
        //given
        Integer nbr = null;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        
        
        //when
        String expResult = null;
        try{
            String result = instance.convertArabeToRoman(nbr);
        }catch(NullPointerException e){
        //then
        assertTrue(true);
        }
        
    }
    
 @Test
    public void testConvertDateYear() {
        //given
        String nbr = "123";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "XV/III/MX";
        
        //when
        String result = instance.convertDateYears(nbr);
        
        //then
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testConvertRomanToArabe() {
        //given
        String nbr = "123";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        Integer expResult = 3;
        
        //when
        Integer result = instance.convertRomanToArabe(nbr);
        
        //then
        assertEquals(expResult, result);
        
    }
        
    
    
   
    
}
