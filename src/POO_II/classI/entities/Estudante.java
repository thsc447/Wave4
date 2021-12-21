package POO_II.classI.entities;

import POO_II.classI.aplication.Program;

import java.util.Date;
import java.util.Random;

public class Estudante {
    private String name;
    private Date dateOfBirth;
    private String classRoom;
    private int id;

    public Estudante(String name, Date dateOfBirth, String classRoom) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classRoom = classRoom;

        Random random = new Random();
        this.id = random.nextInt(3000);
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
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
                ", id=";
    }
}
