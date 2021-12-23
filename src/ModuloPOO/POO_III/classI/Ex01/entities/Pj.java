package ModuloPOO.POO_III.classI.Ex01.entities;

public class Pj extends Funcionario{

    private double horasTrabalhadas;
    private double valorHora;

    public Pj(int matricula, String nome, String centroDeCusto, String setor, double horasTrabalhadas, double valorHora) {
        super(matricula, nome, centroDeCusto, setor);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public double pagarSalario() {
        return horasTrabalhadas * valorHora;
    }
}
