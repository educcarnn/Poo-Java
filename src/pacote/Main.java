package pacote;

public class Main {
    public static void main(String[] args) {

        Secretario jorge = new Secretario("Jorge Carvalho", "01/2018");
        Vendedor ana = new Vendedor("Ana Silva", "12/2021");
        Gerente juliana = new Gerente("Juliana Alves", "07/2017");


        ana.registrarVenda(5200.0);
        ana.registrarVenda(4000.0);
        ana.registrarVenda(4200.0);
        ana.registrarVenda(5850.0);
        ana.registrarVenda(7000.0);

        int mes = 3;
        int ano = 2022;

        System.out.println("Salário do Jorge (Secretário): " + jorge.calcularSalario(mes, ano));
        System.out.println("Salário da Ana (Vendedor): " + ana.calcularSalario(mes, ano));
        System.out.println("Salário da Juliana (Gerente): " + juliana.calcularSalario(mes, ano));
    }
}
