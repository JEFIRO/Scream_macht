package com.jefiroo.screenmatch.Main;

import com.jefiroo.screenmatch.modelos.Filme;
import com.jefiroo.screenmatch.modelos.Serie;
import com.jefiroo.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class MainComListas {
    public static void main(String[] args) {

    Filme meuFilme = new Filme("Tropa De Elite",1994);
    meuFilme.avalia(10);
    Filme novoFilme = new Filme("Interestelar", 2012);
    novoFilme.avalia(9);
    Filme outroFilme = new Filme("Avengers",2023);
    outroFilme.avalia(9);
    Serie lost = new Serie("Lost", 2019);

    ArrayList<Titulo> listaDeFilmes = new ArrayList<>(0);
    listaDeFilmes.add(meuFilme);
    listaDeFilmes.add(outroFilme);
    listaDeFilmes.add(novoFilme);
    listaDeFilmes.add(lost);

    for (Titulo item: listaDeFilmes){
        System.out.println(item.getNome());
        if (item instanceof Filme filme){
            System.out.println("Classificação " + filme.getClassificacao());
            }
        }
        Collections.sort(listaDeFilmes);
    System.out.println(listaDeFilmes);
    }
}