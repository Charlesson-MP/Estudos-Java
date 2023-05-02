//Questão 2.31 do capítulo 2
//Calcular os quadrados e cubos dos números de 0 a 10 e colocar no formato da tabela apresentada no livro

public class Questao231 { //Inicio da classe Questao231
    
    //Método main, inicia a execução da aplicação
    public static void main(String[] args) { //Início do método main
        System.out.println("________________________________"); //Exibe traço horizontal no terminal para delimitar o início da saída de dados

        System.out.printf("| %s      %s      %s%n", "number", "square", "cube"); //Exibe os títulos das saídas

        System.out.printf("| %d           %d           %d%n", 0, 0 * 0, 0 * 0 * 0); //Exibe traço na horizontal e as saídas para o valor 0

        System.out.printf("| %d           %d           %d%n", 1, 1 * 1, 1 * 1 * 1); //Exibe traço na horizontal e as saídas para o valor 1

        System.out.printf("| %d           %d           %d%n", 2, 2 * 2, 2 * 2 * 2); //Exibe traço na horizontal e as saídas para o valor 2

        System.out.printf("| %d           %d           %d%n", 3, 3 * 3, 3 * 3 * 3); //Exibe traço na horizontal e as saídas para o valor 3

        System.out.printf("| %d           %d          %d%n", 4, 4 * 4, 4 * 4 * 4); //Exibe traço na horizontal e as saídas para o valor 4

        System.out.printf("| %d           %d          %d%n", 5, 5 * 5, 5 * 5 * 5); //Exibe traço na horizontal e as saídas para o valor 5

        System.out.printf("| %d           %d          %d%n", 6, 6 * 6, 6 * 6 * 6); //Exibe traço na horizontal e as saídas para o valor 6

        System.out.printf("| %d           %d          %d%n", 7, 7 * 7, 7 * 7 * 7); //Exibe traço na horizontal e as saídas para o valor 7

        System.out.printf("| %d           %d          %d%n", 8, 8 * 8, 8 * 8 * 8); //Exibe traço na horizontal e as saídas para o valor 8

        System.out.printf("| %d           %d          %d%n", 9, 9 * 9, 9 * 9 * 9); //Exibe traço na horizontal e as saídas para o valor 9

        System.out.printf("| %d          %d         %d%n", 10, 10 * 10, 10 * 10 * 10); //Exibe traço na horizontal e as saídas para o valor 10


        System.out.println("|_______________________________"); //Exibe vertical e outro traço horizontal no terminal para delimitar o fim da saída de dados

    } //Fim do método main

} //Fim da classe Questao231