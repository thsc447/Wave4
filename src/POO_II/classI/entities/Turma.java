package POO_II.classI.entities;

import java.util.List;

public class Turma {
    private int grade;
    private char serial;
    private List<Estudante> estudantes;
    private List<Disciplina> disciplinas;

    public Turma(int grade, char serial, List<Estudante> estudantes, List<Disciplina> disciplinas) {
        this.grade = grade;
        this.serial = serial;
        this.estudantes = estudantes;
        this.disciplinas = disciplinas;
    }

    public int getGrade() {
        return grade;
    }

    public char getSerial() {
        return serial;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "grade=" + grade +
                ", serial=" + serial +
                ", estudantes=" + estudantes +
                ", disciplinas=" + disciplinas + '}';
    }
}
