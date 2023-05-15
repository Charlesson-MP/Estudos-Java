/*Questão 3.12.
 * Classe para testar objetos da classe Invoice.
 */

import java.util.Scanner; //Importando a classe Scanner da java API.

public class InvoiceTest { //Início da classe InvoiceTest.
    
    //Método main, inicia a execução da aplicação.
    public static void main(String[] args) { //Início do método main.

        Scanner input = new Scanner(System.in); //Objeto da classe Scanner para entrada de dados à partir do teclado.

        Invoice fatura1 = new Invoice("0001", "Mouse simples.", 30, 17.00); //Objeto da classe Invoice.

        System.out.println("________________________________________"); //Exibe um traço no terminal.

        System.out.printf("| Number: %s%n| Description: %s%n| Amout: %d%n| Price Unit: $%.2f%n| Invoice Amount: $%.2f%n",
         fatura1.getNumber(),
         fatura1.getDescription(),
         fatura1.getAmount(),
         fatura1.getPriceUnit(), 
         fatura1.getInvoiceAmount()); //Exibe a fatura com os valores de todas as variáveis de instância no terminal e o valor da fatura.

        System.out.println("|_______________________________________"); //Exibe um traço no terminal.

        System.out.print("| Enter new Amount: "); //Exibe mensagem no terminal.
        fatura1.setAmount(input.nextInt());

        System.out.println("|_______________________________________"); //Exibe um traço no terminal.

        System.out.printf("| Number: %s%n| Description: %s%n| Amout: %d%n| Price Unit: $%.2f%n| Invoice Amount: $%.2f%n",
         fatura1.getNumber(),
         fatura1.getDescription(),
         fatura1.getAmount(),
         fatura1.getPriceUnit(), 
         fatura1.getInvoiceAmount()); //Exibe a fatura com os valores de todas as variáveis de instância no terminal e o valor da fatura.

        System.out.println("|_______________________________________"); //Exibe um traço no terminal.

        System.out.print("| Enter new price unit: $");
        fatura1.setPriceUnit(input.nextDouble());

        System.out.println("|_______________________________________"); //Exibe um traço no terminal.

        System.out.printf("| Number: %s%n| Description: %s%n| Amout: %d%n| Price Unit: $%.2f%n| Invoice Amount: $%.2f%n",
         fatura1.getNumber(),
         fatura1.getDescription(),
         fatura1.getAmount(),
         fatura1.getPriceUnit(), 
         fatura1.getInvoiceAmount()); //Exibe a fatura com os valores de todas as variáveis de instância no terminal e o valor da fatura.

        System.out.println("|_______________________________________"); //Exibe um traço no terminal.

        input.close(); //Fecha o objeto input.

    } //Fim do método main.

} //Fim da classe InvoiceTest.