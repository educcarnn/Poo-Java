package pacote;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public abstract class Funcionario {
    protected String nome;
    protected String cargo;
    protected LocalDate dataContratacao;


    public Funcionario(String nome, String cargo, String dataContratacao) {
        this.nome = nome;
        this.cargo = cargo;
        this.dataContratacao = parseData(dataContratacao);
    }


    private LocalDate parseData(String data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
        return YearMonth.parse(data, formatter).atDay(1);
    }


    protected long calcularAnosDeServico(int mes, int ano) {
        LocalDate dataAtual = LocalDate.of(ano, mes, 1);
        return java.time.temporal.ChronoUnit.YEARS.between(dataContratacao, dataAtual);
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
