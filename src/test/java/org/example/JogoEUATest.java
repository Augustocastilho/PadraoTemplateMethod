package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JogoEUATest {

    @Test
    void deveRetornarPrecoFinal() {
        JogoEUA jogo = new JogoEUA();
        jogo.setPreco(100);
        assertEquals(110, jogo.calcularPrecoFinal());
    }

    @Test
    void deveRetornarTipo() {
        JogoEUA jogo = new JogoEUA();
        assertEquals("Jogo nos EUA", jogo.getTipo());
    }

    @Test
    void deveRetornarInfo() {
        JogoEUA jogo = new JogoEUA();
        jogo.setId("1");
        jogo.setNome("Paciência Spider");
        jogo.setPreco(100);
        assertEquals("ID: 1\nNome: Paciência Spider\nPreço: 110.0", jogo.getInfo());
    }

}