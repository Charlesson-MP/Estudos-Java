/*Implementando minha versão da resolução do exemplo apresentado na figura 4.10
 * Resolvendo problema da média da classe usando repetição controlada por sentinela.
 */

import java.util.Scanner; //Importando a classe Scanner da Java API.

public class ClassAverage2 { //Início da classe ClassAverage2.
    
    //Método main, inicia a execução da aplicação.
    public static void main(String[] args) {//Início do método main.
        
        Scanner input = new Scanner(System.in); //Instanciando objeto da classe Scanner para entrada de dados.

        int total = 0; //Criando e inicializando variável do tipo int com valor 0.
        int counter = 0; //Criando e inicializando variável do tipo int com valor 0.
        

        System.out.println("________________________________________"); //Exibe traço no terminal.

        System.out.printf("| Enter %dª grade or -1 to quit: ", counter + 1);
        int grade = input.nextInt(); //Atribuindo valor recebido a variável grade.

        while(grade != -1) { //Início da estrutura de repetição controlada pela expressão grade != -1.

            total = total + grade; //Incrementa o valor de total com o valor de grade.
            counter = counter + 1; //Incrementa o valor de counter em 1.

            System.out.printf("| Enter %dª grade or -1 to quit: ", counter + 1); //Exibe mensagem no terminal.
            grade = input.nextInt(); //Recebe valor do teclado.     

        } //Fim da estrutura de repetição controlada pela expressão grade != -1.

        System.out.println("|_______________________________________"); //Exibe traço no terminal.

        if(total == 0) //Estrutura de decisão que avalia a expressão total == 0.
            System.out.println("| No grades were entered."); //Mensagem exibida caso a espressão total == 0 for verdadeira

        else { //Início da decisão tomada caso a expressão total == 0 seja falsa.

            double classAverage = (double) total/counter; //Calculando e  o valor da média e o atribuindo a variável classAverage.
            System.out.printf("| Total of the %d grades entered is %d.%n", counter, total); //Exibindo mensagem com total de notas e a soma total.
            System.out.printf("| Class average is: %.2f%n", classAverage); //Exibindo a média da turma.

        } //Fim da estrutura de decisão tomada caso a expressão total == 0 seja falsa

        System.out.println("|_______________________________________"); //Exibe traço no terminal.

        input.close(); //Fecha objeto input.

    } //Fim do método main.

} //Fim da classe ClassAverage2.