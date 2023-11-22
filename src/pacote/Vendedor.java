package pacote;

public class Vendedor extends Funcionario {

    private double valorVendido;

    public Vendedor(String nome, String dataContratacao) {
        super(nome, "Vendedor", dataContratacao);
        this.valorVendido = 0.0;
    }


    public void registrarVenda(double valor) {
        this.valorVendido += valor;
    }

    @Override
    public double calcularSalario(int mes, int ano) {

        double salarioBase = 12000.0;


        long anosDeServico = calcularAnosDeServico(mes, ano);
        double bonusAnosServico = anosDeServico * 1800.0;

        double bonusVendas = valorVendido * 0.3;


        return salarioBase + bonusAnosServico + bonusVendas;
    }
}
