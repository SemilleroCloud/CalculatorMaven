package junit5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach //Se ejecuta antes de cada metodo
    public void setUp(){
        this.calculadora = new Calculator();
        System.out.println("@BeforeEach -> setUp");
    }

    @AfterEach //Se ejecuta despues de cada metodo
    public void tearDown(){
        calculadora = null;
        System.out.println("@AfterEach -> tearDown");
    }

    @Test //Prueba si el objeto esta instanciado
    public void calculatorNotNullTest(){
        assertNotNull(calculadora, "Calculadora debe ser notNull");
        System.out.println("@Test -> calculatorNotNullTest");
    }

    @Test //Prueba si el objeto no esta instanciado
    public void calculatorNullTest(){
        assertNull(calculadoraNull);
        System.out.println("@Test -> calculatorNullTest");
    }

    @Test //Prueba si una suma da el valor esperado
    public void addAssertTest(){
        //1.- Setup
        int resultadoEsperado = 30;
        int tesultadoActual;

        //2.- Action

        tesultadoActual = this.calculadora.suma(10,20);

        //3.- Assert

        assertEquals(resultadoEsperado, tesultadoActual);
        System.out.println("@Test -> addAssertTest");
    }



    private Calculator calculadora;
    private Calculator calculadoraNull;
}