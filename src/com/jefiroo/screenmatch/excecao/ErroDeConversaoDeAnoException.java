package com.jefiroo.screenmatch.excecao;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;
    public ErroDeConversaoDeAnoException(String error) {
        this.mensagem = error;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
