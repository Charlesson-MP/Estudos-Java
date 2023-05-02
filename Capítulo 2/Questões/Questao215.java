//Questão 2.15 do capítulo 2
//Recebe 2 valores do usuário pelo dispositivo de entrada padrão e calcula a soma, produto, diferença e quociente dos valores

import java.util.Scanner; //Importando a classe Scanner da biblioteca Java

public class Questao215 { //Inicio da classe Questao215

    //Método main, inicia a execução do aplicativo
    public static void main(String[] args) { //Inicio do método main
        
        Scanner input = new Scanner(System.in); //Instaciando objeto da classe Scanner
        int firstInteger, //Variável para receber o primeiro inteiro
            secondInteger, //Variável para receber o segundo inteiro
            sum, //Variável para guardar o resultado da soma
            subtraction, //Variável para guardar o resultado da subtração
            product,
            quotient; //Variável para guardar o resultado do quociente

            System.out.println("__________________________"); //Salta o cursor 1 linha e imprime uma linha na CLI
            
            System.out.print("| Enter first integer: "); //Pede ao usuário para inserir o primeiro número inteiro
            firstInteger = input.nextInt(); //Recebe o valor com a variável input e o atribui à variável firstInteger
            
            System.out.print("| Enter second integer: "); //Pede ao usuário para inserir o segundo número inteiro
            secondInteger = input.nextInt(); //Recebe o valor com a variável input e o atribui à variável secondInteger
            
            System.out.println("|_________________________"); //Imprime uma linha na CLI

            sum = firstInteger + secondInteger; //Calcula a soma e atribui a variável sum
            subtraction = firstInteger - secondInteger; //Calcula a subtração e atribui a variável subtraction
            product = firstInteger * secondInteger; //Calcula o produto e atribui a variável product
            quotient = firstInteger / secondInteger; //Calcula o quociente e atribui a variável quotient

            System.out.println("______________________"); //Salta o cursosr 1 linha e imprime uma linha na CLI

            System.out.println("| Sum is         " + sum); //Exibe o resultado da soma
            System.out.println("| Subtraction is " + subtraction); //Exibe o resultado da subtração
            System.out.println("| Product is     " + product); //Exibe o resultado do produto
            System.out.println("| Quotient is    " + quotient); //Exibe o resultado do quociente

            System.out.println("|_____________________\n"); //Imprime uma linha na CLI
            
        input.close(); //Fechando objeto input

    } //Fim do método main

} //Fim da classe Questao215