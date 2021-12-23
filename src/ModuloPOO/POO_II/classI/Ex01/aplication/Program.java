package ModuloPOO.POO_II.classI.Ex01.aplication;

import ModuloPOO.POO_II.classI.Ex01.entities.Disciplina;
import ModuloPOO.POO_II.classI.Ex01.entities.Estudante;
import ModuloPOO.POO_II.classI.Ex01.entities.Turma;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<Estudante>();
        estudantes.add(new Estudante("James", LocalDate.now(), "4"));
        estudantes.add(new Estudante("Maria", LocalDate.now(), "5"));
        estudantes.add(new Estudante("Adrian", LocalDate.now(), "6"));

        List<Disciplina> disciplinas = new ArrayList<Disciplina>();
        disciplinas.add(new Disciplina("ads", 10));
        disciplinas.add(new Disciplina("CC", 20));

        Turma turma = new Turma(8,'a', estudantes, disciplinas);
        System.out.println(turma);
    }
}
