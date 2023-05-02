//Questão 2.33 do capítulo 2
//Calculadora de IMC, recebe o peso e a altura do usuário e calcula seu IMC

import java.util.Scanner; //Importando a classe Scanner

public class Questao233 { //Início da classe Questao233
    
    //Método main, inicia a execução da aplicação
    public static void main(String[] args) { //Início do método main

        Scanner input = new Scanner(System.in); //Instanciando objeto da classe Scanner para leitura de dados do teclado
        double weight;
        double height;

        System.out.println("_____________________________________"); //Exibe no terminal um traço para delimitar o início da entrada de dados

        System.out.print("| Enter the weight: "); //Exibe ao usuário um traço vertical e uma instrução para inserir o peso
        weight = input.nextDouble(); //Recebe o valor do peso como real e atribui a variável weight

        System.out.print("| Enter the height: "); //Exibe ao usuário um traço vertical e uma instrução para inserir o tamanho
        height = input.nextDouble(); //Recebe o valor do tamanho como real e atribui a variável size

        System.out.println("|____________________________________"); //Exibe no terminal um traço na vertical e outro na horizontal para delimitar o fim da entrada de dados

        System.out.printf("| BMI = %2f%n", weight/(height * height)); //Exibe o resultado do cálculo

        System.out.println("|____________________________________"); //Exibe no terminal um traço na vertical e outro na horizontal para delimitar o fim do resultado

        System.out.println("|              BMI VALUES               "); //Exibe no terminal o título para os valores padrões de peso

        System.out.println("| Underweight: less than 18.5"); //Exibe no terminal um traço na vertical e o valor padrão pra quem esta abaixo do peso ideal
        System.out.println("| Normal:      between 18.5 and 24.9"); //Exibe no terminal um traço na vertical e o valor padrão pra quem esta no peso ideal
        System.out.println("| Overweight:  between 25 and 29.9"); //Exibe no terminal um traço na vertical e o valor padrão pra quem esta acima do peso 
        System.out.println("| Obese:       30 or greater"); //Exibe no terminal um traço na vertical e o valor padrão pra quem esta obeso
        System.out.println("|____________________________________"); //Exibe no terminal um traço na vertical e outro na horizontal para delimitar o fim dos valores padrões
        
        input.close();

    } //Fim do método main

} //Fim da classe Questao233