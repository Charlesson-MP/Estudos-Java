/*Exemplo da figura 4.8, onde é feito um programa para receber as notas de 10 alunos usando a estrutura
 * de repetição while e por fim calculando e exibindo a média da turma.
 */

import java.util.Scanner;

 public class ClassAverage { //Início da classe ClassAverage.
    
    //Método main, inicia a execução da aplicação.
    public static void main(String[] args) { //Início do método main.
        
        int total = 0; //Criando uma variável inteira e inicializando-a com valor 0.
        int studentsNumber = 1; //Criando uma variável inteira para controle de repetições.
        Scanner input = new Scanner(System.in); //Criando objeto da classe Scanner para entrada das notas.

        System.out.println("________________________________________"); //Exibe traço no terminal.

        while(studentsNumber <= 10) { //Início da estrutura de repetição.

            System.out.printf("| Enter %dº's student note: ", studentsNumber); //Exibe mensagem ao usuário.
            total = total + input.nextInt(); //Recebe nota do usuário, soma ao total e atribui o resultado a total.
            studentsNumber = studentsNumber + 1; //Incrementa em 1 a variável studentsNumber.

        } //Fim da estrutura de repetição.

        System.out.println("|_______________________________________"); //Exibe traço no terminal.

        System.out.printf("| Total grade is %d%n", total); //Exibe no terminal o total.

        System.out.printf("| Class average is %.2f%n", total/10.0); //Exibe no terminal o calculo da média.

        System.out.println("|_______________________________________"); //Exibe traço no terminal.

        input.close(); //Fecha o objeto input.

    } //Fim do método main.

} //Fim da classe ClassAverage.