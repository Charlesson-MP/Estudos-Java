//Sexto exemplo do capítulo 2
//Recebe 2 valores e os compara usando a instrução if com os operadores de igualdade e os relacionais

import java.util.Scanner; //Importando a classe Scanner

public class Exemplo26 { //Inicio da classe Exemplo26
    //Método main, inicia a execução do aplicativo
    public static void main(String[] args) { //Inicio do método main

        Scanner scan = new Scanner(System.in); //Instanciando objeto da classe Scanner
        int number1, number2; //Declarando duas variáveis inteiras

        System.out.printf("%s ",
            "Enter first integer:"); //Mensagem para o usuário inserir o primeiro número
        
        number1 = scan.nextInt(); //number1 recebe primeiro valor do teclado

        System.out.printf("%s ",
            "Enter second integer:"); //Mensagem para o usuário inserir o segundo número

        number2 = scan.nextInt(); //number2 recebe segundo valor do teclado

        if(number1 == number2) { //Inicio do bloco if

            System.out.printf("%d == %d%n", number1, number2); //Instrução executada caso a condição number1 == number2 seja verdadeira

        } //Fim do bloco if

        if(number1 != number2) { //Inicio do bloco if
            
            System.out.printf("%d != %d%n", number1, number2); //Instrução executada caso a condição number1 != number2 seja verdadeira

        } //Fim do bloco if

        if(number1 < number2) { //Inicio do bloco if

            System.out.printf("%d < %d%n", number1, number2); //Instrução executada caso a condição number1 < number2 seja verdadeira

        } //Fim do bloco if

        if(number1 > number2) { //Inicio do bloco if

            System.out.printf("%d > %d%n", number1, number2); //Instrução executada caso a condição number1 > number2 seja verdadeira

        } //Fim do bloco if

        if(number1 <= number2) { //Inicio do bloco if
        
            System.out.printf("%d <= %d%n", number1, number2); //Instrução executada caso a condição number1 <= number2 seja verdadeira

        } //Fim do bloco if

        if(number1 >= number2) { //Inicio do bloco if

            System.out.printf("%d >= %d%n", number1, number2); //Instrução executada caso a condição number1 >= number2 seja verdadeira

        } //Fim do bloco if

        scan.close(); // Fechando o objeto scan
    } //Fim do método main
} //Fim da classe Exemplo26
