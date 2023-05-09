/* Exemplo: AccountTest.java
 * Cria e manipula objetos Account e os inicializa pelo
 * construtor.
 */

import java.util.Scanner; //Importando a classe Scanner da Java API.

public class AccountTest { //Início da classe AccountTest.
    
    //Método main, inicia a execução da aplicação.
    public static void main(String[] args) { //Início do método main.

        Scanner input = new Scanner(System.in); //Cria objeto Scanner para entrada de dados a partir da janela de comando

        Account account1 = new Account("Jane Green", 50.00); //Cria um objeto Account com a string Jane Green e o atribui a variável account1.
        Account account2 = new Account("John Blue", -7.53); //Cria um objeto Account com a string John Blue e o atribui a variável account2.

        System.out.println("__________________________________________"); //Exibe um traço horizontal na janela de comando.

        System.out.printf("| %s balance: $%.2f %n", account1.getName(), account1.getBalance()); //Exibe o nome e o saldo armazenado no objeto account1.

        System.out.println("|_________________________________________"); //Exibe um traço vertical e outro horizontal na janela de comando.

        System.out.printf("| %s balance: %.2f %n", account2.getName(), account2.getBalance()); //Exibe o nome e o saldo armazenado no objeto account2.

        System.out.println("|_________________________________________"); //Exibe um traço vertical e outro horizontal na janela de comando.


        System.out.print("| Enter deposit amount for account1: "); //Mensagem de instrução para o usuário.
        double depositAmount = input.nextDouble(); //Variável de instância balance do objeto account1 recebe o valor digitado.
        System.out.printf("|%n| Adding %.2f to account1 balance.%n", depositAmount); //Mensagem ao usuário.
        account1.deposit(depositAmount); //Adicionando o inserido valor ao objeto account1.

        System.out.println("|_________________________________________"); //Exibe um traço vertical e outro horizontal na janela de comando.

        System.out.printf("| %s balance: $%.2f %n", account1.getName(), account1.getBalance()); //Exibe o nome e o saldo armazenado no objeto account1.

        System.out.println("|_________________________________________"); //Exibe um traço vertical e outro horizontal na janela de comando.

        System.out.printf("| %s balance: %.2f %n", account2.getName(), account2.getBalance()); //Exibe o nome e o saldo armazenado no objeto account2.

        System.out.println("|_________________________________________"); //Exibe um traço vertical e outro horizontal na janela de comando.


        System.out.print("| Enter deposit amount for account2: "); //Mensagem de instrução para o usuário.
        depositAmount = input.nextDouble(); //Variável de instância balance do objeto account1 recebe o valor digitado.
        System.out.printf("|%n| Adding %.2f to account2 balance.%n", depositAmount); //Mensagem ao usuário.
        account2.deposit(depositAmount); //Adicionando o inserido valor ao objeto account1.

        System.out.println("|_________________________________________"); //Exibe um traço vertical e outro horizontal na janela de comando.

        System.out.printf("| %s balance: $%.2f %n", account1.getName(), account1.getBalance()); //Exibe o nome e o saldo armazenado no objeto account1.

        System.out.println("|_________________________________________"); //Exibe um traço vertical e outro horizontal na janela de comando.

        System.out.printf("| %s balance: %.2f %n", account2.getName(), account2.getBalance()); //Exibe o nome e o saldo armazenado no objeto account2.

        System.out.println("|_________________________________________"); //Exibe um traço vertical e outro horizontal na janela de comando.


        input.close(); //Fecha objeto input.

    } //Fim do método main.

} //Fim da classe AccountTest.