package com.jefiroo.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if ( classificavel.getClassificacao() >= 4){
            System.out.println("preferidos");
        }else if (classificavel.getClassificacao() >= 2){
            System.out.println("bem recomendado");
        }else {
            System.out.println("coloque na lista");
        }
    }
}
