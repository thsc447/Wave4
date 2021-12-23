package ModuloPOO.POO_III.classI.Ex01.entities;

public class Funcionario {
    private int Matricula;
    private String nome;
    private String centroDeCusto;
    private String setor;

    public Funcionario(int matricula, String nome, String centroDeCusto, String setor) {
        Matricula = matricula;
        this.nome = nome;
        this.centroDeCusto = centroDeCusto;
        this.setor = setor;
    }

    public int getMatricula() {
        return Matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCentroDeCusto() {
        return centroDeCusto;
    }

    public void setCentroDeCusto(String centroDeCusto) {
        this.centroDeCusto = centroDeCusto;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

}
