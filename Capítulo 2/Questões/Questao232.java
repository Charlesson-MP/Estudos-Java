//Questão 2.32 do capítulo 2
//Receber 5 valores inteiros, determinar e exibir a quantidade de negativos, positivos e zeros

import java.util.Scanner; //Importando a classe Scanner da Java API

public class Questao232 { //Início da classe Questao232

    //Método main, inicia a execução da aplicação
    public static void main(String[] args) { //Início do método main

        Scanner input = new Scanner(System.in); //Instanciando objeto da classe Scanner para entrada de valores do teclado

        int firstInteger, //Declarando variável para receber o primeiro número inteiro
            secondInteger, //Declarando variável para receber o segundo número inteiro
            thirdInteger, //Declarando variável para receber o terceiro número inteiro
            fourthInteger, //Declarando variável para receber o quarto número inteiro
            fifthInteger, //Declarando variável para receber o quinto número inteiro
            negatives = 0, //Declarando variável para guardar o número de valores negativos e inicializando com 0
            positives = 0, //Declarando variável para guardar o número de valores positivos e inicializando com 0
            zeros = 0; //Declarando variável para guardar o número de zeros e inicializando com 0

        System.out.println("___________________________________"); //Exibe traço horizontal para demarcar o início da entrada de dados

        System.out.print("| Enter first integer:  "); //Exibe traço na vertical e a instrução para o usuário digitar o primeiro número

        firstInteger = input.nextInt(); //Recebe valor do teclado e o atribui a variável firstInteger

        System.out.print("| Enter second integer: "); //Exibe traço na vertical e a instrução para o usuário digitar o segundo número

        secondInteger = input.nextInt(); //Recebe valor do teclado e o atribui a variável secondInteger

        System.out.print("| Enter third integer:  "); //Exibe traço na vertical e a instrução para o usuário digitar o terceiro número

        thirdInteger = input.nextInt(); //Recebe valor do teclado e o atribui a variável thirdInteger

        System.out.print("| Enter fourth integer: "); //Exibe traço na vertical e a instrução para o usuário digitar o quarto número

        fourthInteger = input.nextInt(); //Recebe valor do teclado e o atribui a variável fourthInteger

        System.out.print("| Enter fifth integer:  "); //Exibe traço na vertical e a instrução para o usuário digitar o quinto número

        fifthInteger = input.nextInt(); //Recebe valor do teclado e o atribui a variável thirdInteger

        System.out.println("|__________________________________"); //Exibe traço vertical e um horizontal para demarcar o fim da entrada de dados


        if(firstInteger > 0) { //Início do if que avalia a expressão firstInteger > 0

            positives = positives + 1; //Somando um ao valor da variável positives

        } //Fim do if que avalia a expressão firstInteger > 0

        if(firstInteger < 0) { //Início do if que avalia a expressão firstInteger < 0

            negatives = negatives + 1; //Somando um ao valor da variável negatives

        } //Fim do if que avalia a expressão firstInteger < 0

        if(firstInteger == 0) { //Início do if que avalia a expressão firstInteger == 0

            zeros = zeros + 1; //Somando um ao valor da variável zeros

        } //Fim do if que avalia a expressão firstInteger == 0


        if(secondInteger > 0) { //Início do if que avalia a expressão secondInteger > 0

            positives = positives + 1; //Somando um ao valor da variável positives

        } //Fim do if que avalia a expressão secondInteger > 0

        if(secondInteger < 0) { //Início do if que avalia a expressão secondInteger < 0

            negatives = negatives + 1; //Somando um ao valor da variável negatives 

        } //Fim do if que avalia a expressão secondInteger < 0

        if(secondInteger == 0) { //Início do if que avalia a expressão secondInteger == 0

            zeros = zeros + 1; //Somando um ao valor da variável zeros

        } //Fim do if que avalia a expressão secondInteger == 0


        if(thirdInteger > 0) { //Início do if que avalia a expressão thirdInteger > 0

            positives = positives + 1; //Somando um ao valor da variável positives

        } //Fim do if que avalia a expressão thirdInteger > 0

        if(thirdInteger < 0) { //Início do if que avalia a expressão thirdInteger < 0

            negatives = negatives + 1; //Somando um ao valor da variável negatives 

        } //Fim do if que avalia a expressão thirdInteger < 0

        if(thirdInteger == 0) { //Início do if que avalia a expressão thirdInteger == 0

            zeros = zeros + 1; //Somando um ao valor da variável zeros

        } //Fim do if que avalia a expressão thirdInteger == 0


        if(fourthInteger > 0) { //Início do if que avalia a expressão fourthInteger > 0

            positives = positives + 1; //Somando um ao valor da variável positives

        } //Fim do if que avalia a expressão fourtInteger > 0

        if(fourthInteger < 0) { //Início do if que avalia a expressão fourthInteger < 0

            negatives = negatives + 1; //Somando um ao valor da variável negatives 

        } //Fim do if que avalia a expressão fourthInteger < 0

        if(fourthInteger == 0) { //Início do if que avalia a expressão fourthInteger == 0

            zeros = zeros + 1; //Somando um ao valor da variável zeros

        } //Fim do if que avalia a expressão fourthInteger == 0


        if(fifthInteger > 0) { //Início do if que avalia a expressão fifthInteger > 0

            positives = positives + 1; //Somando um ao valor da variável positives

        } //Fim do if que avalia a expressão fifthInteger > 0

        if(fifthInteger < 0) { //Início do if que avalia a expressão fifthInteger < 0

            negatives = negatives + 1; //Somando um ao valor da variável negatives 

        } //Fim do if que avalia a expressão fifthInteger < 0

        if(fifthInteger == 0) { //Início do if que avalia a expressão fifthInteger == 0

            zeros = zeros + 1; //Somando um ao valor da variável zeros

        } //Fim do if que avalia a expressão fifthInteger == 0

        System.out.printf("| Positives = %d%n", positives); //Exibe um traço vertical, um título para os valores positivos e a quantidade deles

        System.out.printf("| Negatives = %d%n", negatives); //Exibe um traço vertical, um título para os valores negativos e a quantidade deles

        System.out.printf("| Zeros = %d%n", zeros); //Exibe um traço vertical, um título para os zeros e a quantidade deles


        System.out.println("|__________________________________"); //Exibe traço vertical e um horizontal para demarcar o fim da saída de dados

        input.close(); //Fecha o input

    } //Fim do método main
    
} //Fim da classe Questao232