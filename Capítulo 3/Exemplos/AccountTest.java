/* Exemplo 3.2: AccountTest.java
 * Cria e manipula um objeto Account.
 */

import java.util.Scanner; //Importa a classe Scanner da Java API.

public class AccountTest { //Início da classe AccountTest.
    
    //Método main, inicia a execução da aplicação
    public static void main(String[] args) { //Início do método main

        Scanner input = new Scanner(System.in); //Cria um objeto Scanner para receber uma entrada pela janela de comando.

        Account myAccount = new Account(); //Cria um objeto Account e o atribui a variável myAccount.

        System.out.println("_____________________________________________"); //Exibe um traço horizontal na janela de comando.

        System.out.printf("| Initial name is: %s%n", myAccount.getName()); //Exibe um traço vertical e o nome inicial da conta na janela de comando.

        System.out.println("|____________________________________________"); //Exibe um traço vertical e outro horizontal na janela de comando.
        
        System.out.print("| Please enter the name: "); //Exibe na janela de comando um traço vertical e a instrução para o usuário inserir o nome.
        myAccount.setName(input.nextLine()); //Recebe o nome através do método nextLine() do objeto input e o passa como parâmetro para o método setName do objeto myAccount.

        System.out.println("|____________________________________________"); //Exibe um traço vertical e outro horizontal na janela de comando.

        System.out.printf("| Name in object myAccount is: %s%n", myAccount.getName()); //Exibe o novo nome armazenado no objeto myAccount.

        System.out.println("|____________________________________________"); //Exibe um traço vertical e outro horizontal na janela de comando.

        input.close(); //Fecha o objeto input

    } //Fim do método main.

} //Fim da classe AccountTest.