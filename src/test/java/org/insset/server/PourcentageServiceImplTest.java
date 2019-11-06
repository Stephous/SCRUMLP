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
public class PourcentageServiceImplTest {
    
    public PourcentageServiceImplTest() {
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
     * Test of NewValue method, of class PourcentageServiceImpl.
     */
    @Test
    public void testNewValueOK() {
        //given
        Integer nbr = 100;
        Integer pc = 20;
        PourcentageServiceImpl instance = new PourcentageServiceImpl();
        Integer expResult = 80;
        
        //when
        Integer result = instance.NewValue(nbr, pc);
        
        //then
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNewValueOKNeg() {
        //given
        Integer nbr = 100;
        Integer pc = -20;
        PourcentageServiceImpl instance = new PourcentageServiceImpl();
        Integer expResult = 120;
        
        //when
        Integer result = instance.NewValue(nbr, pc);
        
        //then
        assertEquals(expResult, result);
    }
    
    @Test
    public void testNewValueNULL() {
        //given
        Integer nbr = null;
        Integer pc = null;
        PourcentageServiceImpl instance = new PourcentageServiceImpl();
        Integer expResult = null;
        
        //when
        //then
        try{
        Integer result = instance.NewValue(nbr, pc);
        }catch (NullPointerException e){
            assertTrue(true);
        }
    }

    /**
     * Test of PreValue method, of class PourcentageServiceImpl.
     */
    @Test
    public void testPreValueOK() {
        //given
        Integer nbr = 100;
        Integer pc = 20;
        PourcentageServiceImpl instance = new PourcentageServiceImpl();
        Integer expResult = 120;
        
        //when
        Integer result = instance.PreValue(nbr, pc);
        
        //then
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPreValueOKneg() {
        //given
        Integer nbr = 100;
        Integer pc = -20;
        PourcentageServiceImpl instance = new PourcentageServiceImpl();
        Integer expResult = 80;
        
        //when
        Integer result = instance.PreValue(nbr, pc);
        
        //then
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPreValueNULL() {
        //given
        Integer nbr = null;
        Integer pc = null;
        PourcentageServiceImpl instance = new PourcentageServiceImpl();
        Integer expResult = null;
        
        //when
        //then
        try{
        Integer result = instance.PreValue(nbr, pc);
        }catch (NullPointerException e){
            assertTrue(true);
        }
    }
    
}
