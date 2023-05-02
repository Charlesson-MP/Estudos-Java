//Questão 2.25 do capítulo 2
//Recebe um valor inteiro e retorna se é par ou ímpar

import java.util.Scanner; //Importando a classe Scanner da Java API 

public class Questao225 { //Início da classe Questao225
    
    //Método main, inicia a execução da aplicação
    public static void main(String[] args) { //Início do método main
    
        Scanner input = new Scanner(System.in); //Instanciando um objeto da classe Scanner
        int value; //Declarando variável do tipo inteiro

        System.out.println("____________________"); //Exibe uma linha horizontal no terminal
        System.out.print("| Enter a value: "); //Exibe uma instrução para o usuário sobre o que fazer
        value = input.nextInt(); //Recebe um valor inteiro do teclado e atribui a variável value
        System.out.println("|___________________"); //Exibe uma barra vertical e uma linha horizontal no terminal

        if(value % 2 == 0) { //Início do if que avalia a expressão value % 2 == 0

            System.out.println("| " + value + " is even."); //Exibe no terminal que o valor é par

        } //Fim do if que avalia a expressão value % 2 == 0

        if(value % 2 != 0) { //Início do if que avalia a expressão value % 2 != 0

            System.out.println("| " + value + " is odd."); //Exibe no terminal que o valor é ímpar

        } //Fim do if que avalia a expressão value % 2 != 0

        System.out.println("|___________________"); //Exibe uma barra vertical e uma linha horizontal no terminal

        input.close(); //Fecha o objeto input

    } //Fim do método main

} //Fim da classe Questao225
