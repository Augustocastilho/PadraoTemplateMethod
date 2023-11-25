package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JogoBrasilTest {

    @Test
    void deveRetornarPrecoFinal() {
        JogoBrasil jogo = new JogoBrasil();
        jogo.setPreco(100);
        assertEquals(130, jogo.calcularPrecoFinal());
    }

    @Test
    void deveRetornarTipo() {
        JogoBrasil jogo = new JogoBrasil();
        assertEquals("Jogo no Brasil", jogo.getTipo());
    }

    @Test
    void deveRetornarInfo() {
        JogoBrasil jogo = new JogoBrasil();
        jogo.setId("1");
        jogo.setNome("Paciência Spider");
        jogo.setPreco(100);
        assertEquals("ID: 1\nNome: Paciência Spider\nPreço: 130.0", jogo.getInfo());
    }

}