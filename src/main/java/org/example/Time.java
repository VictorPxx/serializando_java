package org.example;

public class Time {
    private String nome;
    private String libertadores;
    private String brasileiros;
    private String copaDoBrasil;

    public Time (String nome, String libertadores, String brasileiros, String copaDoBrasil) {
        this.nome = nome;
        this.libertadores = libertadores;
        this.brasileiros = brasileiros;
        this.copaDoBrasil = copaDoBrasil;
    }

    public String getNome() {
        return nome;
    }

    public String getLibertadores() {
        return libertadores;
    }

    public String getBrasileiros() {
        return brasileiros;
    }

    public String getCopaDoBrasil() {
        return copaDoBrasil;
    }

    @Override
    public String toString() {
        return "(nome = " + nome +
                ", libertadores = " + libertadores +
                ", brasileiros = " + brasileiros +
                ", copaDoBrasil = " + copaDoBrasil +
                 ")";
    }
}
