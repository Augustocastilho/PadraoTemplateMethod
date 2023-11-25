package org.example;

public class JogoEUA extends Jogo{

    public float calcularPrecoFinal() {
        return this.preco * 1.1f;
    }

    @Override
    public String getTipo() {
        return "Jogo nos EUA";
    }

}
