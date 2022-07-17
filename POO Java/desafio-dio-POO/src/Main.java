import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args)
    {
        Curso curso1 = new Curso();
        curso1.setTitulo("Introdução ao Java");
        curso1.setDescricao("Conheça uma das melhores Linguagens de Programação já criada!");
        curso1.setCargaHoraria(12);

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("POO em Java");
        curso2.setDescricao("Conheça o Paradigma Orientado a Objetos!");
        curso2.setCargaHoraria(16);

        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("1ª Mentoria de Java");
        mentoria1.setDescricao("Dê o play e conheça o mundo Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);


    }// Fim do metodo main
}
