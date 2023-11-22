package pacote;  // Lembre-se de ajustar conforme a estrutura do seu pacote

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public abstract class Funcionario {
    protected String nome;
    protected String cargo;
    protected LocalDate dataContratacao;

    // Construtor
    public Funcionario(String nome, String cargo, String dataContratacao) {
        this.nome = nome;
        this.cargo = cargo;
        this.dataContratacao = parseData(dataContratacao);
    }

    // Método para analisar a data no formato desejado
    private LocalDate parseData(String data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
        return YearMonth.parse(data, formatter).atDay(1);
    }

    // Método para calcular o número de anos de serviço
    protected long calcularAnosDeServico(int mes, int ano) {
        LocalDate dataAtual = LocalDate.of(ano, mes, 1);
        return java.time.temporal.ChronoUnit.YEARS.between(dataContratacao, dataAtual);
    }

    // Método abstrato para calcular salário (será implementado nas subclasses)
    public abstract double calcularSalario(int mes, int ano);

    // Getters
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
