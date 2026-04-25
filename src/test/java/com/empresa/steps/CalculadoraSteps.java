package com.empresa.steps;

import com.empresa.Calculadora;
import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraSteps {

    private int a;
    private int b;
    private int resultado;
    private Calculadora calculadora = new Calculadora();

    @Given("que tengo los numeros {int} y {int}")
    public void que_tengo_los_numeros(int num1, int num2) {
        this.a = num1;
        this.b = num2;
    }

    @When("realizo la suma")
    public void realizo_la_suma() {
        resultado = calculadora.sumar(a, b);
    }

    @When("realizo la resta")
    public void realizo_la_resta() {
        resultado = calculadora.restar(a, b);
    }

    @Then("el resultado debe ser {int}")
    public void el_resultado_debe_ser(int esperado) {
        assertEquals(esperado, resultado);
    }
}