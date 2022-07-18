package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria()
    {

    }// Fim do construtor

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    //  Getters e Setters
    public LocalDate getData()
    {
        return data;
    }
    public void setData(LocalDate data)
    {
        this.data = data;
    }
    //  Fim dos getters e setters


    @Override
    public String toString() {
        return "Mentoria{" +
                "data=" + data +
                '}';
    }

}// Fim da classe Mentoria
