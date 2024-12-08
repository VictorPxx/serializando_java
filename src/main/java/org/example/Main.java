package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            Scanner leitura = new Scanner(System.in);
            String nomeDoTime = "";
            List<Time> listaTimes = new ArrayList<>();
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();

            while (!nomeDoTime.equalsIgnoreCase("sair")) {
                System.out.println("Digite o nome do time ou \"sair\" para fechar o programa");
                nomeDoTime = leitura.nextLine().trim();
                if (nomeDoTime.equalsIgnoreCase("sair") || nomeDoTime.isEmpty()) {
                    break;
                }
                System.out.println("Digite o número de libertadores");
                String libertadores = leitura.nextLine().trim();
                if (libertadores.isEmpty()) {
                    libertadores = "0";
                }
                System.out.println("Digite o número de brasileiros");
                String brasileiros = leitura.nextLine().trim();
                if (brasileiros.isEmpty()) {
                    brasileiros = "0";
                }
                System.out.println("Digite o número de copas do brasil");
                String copasDoBrasil = leitura.nextLine().trim();
                if (copasDoBrasil.isEmpty()) {
                    copasDoBrasil = "0";
                }

                Time novoTime = new Time(nomeDoTime, libertadores, brasileiros, copasDoBrasil);
                listaTimes.add(novoTime);
            }
            String jsonTime = gson.toJson(listaTimes);

            FileWriter escrever = new FileWriter("arquivo.txt");
            escrever.write(jsonTime);
            escrever.close();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}