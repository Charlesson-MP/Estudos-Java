//Questão 2.28 do capítulo 2
// Receber um número inteiro e a partir dele calcular e retornar o resultado do diâmetro, circunferência e área de um círculo

import java.util.Scanner; //Importando a classe Scanner da Java API

public class Questao228 { //Início da classe Questao228

    //Método main, inicia a execução da aplicação
    public static void main(String[] args) { //Início do método main

        Scanner input = new Scanner(System.in); //Instanciando objeto da classe Scanner para entrada de dados do teclado
        int radius; //Variável do tipo int para receber o raio do círculo

        System.out.println("___________________________________"); //Exibe um traço no terminal acima do texto
        System.out.print("| Enter circle radius: "); //Exibe um traço na vertical e uma instrução para o usuário inserir o raio do círculo
        radius = input.nextInt(); //Recebe um valor inteiro do teclado e atribui a variável radius
        
        System.out.println("|__________________________________"); //Exibe um traço na vertical e uma linha para delimitar o fim da fase de entrada

        System.out.printf("%s%d%n", "| Diameter is ", 2 * radius); //Exibe um traço na vertical e o resultado do diâmetro círculo
        
        System.out.printf("%s%f%n", "| Circumference is ", 2 * Math.PI * radius); //Exibe um traço na vertical e o resultado da circunferência círculo

        System.out.printf("%s%f%n", "| Area is ", Math.PI * (radius * radius)); //Exibe um traço na vertical e o resultado da área do círculo

        System.out.println("|__________________________________"); //Exibe um traço na vertical e uma linha para delimitar o fim da saída de dados

        input.close(); //Fecha o input

    } //Fim do método main
    
} //Fim da classe Questao228