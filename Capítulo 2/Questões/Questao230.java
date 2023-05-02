//Questão 2.30 do capítulo 2
//Recebe um número inteiro de 5 dígitos e o exibe de volta no terminal separando cada dígito com 3 espaços

import java.util.Scanner; //Importa a classe Scanner da Java API

public class Questao230 { //Inicio da classe Questao230

    //Método main, inicia a execução da aplicação
    public static void main(String[] args) { //Início do método main

        Scanner input = new Scanner(System.in); //Instanciando objeto da classe Scanner para receber valores do teclado
        int integer; //Declarando variável do tipo inteiro

        System.out.println("_________________________________________"); //Exibe no terminal uma linha que delimita o início da exibição
        
        System.out.print("| Enter a value with 5 digits: "); //Exibe um traço vertical em seguida uma instrução para o usuário
        integer = input.nextInt(); //Recebe um valor inteiro do teclado e o atribui a variável integer 

        System.out.println("|________________________________________"); //Exibe no terminal uma linha que delimita o fim da entrada de valores

        System.out.printf("|%d   %d   %d   %d   %d%n",
        ((((integer / 10) /10) /10) /10) % 10,
        (((integer / 10) /10) /10) % 10,
        ((integer / 10) /10) % 10, 
        (integer / 10) % 10,
        integer % 10);

        System.out.println("|________________________________________"); //Exibe no terminal uma linha que delimita o fim da saída de valores

        input.close(); //Fecha o input
    } //Fim do método main
    
} //Fim da classe Questao230