package com.jefiroo.screenmatch.Main;

import com.jefiroo.screenmatch.calculos.CalculadoraDeTempo;
import com.jefiroo.screenmatch.calculos.FiltroRecomendacao;
import com.jefiroo.screenmatch.modelos.Episodio;
import com.jefiroo.screenmatch.modelos.Filme;
import com.jefiroo.screenmatch.modelos.Serie;
import com.jefiroo.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Tropa De Elite",1994);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.estaIncluidoNoPlano();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getTotalDeAvalicoes());
        System.out.println(meuFilme.pegaMedia());

        System.out.println("===============================");

        Serie lost = new Serie("Lost", 2019);
        lost.exibeFichaTecnica();
        lost.setTemporada(10);
        lost.setEpisodioPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duraçao para maratonar " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avengers",2023);
        outroFilme.setDuracaoEmMinutos(200);

        System.out.println("===============================");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        var novoFilme = new Filme("Interestelar", 2012);
        novoFilme.setDuracaoEmMinutos(230);
        novoFilme.avalia(10);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio(lost);
        episodio.setNumero(1);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        ArrayList<Titulo> listaDeFilmes = new ArrayList<>(0);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(novoFilme);
        listaDeFilmes.add(lost);
        for (Titulo item: listaDeFilmes){

        }
    }

}
