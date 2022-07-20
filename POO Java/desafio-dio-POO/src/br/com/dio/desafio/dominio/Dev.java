package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp)
    {
        //  Colocou todos os conteudos do bootcamp nos conteudos inscritos
        this.conteudosInscritos.addAll(bootcamp.getConteudo());

        //  Inseriu o dev no bootcamp
        bootcamp.getDevsInscritos().add(this);
    }// Fim do metodo inscreverBootcamp

    public void progredir()
    {
        //  Pegando primeiro conteudo
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();

        //  Se conteudo existe irá adicionar no conteudos concluidos e remover dos conteudos inscritos
        if(conteudo.isPresent())
        {
            this.conteudosConcluidos.add(conteudo.get());

            this.conteudosInscritos.remove(conteudo.get());
        } else
        {
            System.err.println("VOCÊ NÃO ESTÁ MATRICULADO EM NENHUM CONTEÚDO!");
        }

    }// Fim do metodo progredir

    public double calcularTotalXp()
    {
       return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    }// Fim do metodo calcularTotalXp


    //  Getters e Setters
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos()
    {
        return conteudosInscritos;
    }
    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos)
    {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos()
    {
        return conteudosConcluidos;
    }
    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos)
    {
        this.conteudosConcluidos = conteudosConcluidos;
    }
    //  Fim dos getters e setters

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}// Fim da classe Dev
