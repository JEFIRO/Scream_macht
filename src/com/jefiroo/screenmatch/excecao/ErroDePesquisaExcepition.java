package com.jefiroo.screenmatch.excecao;

public class ErroDePesquisaExcepition extends RuntimeException {
    private String filmeNaoEncontrado;
    public ErroDePesquisaExcepition(String filmeNaoEncontrado) {
        this.filmeNaoEncontrado = filmeNaoEncontrado;
    }

    @Override
    public String getMessage() {
        return this.filmeNaoEncontrado;
    }
}
