package java.pacote;

import java.time.LocalDate;

public class Gerente extends Funcionario {

    public Gerente(String nome, String dataContratacao) {
        super(nome, "Gerente", dataContratacao);
    }
    @Override
    public double calcularSalario(int mes, int ano) {
        return 20000.0;
    }
}
