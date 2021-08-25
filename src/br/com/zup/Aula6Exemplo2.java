package br.com.zup;

public class Aula6Exemplo2 {

    public static void main(String[] args) {
        //Armazenar os valores em memoria
        int numero1 = 20;
        int numero2 = 20;

        //System.out.println (numero1 + numero2);
        //Criando a operação de soma

        int resultadoDaSoma = numero1 + numero2;

        //Exibindo a operação de soma para o usuario

        System.out.println(resultadoDaSoma);

        //Criando a operação de subtração
        int resultadoDaSubtracao = numero1 - numero2;

        //Exibindo a operação de subtração para o usuário
        System.out.println("O resultado da subtração é " + resultadoDaSubtracao);

        //Criando a operação de multiplicação

        int resultadoDaMultiplicacao = numero1 * numero2;

        //Exibindo a operação de multiplicação para o usuário
        System.out.println("O resultado da multiplicação é " + resultadoDaMultiplicacao);

        //Criando a operação de divisão
        int resultadoDaDivisao = numero1/numero2;

        //Exibindo a operação de divisão para o usuário
        System.out.println("O resultado da divisão é " + resultadoDaDivisao);

    }
}
