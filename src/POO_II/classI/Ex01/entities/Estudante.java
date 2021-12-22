package POO_II.classI.Ex01.entities;

import java.time.LocalDate;
import java.util.Random;

public class Estudante {
    private String name;
    private LocalDate dateOfBirth;
    private String classRoom;
    private int id;

    public Estudante(String name, LocalDate dateOfBirth, String classRoom) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classRoom = classRoom;

        Random random = new Random();
        this.id = random.nextInt(3000);
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", classRoom='" + classRoom + '\'' +
                ", id= " + id;
    }
}
