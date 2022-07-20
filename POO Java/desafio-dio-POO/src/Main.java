import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args)
    {
        Curso curso1 = new Curso();
        curso1.setTitulo("Introdução ao Java");
        curso1.setDescricao("Conheça uma das melhores Linguagens de Programação já criada!");
        curso1.setCargaHoraria(12);

        //System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("POO em Java");
        curso2.setDescricao("Conheça o Paradigma Orientado a Objetos!");
        curso2.setCargaHoraria(16);

       // System.out.println(curso2.getTitulo());
        //System.out.println(curso2.getCargaHoraria());

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("1ª Mentoria de Java");
        mentoria1.setDescricao("Dê o play e conheça o mundo Java");
        mentoria1.setData(LocalDate.now());

        //System.out.println(mentoria1);


        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Java Experience II");
        bootcamp.setDescricao("Aprenda Java na prática com projetos reais");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria1);

        Dev developer = new Dev();
        developer.setNome("Altair Mateus T Alencastro");
        developer.inscreverBootcamp(bootcamp);
        System.out.println("Dev: " + developer.getNome());
        System.out.println("CONTEÚDOS INSCRITOS: " + developer.getConteudosInscritos());
        developer.progredir();
        System.out.println("CONTEÚDOS CONCLUIDOS: " + developer.getConteudosConcluidos() );
        System.out.println("XP: " + developer.calcularTotalXp() + "\n");


        Dev developer2 = new Dev();
        developer2.setNome("Jonas Brown");
        developer2.inscreverBootcamp(bootcamp);
        System.out.println("Dev: " + developer2.getNome());
        System.out.println("CONTEÚDOS INSCRITOS: " + developer2.getConteudosInscritos());
        System.out.println("CONTEÚDOS CONCLUIDOS: " + developer2.getConteudosConcluidos());
        System.out.println("XP: " + developer2.calcularTotalXp() + "\n");



    }// Fim do metodo main
}
