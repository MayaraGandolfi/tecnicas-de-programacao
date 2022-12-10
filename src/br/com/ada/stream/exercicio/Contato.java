package br.com.ada.stream.exercicio;

import java.time.LocalDate;

public class Contato {
    private int id;
    private String nome;
    private int numero;
    private LocalDate dataNascimento;
    private int idade;

    public Contato(int id, String nome, int numero, LocalDate dataNascimento, int idade) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", numero=" + numero +
                ", dataNascimento=" + dataNascimento +
                ", idade=" + idade +
                '}';
    }
}
