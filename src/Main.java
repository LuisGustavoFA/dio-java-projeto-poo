import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Dev d1 = new Dev();
        d1.setNome("Luis");

        Curso c1 = new Curso();
        c1.setTitulo("Curso JS");
        c1.setDescricao("Descrição curso JS");
        c1.setCargaHoraria(4);

        Curso c2 = new Curso();
        c1.setTitulo("Curso CSS");
        c1.setDescricao("Descrição curso CSS");
        c1.setCargaHoraria(6);

        Mentoria m1 = new Mentoria();
        m1.setTitulo("Mentoria de Java");
        m1.setDescricao("Descrição Mentoria de Java");
        m1.setData(LocalDate.now());

        Bootcamp bc1 = new Bootcamp();
        bc1.setNome("Bootcamp Java Developer");
        bc1.setDescricao("Descrição Bootcamp Java Developer");
        bc1.getConteudos().add(c1);
        bc1.getConteudos().add(c2);
        bc1.getConteudos().add(m1);

        d1.inscreverBootcamp(bc1);
        d1.progredir();
        d1.progredir();

        System.out.println(d1.getConteudosInscritos());
        System.out.println(d1.getConteudosConcluidos());
    }
}
