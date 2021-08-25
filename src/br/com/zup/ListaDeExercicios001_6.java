package br.com.zup;

public class ListaDeExercicios001_6 {
    public static void main(String[] args) {
        int horasTrabalhadasPorMes = 22 * 6;
        float salarioPorHora = 1275/horasTrabalhadasPorMes;
        float salarioTotalMensal = salarioPorHora * horasTrabalhadasPorMes;
        float salarioBruto = salarioTotalMensal;
        float pagamentoINSS = (salarioBruto * 8/100);
        float pagamentoSindicato = (salarioBruto * 5/100);
        float pagamentoIR = (salarioBruto * 11/100);
        float salarioLiquido = salarioBruto - pagamentoINSS - pagamentoSindicato - pagamentoIR;

        System.out.println("O Salário Bruto é " + "R$ " + salarioBruto);
        System.out.println("O valor a ser pago ao INSS é " + "R$ " + pagamentoINSS);
        System.out.println("O valor a ser pago ao sindicato é " + "R$ " + pagamentoSindicato);
        System.out.println("O valor do salário líquido é " + "R$ " + salarioLiquido);

    }
}
