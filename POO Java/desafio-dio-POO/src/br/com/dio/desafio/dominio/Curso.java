package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso()
    {

    }// Fim do construtor

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    //  Getters e Setters
    public int getCargaHoraria()
    {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria)
    {
        this.cargaHoraria = cargaHoraria;
    }
    //  Fim dos getters e setters


    @Override
    public String toString() {
        return "Curso{" +
                "cargaHoraria=" + cargaHoraria +
                '}';
    }
}// Fim da classe Curso
