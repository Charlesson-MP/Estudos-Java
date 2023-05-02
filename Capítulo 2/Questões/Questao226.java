//Questão 2.26 do capítulo 2
//Recebe 2 valores inteiros, determina se o primeiro valor é multiplo do segundo e imprimir o resultado

import java.util.Scanner; //Importando a classe Scanner da Java API

public class Questao226 { //Início da classe Questao226

    //Método main, inicia a execução da aplicação
    public static void main(String[] args) { //Início do método main

        Scanner input = new Scanner(System.in); //Instanciando um objeto Scanner para entrada de dados pelo teclado
        int firstInteger, //Declarando uma variável do tipo int
            secondInteger; //Declarando uma variável do tipo int

        System.out.println("____________________________"); //Exibe um traço no terminal
        System.out.print("| Enter first integer:  "); //Exibe no terminal uma instrução ao usuário
        firstInteger = input.nextInt(); //Recebe um valor do teclado e atribui a variável firstInteger

        System.out.print("| Enter second integer: "); //Exibe no terminal uma instrução ao usuário
        secondInteger = input.nextInt(); //Recebe um valor do teclado e atribui a variável secondInteger
        System.out.println("|___________________________"); //Exibe um traço vertical e um sublinhado para delimitar o fim da fase de entrada

        if(firstInteger % secondInteger == 0) { //Início do if que avalia a expressão firstInteger % secondInteger == 0

            System.out.println("| " + firstInteger +
                " é múltiplo de " + secondInteger); //Exibe o resultado caso a expressão firstInteger % secondInteger == 0 for verdadeira

        } //Fim do if que avalia a expressão firstInteger % secondInteger == 0

        if(firstInteger % secondInteger != 0) { //Início do if que avalia a expressão firstInteger % secondInteger != 0

            System.out.println("| " + firstInteger +
                " não é múltiplo de " + secondInteger);//Exibe o resultado caso a expressão firstInteger % secondInteger != 0 for verdadeira

        } //Fim do if que avalia a expressão firstInteger % secondInteger == 0

        System.out.println("|___________________________"); //Exibe um traço vertical e um sublinhado para delimitar o fim do programa

        input.close(); //Fecha o objeto input

    } //Fim do método main
    
} //Fim da classe Questao 226