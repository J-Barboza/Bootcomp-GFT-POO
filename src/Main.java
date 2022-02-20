import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descricao do curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em Java");
        mentoria.setDescricao("descricao da mentoria em Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFrancisco = new Dev();
        devFrancisco.setNome("Francisco");
        devFrancisco.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Fran: " + devFrancisco.getConteudosInscritos());
        devFrancisco.progredir();
        devFrancisco.progredir();
        System.out.println("Conteudo Inscritos Fran: " + devFrancisco.getConteudosInscritos());
        System.out.println("Conteudo Inscritos Fran: " + devFrancisco.getConteudosConcluidos());
        System.out.println("XP: " + devFrancisco.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudo Inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudo Inscritos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }

}
