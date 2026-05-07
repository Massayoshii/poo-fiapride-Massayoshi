package br.com.fiapride.model;

public class Dono {

    private String nome;
    private int idade;

    public Dono(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {

        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida");
        }
    }
}