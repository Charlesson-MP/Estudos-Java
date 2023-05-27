/*Implementando exemplo da figura 4.12, cujo a demanda a ser atendida é receber o total de 10 valores
 * do resultado de alunos de um curso em um determinado exame. Computar quais foram aprovados e quais não
 * e exibir o resultado demandado no terminal.
 */

import java.util.Scanner; //Importando a classe Scanner da Java API.

public class Analysis { //Início da classe Analysis.
    
    //Método main, inicia a execução da aplicação.
    public static void main(String[] args) { //Início do método main.
        
        Scanner input = new Scanner(System.in); //Instanciando objeto da classe Scanner.

        int totalApproved = 0; //Variável do tipo int inicializada com valor 0.
        int totalDisapproved = 0; //Variável do tipo int inicializada com valor 0.
        int counter = 0; //Variável do tipo int inicializada com valor 0.

        System.out.println("_________________________________________"); //Exibe traço no terminal.

        while(counter < 10) { //Início da estrutura de repetição controlada pela expressão counter < 10.

            System.out.print("| Enter result (1 = pass, 2 = fail): "); //Exibe mensagem no terminal.
            int result = input.nextInt(); //Váriavel do tipo int para receber a entrada do usuáriol

            if(result == 1) { //Início da estrutura de decisão controlada pela expressão result == 1.

                totalApproved = totalApproved + 1; //1 é somado ao valor de totalApproved e atribuido a totalApproved.
                counter = counter + 1; //1 é somado ao valor de counter e atribuido a counter.

            } else if(result == 2) { //Fim da estrutura de decisão anterior e início da estrutura de decisão controlada pela expressão.

                totalDisapproved = totalDisapproved + 1; //1 é somado ao valor de totalDisapproved e atribuido a totalDisapproved.
                counter = counter + 1; //1 é somado ao valor de counter e atribuido a counter.

            } else { //Fim da estrutura de decisão anterior e início da estrutura que abranje qualquer outro valor inserido.
                
                System.out.println("| Invalid value."); //Exibe mensagem no terminal.

            } //Fim da estrutura de decisão que abrange qualquer valor.

        } //Fim da estrutura de repetição controlada pela expressão counter < 10.


        System.out.println("|________________________________________"); //Exibe traço no terminal.

        System.out.printf("| Passed: %d.%n", totalApproved); //Exibe mensagem no terminal com número de aprovados.

        System.out.printf("| Failed: %d.%n", totalDisapproved); //Exibe mensagem no terminal com o número de reprovados.

        if(totalApproved > 8) { //Início da estrutura de decisão controlada pela expressão totalApproved > 8.

            System.out.println("|________________________________________"); //Exibe traço no terminal.
            System.out.println("| Bonus to instructor!"); //Exibe mensagem no terminal.

        } //Fim da estrutura de decisão controlada pela expressão totalApproved > 8.

        System.out.println("|________________________________________"); //Exibe traço no terminal.

        input.close(); //Fecha o objeto input.

    } //Fim do método main.

} //Fim da classe Analysis.