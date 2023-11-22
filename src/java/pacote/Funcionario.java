package java.pacote;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Funcionario {
    protected String nome;
    protected String cargo;
    protected LocalDate dataContratacao;

    public Funcionario(String nome, String cargo, String dataContratacao) {
        this.nome = nome;
        this.cargo = cargo;
        this.dataContratacao = LocalDate.parse(dataContratacao, Util.formatter);
    }

    protected long calcularAnosDeServico(int mes, int ano) {
        LocalDate dataAtual = LocalDate.of(ano, mes, 1);
        return ChronoUnit.YEARS.between(dataContratacao, dataAtual);
    }

    public abstract double calcularSalario(int mes, int ano);

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }
}
