//Questão 2.17 do capítulo 2
/*Programa que recebe 3 valores inteiros do usuário e calcula e mostra a soma,
média, produto e os maiores e menores valores*/

import java.util.Scanner; //Importando a classe Scanner do Java API

public class Questao217 { //Inicio da classe Questao217
    
    //Método main, inicia a execução da aplicação
    public static void main(String[] args) { //Início do método main
        
        Scanner input = new Scanner(System.in); //Instanciando objeto da classe Scanner para entrada de valores
        int firstInteger, //Declarando variável do tipo inteiro para receber o primeiro valor
            secondInteger, //Declarando variável do tipo inteiro para receber o segundo valor
            thirdInteger, //Declarando variável do tipo inteiro para receber o terceiro valor
            sum, //Declarando variável do tipo inteiro para receber a soma dos valores
            average, //Declarando variável do tipo inteiro para receber a média dos valores
            product; //Declarando variável do tipo inteiro para receber o produto dos valores
        
        System.out.println("__________________________"); //Pula o cursor 1 linha e exibe os caracteres entre aspas
        System.out.print("| Enter first integer:  "); //Instrução para o usuário sobre o que fazer
        firstInteger = input.nextInt(); //Recebendo valor do teclado e o atribuindo a variável firstInteger

        System.out.print("| Enter second integer: "); //Instrução para o usuário sobre o que fazer
        secondInteger = input.nextInt(); //Recebendo valor do teclado e o atribuindo a variável secondIntger

        System.out.print("| Enter third integer:  "); //Instrução para o usuário sobre o que fazer
        thirdInteger = input.nextInt(); //Recebendo valor do teclado e o atribuindo a variável thirdInteger

        System.out.println("|_________________________\n"); //Exibe os caracteres entre aspas exeto caracteres de escape

        sum = firstInteger + secondInteger + thirdInteger; //Calcula a soma dos valores inseridos e a atribui à variável sum
        average = (firstInteger + secondInteger + thirdInteger)/3; //Calcula a média dos valores e a atribui à variável average
        product = firstInteger * secondInteger * thirdInteger; //Calcula o produto dos valores e o atribui à variável product

        System.out.println("Aritmetics results:");
       
        System.out.println("__________________________"); //Exibe os caracteres entre aspas exeto caracteres de escape
        System.out.println("| Sum is     " + sum); //Exibe a soma dos valores
        System.out.println("| Average is " + average); //Exibe a média dos valores
        System.out.println("| Product is " + product); //Exibe o produto dos valores

        System.out.println("|_________________________\n"); //Exibe os caracteres entre aspas exeto caracteres de escape

        System.out.println("The largest value:");

        System.out.println("______________________________"); //Exibe os caracteres entre aspas exeto caracteres de escape
        
        if(firstInteger > secondInteger) { //Início do if que avalia a expressão firstInteger > secondInteger
            
            if(firstInteger > thirdInteger) { //Início do if que avalia a expressão firstInteger > thirdInteger
               
                System.out.println("| " + firstInteger + " is larger than " +
                secondInteger + " e " + thirdInteger); //Resposta dada caso valor das expressões avaliadas sejam verdadeiros
            
            } //Fim do if que avalia a expressão firstInteger > thirdInteger

        } //Fim do if que avalia a expressão firstInteger > secondInteger

        if(secondInteger > firstInteger) { //Início do if que avalia a expressão secondInteger > firstInteger

            if(secondInteger > thirdInteger) { //Início do if que avalia a expressão secondInteger > thirdInteger
               
                System.out.println("| " + secondInteger + " is larger than " +
                firstInteger + " e " + thirdInteger); //Resposta dada caso valor das expressões avaliadas sejam verdadeiros

            } //Fim do if que avalia a expressão secondInteger > thirdInteger

        } //Fim do if que avalia a expressão secondInteger > firstInteger

        if(thirdInteger > firstInteger) { //Início do if que avalia a expressão thirdInteger > firstInteger

            if(thirdInteger > secondInteger) { //Início do if que avalia a expressão thirdInteger > secondInteger
              
                System.out.println("| " + thirdInteger + " is larger than " +
                firstInteger + " and " + secondInteger); //Resposta dada caso valor das expressões avaliadas sejam verdadeiros
            
            } //Fim do if que avalia a expressão thirdInteger > secondInteger 

        } //Fim do if que avalia a expressão thirdInteger > firstInteger
        System.out.println("|_____________________________\n"); //Exibe os caracteres entre aspas exeto caracteres de escape

        System.out.println("The smallest value:");

        System.out.println("________________________________"); //Exibe os caracteres entre aspas exeto caracteres de escape

        if(firstInteger < secondInteger) { //Início do if que avalia a expressão firstInteger < secondInteger
            
            if(firstInteger < thirdInteger) { //Inicio do if que avalia a expressão firstInteger < thirdInteger
                System.out.println("| " + firstInteger + " is smaller than " +
                secondInteger + " and " + thirdInteger); //Resposta dada caso valor das expressões avaliadas sejam verdadeiros
            }

        } //Fim do if que avalia a expressão firstInteger < secondInteger

        if(secondInteger < firstInteger) { //Início do if que avalia a expressão secondInteger < firstInteger

            if(secondInteger < thirdInteger) { //Início do if que avalia a expressão secondInteger < thirdInteger

                System.out.println("| " + secondInteger + " is smaller than " +
                firstInteger + " and " + thirdInteger); //Resposta dada caso valor das expressões avaliadas sejam verdadeiros

            } //Fim do if que avalia a expressão secondInteger < thirdInteger

        } //Fim do if que avalia a expressão secondInteger < firstInteger

        if(thirdInteger < firstInteger) { //Início do if que avalia a expressão thirdInteger < firstInteger

            if(thirdInteger < secondInteger) { //Início do if que avalia a expressão thirdInteger < secondInteger
                System.out.println("| " + thirdInteger + " is smaller than " +
                firstInteger + " and " + secondInteger); //Resposta dada caso valor das expressões avaliadas sejam verdadiros
            } //Fim do if que avalia a expressão thirdInteger < secondInteger

        } //Fim do if que avalia a expressão thirdInteger < firstInteger

        System.out.println("|_______________________________\n"); //Exibe os caracteres entre aspas exeto caracteres de escape

        input.close(); //Fecha objeto input
    } //Fim do método main
    
} //Fim da classe Questao217
