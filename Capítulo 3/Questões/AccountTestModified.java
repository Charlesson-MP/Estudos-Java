/*Questão 3.15.
* Modifica a classe AccountTest da figura 3.9 construindo um método displayAccount para
* substituir as instruções repetidas.
*/

import java.util.Scanner; //Importando a classe Scanner da java API.

public class AccountTestModified { //Início da classe AccountTest.
     
    //Método main, inicia a execução da aplicação
    public static void main(String[] args) { //Início do método main
        
        Scanner input = new Scanner(System.in); //Criando objeto da classe Scanner para entrada de dados a partir do teclado.
        double depositAmount; //Criando variável tipo double.
        double withDrawAmount; //Criando variácel tipo double.
 
        Account account1 = new Account("Jane Green", 50); //Criando objeto da classe Account.
        Account account2 = new Account("John Blue", -7.53); //Criando objeto da classe Account.
 
        System.out.println("__________________________________________________"); //Exibindo traço horizontal no terminal.
         
        displayAccount(account1); //Chamando método displayAccount com objeto account1 como argumento.
        displayAccount(account2); //Chamando método displayAccount com objeto account2 como argumento.
         
        System.out.println("|_________________________________________________"); //Exibindo traço horizontal no terminal.
 
        System.out.printf("| Enter deposit amount for %s: ", account1.getName()); //Exibe mensagem no terminal.
        depositAmount = input.nextDouble(); //Recebe valor do teclado e o atribui a variável depositAmount.
        account1.deposit(depositAmount); //Chamando o método deposit do objeto account1.
 
        System.out.println("|_________________________________________________"); //Exibindo traço horizontal no terminal.
         
        displayAccount(account1); //Chamando método displayAccount com objeto account1 como argumento.
        displayAccount(account2); //Chamando método displayAccount com objeto account2 como argumento.
 
        System.out.println("|_________________________________________________"); //Exibindo traço horizontal no terminal.
        
        System.out.printf("| Enter deposit amount for %s: ", account2.getName()); //Exibe mensagem no terminal.
        depositAmount = input.nextDouble(); //Recebe valor do teclado e o atribui a variável depositAmount.
        account2.deposit(depositAmount); //Chamando o método deposit do objeto account2.
 
        System.out.println("|_________________________________________________"); //Exibindo traço horizontal no terminal.
 
        displayAccount(account1); //Chamando método displayAccount com objeto account1 como argumento.
        displayAccount(account2); //Chamando método displayAccount com objeto account2 como argumento.
 
        System.out.println("|_________________________________________________"); //Exibindo traço horizontal no terminal.
 
        System.out.printf("| Enter withdraw amount for %s: ", account1.getName()); //Exibindo mensagem no terminal.
        withDrawAmount = input.nextDouble(); //Recebendo valor do teclado e o atribuindo à variável withDrawAmount.
        account1.withDraw(withDrawAmount); //Chamando método withDraw passando à variável withDrawAmount como argumento.
 
        System.out.println("|_________________________________________________"); //Exibindo traço horizontal no terminal.
 
        displayAccount(account1); //Chamando método displayAccount com objeto account1 como argumento.
        displayAccount(account2); //Chamando método displayAccount com objeto account2 como argumento.
 
        System.out.println("|_________________________________________________"); //Exibindo traço horizontal no terminal.
         
        System.out.printf("| Enter withdraw amount for %s: ", account2.getName()); //Exibindo mensagem no terminal.
        withDrawAmount = input.nextDouble(); //Recebendo valor do teclado e o atribuindo à variável withDrawAmount.
        account2.withDraw(withDrawAmount);
 
        System.out.println("|_________________________________________________"); //Exibindo traço horizontal no terminal.
 
        displayAccount(account1); //Chamando método displayAccount com objeto account1 como argumento.
        displayAccount(account2); //Chamando método displayAccount com objeto account2 como argumento.
 
        System.out.println("|_________________________________________________"); //Exibindo traço horizontal no terminal.
 
        input.close(); //Fecha objeto input.
 
    } //Fim do método main.


    public static void displayAccount(Account accountToDisplay) { //Início do método displayAccount.

        System.out.printf("| %s balance is %.2f.%n",
         accountToDisplay.getName(), 
         accountToDisplay.getBalance()); //Exibindo saldo de accountToDisplay no terminal.

    } //Fim do método displayAccount.
 
}//Fim da classe AccountTest.