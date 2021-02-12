/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Propietario
 */
public class EjerciciosNivel1Test {
    
    public EjerciciosNivel1Test() {
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
     * Test of maximo method, of class EjerciciosNivel1.
     */
//    @Test
//    public void testMaximo() {
//        System.out.println("maximo");
//        int[] lista = null;
//        EjerciciosNivel1 instance = new EjerciciosNivel1();
//        int expResult = 0;
//        int result = instance.maximo(lista);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of palindromo method, of class EjerciciosNivel1.
     */
    @Test
    public void testPalindromo() {
        System.out.println("palindromo");
        
        EjerciciosNivel1 instance = new EjerciciosNivel1();
        
       
        assertEquals(true, instance.palindromo("Acaso hubo buhos aca"));
        assertEquals(true, instance.palindromo("Aca"));
        assertEquals(true, instance.palindromo("Allí ves a Sevilla"));
        assertEquals(false, instance.palindromo("ligar es agil"));
        
        
        
       
       
    }

    /**
     * Test of esIsograma method, of class EjerciciosNivel1.
     */
    @Test
    public void testEsIsograma() {
        System.out.println("esIsograma");
        EjerciciosNivel1 instance = new EjerciciosNivel1();
 
        assertEquals(true, instance.esIsograma("murcielago"));
        assertEquals(false,instance.esIsograma("cocreta"));
        assertEquals(false,instance.esIsograma("casa"));
        assertEquals(false,instance.esIsograma("supercalifragilisticoespiadiloso"));
        assertEquals(false,instance.esIsograma("Cocreta"));
        assertEquals(false,instance.esIsograma("isódroma"));
        assertEquals(true,instance.esIsograma("pita"));
        assertEquals(false,instance.esIsograma("pájaro"));
        assertEquals(true, instance.esIsograma("MURCIELAGO"));
        assertEquals(false,instance.esIsograma("COCRETA"));
        assertEquals(true, instance.esIsograma("CETYS"));
        assertEquals(true, instance.esIsograma("UFV"));
       
    }

    /**
     * Test of main method, of class EjerciciosNivel1.
     */
   

    /**
     * Test of quitaEspaciosEnBlanco method, of class EjerciciosNivel1.
     */
//    @Test
//    public void testQuitaEspaciosEnBlanco() {
//        System.out.println("quitaEspaciosEnBlanco");
//        String cadena = "";
//        EjerciciosNivel1 instance = new EjerciciosNivel1();
//        String expResult = "";
//        String result = instance.quitaEspaciosEnBlanco(cadena);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of quitaAcentoss method, of class EjerciciosNivel1.
     */
    @Test
    public void testQuitaAcentoss() {
        System.out.println("quitaAcentoss");
        EjerciciosNivel1 instance = new EjerciciosNivel1();
     
        
        
        assertEquals("pajaro", instance.quitaAcentoss("pájaro"));
        assertEquals("Andele", instance.quitaAcentoss("Ándele"));
        assertEquals("Cigueña", instance.quitaAcentoss("Cigüeña"));
        assertEquals("perro", instance.quitaAcentoss("perro"));
        assertEquals("pajaro", instance.quitaAcentoss("pájáró"));
        assertEquals("pristino", instance.quitaAcentoss("prístino"));
        assertEquals("murcielago", instance.quitaAcentoss("murciélago"));
        assertEquals("atun", instance.quitaAcentoss("atún"));
        assertEquals("camion", instance.quitaAcentoss("camión"));
        assertEquals("PAJARO", instance.quitaAcentoss("PÁJÁRÓ"));
        assertEquals("PRISTINO", instance.quitaAcentoss("PRÍSTINO"));
        assertEquals("MURCIELAGO", instance.quitaAcentoss("MURCIÉLAGO"));
        assertEquals("ATUN", instance.quitaAcentoss("ATÚN"));
        assertEquals("CAMION", instance.quitaAcentoss("CAMIÓN"));
       
    }

    /**
     * Test of quitaAcentosV2 method, of class EjerciciosNivel1.
     */
    @Test
    public void testQuitaAcentosV2() {
        System.out.println("quitaAcentosV2");
     
        EjerciciosNivel1 instance = new EjerciciosNivel1();
        
        
        assertEquals("pajaro", instance.quitaAcentosV2("pájaro"));
        assertEquals("Andele", instance.quitaAcentosV2("Ándele"));
        assertEquals("Cigueña", instance.quitaAcentosV2("Cigüeña"));
        assertEquals("perro", instance.quitaAcentosV2("perro"));
        assertEquals("pajaro", instance.quitaAcentosV2("pájáró"));
        assertEquals("pristino", instance.quitaAcentosV2("prístino"));
        assertEquals("murcielago", instance.quitaAcentosV2("murciélago"));
        assertEquals("atun", instance.quitaAcentosV2("atún"));
        assertEquals("camion", instance.quitaAcentosV2("camión"));
        assertEquals("PAJARO", instance.quitaAcentosV2("PÁJÁRÓ"));
        assertEquals("PRISTINO", instance.quitaAcentosV2("PRÍSTINO"));
        assertEquals("MURCIELAGO", instance.quitaAcentosV2("MURCIÉLAGO"));
        assertEquals("ATUN", instance.quitaAcentosV2("ATÚN"));
        assertEquals("CAMION", instance.quitaAcentosV2("CAMIÓN"));
    }

    /**
     * Test of maximo method, of class EjerciciosNivel1.
     */
//    @Test
//    public void testMaximo() {
//        System.out.println("maximo");
//        int[] lista = null;
//        EjerciciosNivel1 instance = new EjerciciosNivel1();
//        int expResult = 0;
//        int result = instance.maximo(lista);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of quitaEspaciosEnBlanco method, of class EjerciciosNivel1.
     */
//    @Test
//    public void testQuitaEspaciosEnBlanco() {
//        System.out.println("quitaEspaciosEnBlanco");
//        String cadena = "";
//        EjerciciosNivel1 instance = new EjerciciosNivel1();
//        String expResult = "";
//        String result = instance.quitaEspaciosEnBlanco(cadena);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of divideFrase method, of class EjerciciosNivel1.
     */
//    @Test
//    public void testDivideFrase() {
//        System.out.println("divideFrase");
//        String frase = "";
//        EjerciciosNivel1 instance = new EjerciciosNivel1();
//        String[] expResult = null;
//        String[] result = instance.divideFrase(frase);
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

   

    /**
     * Test of acronimo method, of class EjerciciosNivel1.
     */
    @Test
    public void testAcronimo() {
        System.out.println("acronimo");
        EjerciciosNivel1 instance = new EjerciciosNivel1();
   

        assertEquals("AVE", instance.acronimo("Alta Velocidad Española"));
        assertEquals("CETS", instance.acronimo("Centro de Estududios Tecnológicos y Sociales"));
        assertEquals("UFV", instance.acronimo("Universidad Francisco de Vitoria"));
        assertEquals("ITV", instance.acronimo("Inspeccion tecnica de vehiculo"));
        assertEquals("OTAN", instance.acronimo("organizaciondel tratado  atlantico norte"));
        assertEquals("ACNUR", instance.acronimo("alto comisionado de las naciones  unidas de refugiado"));


       
    }

    /**
     * Test of maximo method, of class EjerciciosNivel1.
     */
//    @Test
//    public void testMaximo() {
//        System.out.println("maximo");
//        int[] lista = null;
//        EjerciciosNivel1 instance = new EjerciciosNivel1();
//        int expResult = 0;
//        int result = instance.maximo(lista);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of quitaEspaciosEnBlanco method, of class EjerciciosNivel1.
     */
//    @Test
//    public void testQuitaEspaciosEnBlanco() {
//        System.out.println("quitaEspaciosEnBlanco");
//        String cadena = "";
//        EjerciciosNivel1 instance = new EjerciciosNivel1();
//        String expResult = "";
//        String result = instance.quitaEspaciosEnBlanco(cadena);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of divideFrase method, of class EjerciciosNivel1.
     */
//    @Test
//    public void testDivideFrase() {
//        System.out.println("divideFrase");
//        String frase = "";
//        EjerciciosNivel1 instance = new EjerciciosNivel1();
//        String[] expResult = null;
//        String[] result = instance.divideFrase(frase);
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of esAnagrama method, of class EjerciciosNivel1.
     */
    @Test
    public void testEsAnagrama() {
        System.out.println("esAnagrama");
        EjerciciosNivel1 instance = new EjerciciosNivel1();
        
        
        
        assertEquals(true, instance.esAnagrama("amor", "roma"));
        assertEquals(true, instance.esAnagrama("Claudia", "licuada"));
        assertEquals(false, instance.esAnagrama("", ""));
     
   
        assertEquals(true, instance.esAnagrama("Helios", "hielos"));
        assertEquals(true, instance.esAnagrama("Nacionalista ", "Altisonancia"));
        assertEquals(false, instance.esAnagrama("kike", "aprobado"));
        
        
    }

 
    
}
