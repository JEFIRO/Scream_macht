package com.jefiroo.screenmatch.modelos;

import java.util.Collection;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvalicoes;
    private int duracaoEmMinutos;

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvalicoes++;
    }

    public double pegaMedia(){
        double media = somaDasAvaliacoes / totalDeAvalicoes;
        return (int) media;
    }

    public void estaIncluidoNoPlano(){
        if (incluidoNoPlano){
            System.out.println("Esse filme esta incluso no plano");
        }else {
            System.out.println("Esse filme não esta incluso no plano");
        }
    }

    public int getTotalDeAvalicoes(){
        return totalDeAvalicoes;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
