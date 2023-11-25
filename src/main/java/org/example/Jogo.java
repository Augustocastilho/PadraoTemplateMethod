package org.example;

public abstract class Jogo {

    private String id;
    private String nome;
    protected float preco;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public abstract float calcularPrecoFinal();

    public String getTipo() {
        return "Jogo";
    }

    public String getInfo() {
        return "ID: " + this.id + "\nNome: " + this.nome + "\nPreço: " + this.calcularPrecoFinal();
    }
}
