import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setCargaHoraria(8);
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso Java");

        Curso curso2 = new Curso();
        curso2.setCargaHoraria(4);
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}