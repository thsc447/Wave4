package POO_II.classI.Ex01.entities;

public class Disciplina {
    private String name;
    private double courseLoad;

    public Disciplina(String name, double courseLoad) {
        this.name = name;
        this.courseLoad = courseLoad;
    }

    public String getName() {
        return name;
    }

    public double getCourseLoad() {
        return courseLoad;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "name='" + name + '\'' +
                ", courseLoad=" + courseLoad +
                '}';
    }
}
