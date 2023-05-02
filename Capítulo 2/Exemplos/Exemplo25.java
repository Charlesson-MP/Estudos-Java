//Quinto exemplo do capítulo 2
//Programa que recebe dois números inteiros e retorna a soma dos valores

import java.util.Scanner; //Importando a classe Scanner

public class Exemplo25 { //Início da classe Exemplo25
    //Método main, inicia a execução da aplicação
    public static void main(String[] args) { //Inicio do método main
        Scanner scan = new Scanner(System.in); //Instanciando um objeto da classe Scanner
        int firstInteger; //Declarando a primeira variável do tipo int
        int secondInteger; //Declarando a segunda variável do tipo int
        int sum; //Declarando a variável que guardará o resultado do tipo int

        System.out.printf("%s\t",
            "Enter first integer:"); //Mensagem para o usuário inserir o primeiro número
        firstInteger = scan.nextInt(); //Comando para receber o primeiro número do teclado
        System.out.printf("%s\t",
            "Enter second integer:"); //Mensagem para o usuário inserir o segundo número
        secondInteger = scan.nextInt(); //Comando para receber o segundo número do teclado

        sum = firstInteger + secondInteger; //Comando para calcular a soma

        System.out.printf("%s\t%d%n",
            "Sum is", sum); //Comando que mostrará o resultado na tela

        scan.close(); //Fecha o objeto scan
    } //Fim do método main
} //Fim da classe Exemplo25
