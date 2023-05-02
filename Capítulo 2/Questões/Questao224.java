//Questão 2.24 do capítulo 2
//Recebe 5 valores inteiros do usuário e determina o maior e o menor utilizando apenas os recursos do capítulo 2

import java.util.Scanner;

public class Questao224 { //Início da classe Questao224

    //Método main, inicia a execução do aplicação
    public static void main(String[] args) { //Início do método main

        Scanner input = new Scanner(System.in); //Instaciando objeto da classe Scanner
        int firstInteger, //Declarando variável para receber o primeiro valor
            secondInteger, //Declarando variável para receber o segundo valor
            thirdInteger, //Declarando variável para receber o terceiro valor
            fourthInteger, //Declarando variável para receber o quarto valor
            fifthInteger; //Declarando variável para receber o quinto valor

        System.out.println("___________________________"); //Instrução para deslocar o cursor uma linha e imprimir um traço
        
        System.out.print("| Enter first integer:  "); //Instrução para imprimir os caracteres entre aspas
        firstInteger = input.nextInt(); //Instrução que recebe um valor inteiro do teclado e atribui a variável first integer 
        
        System.out.print("| Enter second integer: "); //Instrução para imprimir os caracteres entre aspas
        secondInteger = input.nextInt(); //Instrução que recebe um valor inteiro do teclado e atribui a variável secondInteger

        System.out.print("| Enter third integer:  "); //Instrução para imprimir os caracteres entre aspas
        thirdInteger = input.nextInt(); //Instrução que recebe um valor inteiro do teclado e atribui a variável thirdInteger

        System.out.print("| Enter fourth integer: "); //Instrução para imprimir os caracteres entre aspas
        fourthInteger = input.nextInt(); //Instrução que recebe um valor inteiro do teclado e atribui a variável fourthInteger
    
        System.out.print("| Enter fifth integer:  "); //Instrução para imprimir os caracteres entre aspas
        fifthInteger = input.nextInt(); //Instrução que recebe um valor inteiro do teclado e atribui a variável fifthInteger
    
        System.out.println("|__________________________"); //Instrução para imprimir um traço

        if(firstInteger > secondInteger) { //Início do if que avalia a expressão firstInteger > secondInteger

            if(firstInteger > thirdInteger) { //Início do if que avalia a expressão firstInteger > thirdInteger

                if(firstInteger > fourthInteger) { //Início do if que avalia a expressão firstInteger > fourthInteger

                    if(firstInteger > fifthInteger) { //Início do if que avalia a expressão firstInteger > fifthInteger

                        System.out.println("| " + firstInteger + " is the largest value.");

                    } //Fim do if que avalia a expressão firstInteger > fifthInteger

                } //Fim do if que avalia a expressão firstInteger > fourthInteger

            } //Fim do if que avalia a expressão firstInteger > thirdInteger

        } //Fim do if que avalia a expressão firstInteger > secondInteger


        if(secondInteger > firstInteger) { //Início do if que avalia a expressão secondInteger > firstInteger

            if(secondInteger > thirdInteger) { //Início do if que avalia a expressão secondInteger > thirdInteger

                if(secondInteger > fourthInteger) { //Início do if que avalia a expressão secondInteger > fourthInteger

                    if(secondInteger > fifthInteger) { //Início do if que avalia a expressão secondInteger > fifthInteger

                        System.out.println("| " + secondInteger + " is the largest value.");

                    } //Fim do if que avalia a expressão secondInteger > fifthInteger

                } //Fim do if que avalia a expressão secondInteger > fourthInteger

            } //Fim do if que avalia a expressão secondInteger > thirdInteger

        } //Fim do if que avalia a expressão secondInteger > firstInteger


        if(thirdInteger > firstInteger) { //Início do if que avalia a expressão thirdInteger > firstInteger

            if(thirdInteger > secondInteger) { //Início do if que avalia a expressão thirdInteger > secondInteger

                if(thirdInteger > fourthInteger) { //Início do if que avalia a expressão thirdInteger > fourthInteger

                    if(thirdInteger > fifthInteger) { //Início do if que avalia a expressão thirdIntegerInteger > fifthInteger

                        System.out.println("| " + thirdInteger + " is the largest value.");

                    } //Fim do if que avalia a expressão thirdInteger > fifthInteger

                } //Fim do if que avalia a expressão thirdInteger > fourthInteger

            } //Fim do if que avalia a expressão thirdInteger > secondInteger

        } //Fim do if que avalia a expressão thirdInteger > firstInteger


        if(fourthInteger > firstInteger) { //Início do if que avalia a expressão fourthInteger > firstInteger

            if(fourthInteger > secondInteger) { //Início do if que avalia a expressão fourthInteger > secondInteger

                if(fourthInteger > thirdInteger) { //Início do if que avalia a expressão fourthInteger > thirdInteger

                    if(fourthInteger > fifthInteger) { //Início do if que avalia a expressão fourthInteger > fifthInteger

                        System.out.println("| " + fourthInteger + " is the largest value.");

                    } //Fim do if que avalia a expressão fourthInteger > fifthInteger

                } //Fim do if que avalia a expressão fourthInteger > thirdInteger

            } //Fim do if que avalia a expressão fourthInteger > secondInteger

        } //Fim do if que avalia a expressão fourthInteger > firstInteger


        if(fifthInteger > firstInteger) { //Início do if que avalia a expressão fifthInteger > firstInteger

            if(fifthInteger > secondInteger) { //Início do if que avalia a expressão fifthInteger > secondInteger

                if(fifthInteger > thirdInteger) { //Início do if que avalia a expressão fifthInteger > thirdInteger

                    if(fifthInteger > fourthInteger) { //Início do if que avalia a expressão fifthInteger > fourthInteger

                        System.out.println("| " + fifthInteger + " is the largest value.");

                    } //Fim do if que avalia a expressão fifthInteger > fourthInteger

                } //Fim do if que avalia a expressão fifthInteger > thirdInteger

            } //Fim do if que avalia a expressão fifthInteger > secondInteger

        } //Fim do if que avalia a expressão fifthInteger > firstInteger

        System.out.println("|__________________________"); //Instrução para imprimir um traço


        if(firstInteger < secondInteger) { //Início do if que avalia a expressão firstInteger < secondInteger

            if(firstInteger < thirdInteger) { //Início do if que avalia a expressão firstInteger < thirdInteger

                if(firstInteger < fourthInteger) { //Início do if que avalia a expressão firstInteger < fourthInteger

                    if(firstInteger < fifthInteger) { //Início do if que avalia a expressão firstInteger < fifthInteger

                        System.out.println("| " + firstInteger + " is the smallest value.");

                    } //Fim do if que avalia a expressão firstInteger < fifthInteger

                } //Fim do if que avalia a expressão firstInteger < fourthInteger

            } //Fim do if que avalia a expressão firstInteger < thirdInteger

        } //Fim do if que avalia a expressão firstInteger < secondInteger


        if(secondInteger < firstInteger) { //Início do if que avalia a expressão secondInteger < firstInteger

            if(secondInteger < thirdInteger) { //Início do if que avalia a expressão secondInteger < thirdInteger

                if(secondInteger < fourthInteger) { //Início do if que avalia a expressão secondInteger < fourthInteger

                    if(secondInteger < fifthInteger) { //Início do if que avalia a expressão secondInteger < fifthInteger

                        System.out.println("| " + secondInteger + " is the smallest value.");

                    } //Fim do if que avalia a expressão secondInteger < fifthInteger

                } //Fim do if que avalia a expressão secondInteger < fourthInteger

            } //Fim do if que avalia a expressão secondInteger < thirdInteger

        } //Fim do if que avalia a expressão secondInteger < firstInteger


        if(thirdInteger < firstInteger) { //Início do if que avalia a expressão thirdInteger < firstInteger

            if(thirdInteger < secondInteger) { //Início do if que avalia a expressão thirdInteger < secondInteger

                if(thirdInteger < fourthInteger) { //Início do if que avalia a expressão thirdInteger < fourthInteger

                    if(thirdInteger < fifthInteger) { //Início do if que avalia a expressão thirdIntegerInteger < fifthInteger

                        System.out.println("| " + thirdInteger + " is the smallest value.");

                    } //Fim do if que avalia a expressão thirdInteger < fifthInteger

                } //Fim do if que avalia a expressão thirdInteger < fourthInteger

            } //Fim do if que avalia a expressão thirdInteger < secondInteger

        } //Fim do if que avalia a expressão thirdInteger < firstInteger


        if(fourthInteger < firstInteger) { //Início do if que avalia a expressão fourthInteger < firstInteger

            if(fourthInteger < secondInteger) { //Início do if que avalia a expressão fourthInteger < secondInteger

                if(fourthInteger < thirdInteger) { //Início do if que avalia a expressão fourthInteger < thirdInteger

                    if(fourthInteger < fifthInteger) { //Início do if que avalia a expressão fourthInteger < fifthInteger

                        System.out.println("| " + fourthInteger + " is the smallest value.");

                    } //Fim do if que avalia a expressão fourthInteger < fifthInteger

                } //Fim do if que avalia a expressão fourthInteger < thirdInteger

            } //Fim do if que avalia a expressão fourthInteger < secondInteger

        } //Fim do if que avalia a expressão fourthInteger < firstInteger


        if(fifthInteger < firstInteger) { //Início do if que avalia a expressão fifthInteger < firstInteger

            if(fifthInteger < secondInteger) { //Início do if que avalia a expressão fifthInteger < secondInteger

                if(fifthInteger < thirdInteger) { //Início do if que avalia a expressão fifthInteger < thirdInteger

                    if(fifthInteger < fourthInteger) { //Início do if que avalia a expressão fifthInteger < fourthInteger

                        System.out.println("| " + fifthInteger + " is the smallest value.");

                    } //Fim do if que avalia a expressão fifthInteger < fourthInteger

                } //Fim do if que avalia a expressão fifthInteger < thirdInteger

            } //Fim do if que avalia a expressão fifthInteger < secondInteger

        } //Fim do if que avalia a expressão fifthInteger < firstInteger

        System.out.println("|__________________________\n"); //Instrução para imprimir um traço

        input.close(); //Fecha o objeto input

    } //Fim do método main
    
} //Fim da classe Questao224
