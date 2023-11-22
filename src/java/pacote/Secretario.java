package java.pacote;
import java.time.LocalDate;

public class Secretario extends Funcionario {

    public Secretario(String nome, String dataContratacao) {
        super(nome, "Secretario", dataContratacao);
    }

    @Override
    public double calcularSalario(int mes, int ano) {

        double salario = 7000.0;

        long anosDeServico = calcularAnosDeServico(mes, ano);
        double bonusAnosServico = anosDeServico * 1000.0;


        double beneficio = salario * 0.2;


        return salario + bonusAnosServico + beneficio;
    }
}
