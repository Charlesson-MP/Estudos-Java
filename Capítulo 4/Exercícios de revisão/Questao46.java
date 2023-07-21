/*
 * Combine as instruções escritas no Exercício 4.5 em um aplicativo Java que calcula e imprime a soma dos
 * inteiros de 1 a 10. Utilize a instrução while para fazer loop pelas instruções de cálculo e incremento.
 *  O loop deve terminar quando o valor de x tornar-se 11.
 */

public class Questao46 { //Início da classe Questão46

    //Método main, inicia a execução da aplicação
    public static void main(String[] args) {

        int sum = 0;
        int x = 0;

        while(x <= 10) { //Início da estrutura de repetição controlada pela expressão x < 11

            sum += x++;

        } //Fim da estrutura de repetição controlada pela expressão x < 11 

        System.out.println("_______________"); //Exibe traço horizontal no terminal
        System.out.printf("|Sum = %d%n|x = %d%n", sum, x); //Exibe o resultado no terminal
        System.out.println("|______________"); //Exibe traço horizontal no terminal

    } //Fim do método main

} //Fim da classe Questão46