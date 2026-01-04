import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

//
//        System.out.println(curso);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devgabriel = new Dev();
        devgabriel.setNome("Gabriel");
        devgabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Gabriel: " + devgabriel.getConteudosInscritos());
        System.out.println("XP: " + devgabriel.calcularXP());
        devgabriel.progredir();
        devgabriel.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Gabriel: " + devgabriel.getConteudosInscritos());
        System.out.println("Conteudos concluidos Gabriel: " + devgabriel.getConteudosConcluidos());
        System.out.println("XP: " + devgabriel.calcularXP());
        System.out.println("______________________________________");

        Dev devGil = new Dev();
        devGil.setNome("Gil");
        devGil.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Gil: " + devGil.getConteudosInscritos());
        System.out.println("XP: " + devGil.calcularXP());
        devGil.progredir();
        devGil.progredir();
        devGil.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Gil: " + devGil.getConteudosInscritos());
        System.out.println("Conteudos concluidos Gil: " + devGil.getConteudosConcluidos());
        System.out.println("XP: " + devGil.calcularXP());



    }
}