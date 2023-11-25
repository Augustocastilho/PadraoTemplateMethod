package org.example;

public class JogoBrasil extends Jogo{

    public float calcularPrecoFinal() {
        return this.preco * 1.3f;
    }

    @Override
    public String getTipo() {
        return "Jogo no Brasil";
    }
}
