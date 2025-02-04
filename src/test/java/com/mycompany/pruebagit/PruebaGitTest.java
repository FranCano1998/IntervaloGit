/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pruebagit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class PruebaGitTest {
    
    public PruebaGitTest() {
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
     * Test of main method, of class PruebaGit.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PruebaGit.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Sumar method, of class PruebaGit.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        double a = 2;
        double b = 3;
        PruebaGit instance = new PruebaGit();
        double expResult = 5;
        double result = instance.Sumar(a, b);
        assertEquals(expResult, result);
       
    }
    
}
