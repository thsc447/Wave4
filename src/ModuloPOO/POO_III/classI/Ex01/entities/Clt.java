package ModuloPOO.POO_III.classI.Ex01.entities;

public class Clt extends Funcionario {
    private int beneficios;
    private double meta;
    private double lucro;

    public Clt(int matricula, String nome, String centroDeCusto, String setor, int beneficios, double meta, double lucro) {
        super(matricula, nome, centroDeCusto, setor);
        this.beneficios = beneficios;
        this.meta = meta;
        this.lucro = lucro;
    }

    public double pagarSalario() {
        double salario = 0;
        switch (beneficios) {
            case 1:
                salario = 3200 * (meta * 0.05);
                break;
            case 2:
                salario = 4000 * (meta * 0.08);
                break;
            case 3:
                salario = 6000 * (meta * 0.125);
                break;
            case 4:
                salario = 15000 * (lucro * 0.03);
                break;
        }
        return salario;
    }
}
