/* Exemplo: AccountTest.java
 * Cria e manipula objetos Account e os inicializa pelo
 * construtor.
 */

public class AccountTest { //Início da classe AccountTest.
    
    //Método main, inicia a execução da aplicação.
    public static void main(String[] args) { //Início do método main.

        Account account1 = new Account("Jane Green"); //Cria um objeto Account com a string Jane Green e o atribui a variável account1.
        Account account2 = new Account("John Blue"); //Cria um objeto Account com a string John Blue e o atribui a variável account2.

        System.out.println("___________________________________"); //Exibe um traço horizontal na janela de comando.

        System.out.printf("| account1 name is: %s%n", account1.getName()); //Exibe o novo nome armazenado no objeto account1.

        System.out.println("|__________________________________"); //Exibe um traço vertical e outro horizontal na janela de comando.

        System.out.printf("| account2 name is: %s%n", account2.getName()); //Exibe o novo nome armazenado no objeto account2.

        System.out.println("|__________________________________"); //Exibe um traço vertical e outro horizontal na janela de comando.

    } //Fim do método main.

} //Fim da classe AccountTest.