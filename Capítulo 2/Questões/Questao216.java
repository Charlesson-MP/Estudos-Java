//Questão 2.16 do capítulo 2
//Recebe dois números inteiros do usuário pelo teclado e compara os valores, retorna qual o maior ou se são iguais

import java.util.Scanner; //Importando a classe Scanner da Java API

public class Questao216 { //Início da classe Questao216

    //Método main, inicia a execução da aplicação
    public static void main(String[] args) { //Inicio do método main

        Scanner input = new Scanner(System.in); //Instanciando um objeto da classe Scanner
        int firstInteger, //Declarando variável para receber o primeiro valor inteiro
            secondInteger; //Declarando variável para receber o segundo valor inteiro

        System.out.println("\n__________________________"); //Instrução para saltar primeira linha, escrever traço e mudar cursor para próxima linha
        System.out.print("| Enter first integer: "); //Escreve texto para instruir o usuário a próxima ação
        firstInteger = input.nextInt(); //Instrução para receber um valor inteiro do teclado e atribuir a variável firstInteger

        System.out.print("| Enter second integer: "); //Escreve texto para instruir o usuário a próxima ação
        secondInteger = input.nextInt(); //Instrução para receber um valor inteiro do teclado e atribuir a variável secondInteger
        System.out.println("|_________________________"); //Instrução para escrever traço e mudar cursor para próxima linha

        if(firstInteger > secondInteger) { //Inicio do if para avaliar a expressão firstInteger > secondInteger
            System.out.println("\n" + firstInteger + " is larger than " + secondInteger + "\n");
        } //Fim do if para avaliar a expressão firstInteger > secondInteger

        if(secondInteger > firstInteger) { //Inicio do if que avalia a expressão secondInteger > firstInteger
            System.out.println("\n" + secondInteger + " is larger than " + firstInteger + "\n");
        } //Fim do if que avalia a expressão secondInteger > firstInteger

        input.close(); //Fecha o objeto input
    } //Fim do método main

} //Fim da classe Questao216