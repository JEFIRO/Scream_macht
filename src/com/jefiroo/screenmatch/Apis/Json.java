package com.jefiroo.screenmatch.Apis;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jefiroo.screenmatch.modelos.Titulo;
import com.jefiroo.screenmatch.modelos.TituloOmd;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Json {
    private List<Titulo> titulos = new ArrayList<>();
    private Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();

    public void querry(String endereco) throws IOException, InterruptedException {
        String busca = "https://www.omdbapi.com/?t=" + endereco.replace(" ", "+") + "&apikey=3f6b9216";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(busca))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        TituloOmd meuTituloOmd = gson.fromJson(json, TituloOmd.class);

        Titulo meuTitulo = new Titulo(meuTituloOmd);
        titulos.add(meuTitulo);
        System.out.println(meuTitulo);
    }
    public void escreveJson() throws IOException {
        if (!titulos.isEmpty()) {
            FileWriter escrita = new FileWriter("Filmes.json");
            escrita.write(gson.toJson(titulos));
            escrita.close();
        }
    }
}
