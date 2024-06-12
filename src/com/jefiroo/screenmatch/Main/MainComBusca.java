package com.jefiroo.screenmatch.Main;

import com.jefiroo.screenmatch.Apis.Json;
import com.jefiroo.screenmatch.excecao.ErroDeConversaoDeAnoException;
import com.jefiroo.screenmatch.excecao.ErroDePesquisaExcepition;

import java.io.IOException;
import java.util.Scanner;

public class MainComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        Json json = new Json();
        String busca = "";

        while (!busca.equalsIgnoreCase("sair")) {

            try {
                System.out.println("digite um filme");
                busca = sc.nextLine();

                if (!busca.equalsIgnoreCase("sair")) {
                    json.querry(busca);
                }
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            } catch (ErroDePesquisaExcepition e) {
                System.out.println(e.getMessage());
            }
        }
        json.escreveJson();
    }
}