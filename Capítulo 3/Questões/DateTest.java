/*Questão 3.14.
 * Classe DateTest para usar objetos do tipo Date.
 */

import java.util.Scanner; //Importando a classe Scanner da java API.

public class DateTest { //Início da classe DateTest.

    //Método main, inicia a execução da aplicação.
    public static void main(String[] args) { //Início do método main.

        Scanner input = new Scanner(System.in); //Criando objeto da classe Scanner.

        Date dateTest = new Date(5, 16, 2023); //Criando objeto da classe Date.

        System.out.println("_________________________"); //Exibe um traço no terminal.

        dateTest.displayDate(); //Chamando o método displayDate do objeto dateTest.

        System.out.println("|________________________"); //Exibe um traço no terminal.

        System.out.print("| Enter the month: "); //Exibe mensagem no terminal.
        dateTest.setMonth(input.nextInt()); //Recebe valor do teclado e passa como argumento ao método setMonth do objeto dateTest.

        System.out.println("|________________________"); //Exibe um traço no terminal.

        System.out.print("| Enter the day: "); //Exibe mensagem no terminal.
        dateTest.setDay(input.nextInt()); //Recebe valor do teclado e passa como argumento ao método setDay do objeto dateTest.

        System.out.println("|________________________"); //Exibe um traço no terminal.

        System.out.print("| Enter the year: "); //Exibe mensagem no terminal.
        dateTest.setYear(input.nextInt()); ////Recebe valor do teclado e passa como argumento ao método setYear do objeto dateTest.

        System.out.println("|________________________"); //Exibe um traço no terminal.

        dateTest.displayDate(); //Chamando o método displayDate do objeto dateTest.

        System.out.println("|________________________"); //Exibe um traço no terminal.

        input.close(); //Fecha o objeto input.

    } //Fim do método main.
    
} //Fim da classe DateTest.