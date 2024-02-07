/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.jaime.calculadora.ets;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author cfgs1dam
 */
public class CalculadoraEtsTest {
    
    public CalculadoraEtsTest() {
    }
   
    @BeforeAll
    public static void setUpClass() {
        System.out.println("Antes de todas las pruebas.");
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("Después de todas las pruebas.");
    }

    @BeforeEach
    public void setUp() throws Exception {
        System.out.println("Antes de cada prueba.");
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.out.println("Después de cada prueba.");
    }

    /**
     * Test of main method, of class CalculadoraEts.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalculadoraEts.main(args);
    }

    /**
     * Test of sumar method, of class CalculadoraEts.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 2;
        int b = 3;
        int expResult = 5;
        int result = CalculadoraEts.sumar(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of resta method, of class CalculadoraEts.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int a = 10;
        int b = 5;
        int expResult = 5;
        int result = CalculadoraEts.resta(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplicar method, of class CalculadoraEts.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 7;
        int b = 0;
        int expResult = 0;
        int result = CalculadoraEts.multiplicar(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of potencia method, of class CalculadoraEts.
     */
    @Test
    public void testPotenciaValida1() {
        System.out.println("potencia válida 1");
        int a = 3;
        int b = 2;
        int expResult = 9;
        int result = CalculadoraEts.potencia(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPotenciaValida2() {
        System.out.println("potencia válida 2");
        int a = -2;
        int b = 5;
        int expResult = -32;
        int result = CalculadoraEts.potencia(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPotenciaInvalida1() {
        System.out.println("potencia inválida 1");
        int a = 4;
        int b = -2;
        int expResult = 0;
        int result = CalculadoraEts.potencia(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPotenciaInvalida2() {
        System.out.println("potencia inválida 2");
        int a = -2;
        int b = -2;
        int expResult = 0;
        int result = CalculadoraEts.potencia(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPotenciaInvalida3() {
        System.out.println("potencia inválida 3");
        int a = 5;
        int b = -1;
        int expResult = 0;
        int result = CalculadoraEts.potencia(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPotenciaLimite1() {
        System.out.println("potencia limite 1");
        int a = 1;
        int b = 0;
        int expResult = 1;
        int result = CalculadoraEts.potencia(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPotenciaLimite2() {
        System.out.println("potencia limite 2");
        int a = 1;
        int b = 1;
        int expResult = 1;
        int result = CalculadoraEts.potencia(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPotenciaLimite3() {
        System.out.println("potencia limite 3");
        int a = -1;
        int b = 0;
        int expResult = 1;
        int result = CalculadoraEts.potencia(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPotenciaLimite4() {
        System.out.println("potencia limite 4");
        int a = -1;
        int b = 1;
        int expResult = -1;
        int result = CalculadoraEts.potencia(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPotenciaLimite5() {
        System.out.println("potencia limite 5");
        int a = 0;
        int b = 0;
        int expResult = 1;
        int result = CalculadoraEts.potencia(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPotenciaLimite6() {
        System.out.println("potencia limite 6");
        int a = 0;
        int b = 1;
        int expResult = 0;
        int result = CalculadoraEts.potencia(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of division method, of class CalculadoraEts.
     */
    @Test
    public void testDivision() throws Exception {
        System.out.println("division");
        int a = 10;
        int b = 2;
        int expResult = 5;
        int result = CalculadoraEts.division(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDivisionEntre0() {
        System.out.println("division Exception 0");
        int a = 10;
        int b = 0;
        Exception ex = assertThrows(Exception.class, ()->{
            CalculadoraEts.division(a, b);
        });
        assertEquals("Error. No se puede dividir entre 0.", ex.getMessage());
    }

    /**
     * Test of esPrimo method, of class CalculadoraEts.
     */
    @Test
    public void testEsPrimoNumeroMenor1() throws Exception {
        System.out.println("esPrimo menor de 1");
        int a = -5;
        Exception ex = assertThrows(Exception.class, ()->{
            CalculadoraEts.esPrimo(a);
        });
        assertEquals("Un número igual o menor a 1 no es primo, ni no primo, es inválido.", ex.getMessage());
    }
    
    @Test
    public void testEsPrimoNumeroMayor1True() throws Exception {
        System.out.println("esPrimo mayor de 1 true");
        int a = 3;
        boolean expResult = true;
        boolean result = CalculadoraEts.esPrimo(a);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsPrimoNumeroMayor1False() throws Exception {
        System.out.println("esPrimo mayor de 1 false");
        int a = 4;
        boolean expResult = false;
        boolean result = CalculadoraEts.esPrimo(a);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsPrimoNumero2() throws Exception {
        System.out.println("esPrimo 2");
        int a = 2;
        boolean expResult = true;
        boolean result = CalculadoraEts.esPrimo(a);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsPrimoNumero1() throws Exception {
        System.out.println("esPrimo 1");
        int a = 1;
        Exception ex = assertThrows(Exception.class, ()->{
            CalculadoraEts.esPrimo(a);
        });
        assertEquals("Un número igual o menor a 1 no es primo, ni no primo, es inválido.", ex.getMessage());
    }
    
    @Test
    public void testEsPrimoNumero0() throws Exception {
        System.out.println("esPrimo 0");
        int a = 0;
        Exception ex = assertThrows(Exception.class, ()->{
            CalculadoraEts.esPrimo(a);
        });
        assertEquals("Un número igual o menor a 1 no es primo, ni no primo, es inválido.", ex.getMessage());
    }
}
