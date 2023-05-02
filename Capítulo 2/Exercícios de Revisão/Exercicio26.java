//Exercício de revisão 2.6
//Recebe 3 valores inteiros, calcula seu produto, atribui a uma variável result e mostra o resultado

import java.util.Scanner; //Importando a classe Scanner

public class Exercicio26 { //Inicio da classe Exercicio 26
    //Método main, inicia a execução do aplicativo
    public static void main(String[] args) { //Inicio do método main
        Scanner input = new Scanner(System.in); //Criando um objeto da classe Scanner para entrada padrão de dados
        int x, y, z, result; //Declarando variáveis do tipo int

        System.out.printf("%s ", "Enter first integer:"); //Exibindo instrução para o usuário
        x = input.nextInt(); //Atribuindo valor inserido à variável x

        System.out.printf("%s ", "Enter second integer:"); //Exibindo instrução para o usuário
        y = input.nextInt(); //Atribuindo valor inserido à variável y

        System.out.printf("%s ", "Enter the third integer:"); //Exibindo instrução para o usuário
        z = input.nextInt(); //Atribuindo valor inserido à variável z

        result = x * y * z; //Calculando o produto

        System.out.printf("Product is %d%n", result); //Mostrando resultado na janela de comando

        input.close(); //Fecha o objeto close
    } //Fim do método main
} //Fim da classe Exercicio26