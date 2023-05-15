/* Questão 3.11.
 * Modificar a classe Account da figura 3.8 para fornecer um método de saque que analise antes se há saldo disponível
 * para o saque, se não houver retornar uma mensagem ao usuário.
 */

 public class Account { //Início da classe Account.

    private String name; //Variável de instância.
    private double balance; //Variável de instância.

    public Account(String name, double balance) { //Início do método Account.
        this.name = name; //Atribuindo o argumento recebido no parâmetro name à variável de instância name.

        if(balance > 0.0) { //Início do if que verifica à expressão balance > 0.0.

            this.balance = balance; //Atribuindo o argumento recebido no parâmetro balance à variável de instância balance.

        } //Fim do if que verifica a expressão balance > 0.0.
    } //Fim do método Account.


    public void deposit(double depositAmount) { //Início do método deposit.

        if(depositAmount > 0.0) { //Início do if que verifica à expressão depositAmount > 0.0.

            System.out.printf("| Adding $%.2f to %s balance.%n", depositAmount, this.name); //Exibindo mensagem no terminal.
            this.balance = this.balance + depositAmount; //Somando o valor de balance ao de depositAmount e atribuindo ao valor de balance.

        } //Fim do if que verifica à expressão depositAmount > 0.0.

        if(depositAmount <= 0) { //Início do if que verifica à expressão depositAmount <= 0.

            System.out.println("| Invalid deposit amount.");

        } //Fim do if que verifica à expressão depositAmount <= 0

    } //Fim do método deposit.


    public void withDraw(double withDrawAmount) { //Início do método withDraw.
        
        if(withDrawAmount > this.balance) { //Início do if que verifica à expressão withDrawAmount > this.balance.

            System.out.println("| Withdrawal amount exceeded account balance."); //Exibe mensagem no terminal.

        } //Fim do if que verifica à expressão whithDrawAmount > this.balance.

        if(withDrawAmount <= this.balance) { //Início do if que verifica à expressão withDrawAmount <= this.balance.

            this.balance = this.balance - withDrawAmount; //Debita o valor de withDrawAmout do balance e atribui o restante à balance.
            
            System.out.printf("| Discounting $%.2f to %s balance.%n", withDrawAmount, this.name); //Exibindo mensagem no terminal.

        } //Fim do if que verifica à expressão withDrawAmount > this.balance.

    } //Fim do método withDraw.


    public double getBalance() { //Início do método getBalance.

        return this.balance; //Retornando o valor da variável de instância balance.
        
    } //Fim do método getBalance.

    public void setName(String name) { //Início do método setName.

        this.name = name; //Atribuindo o valor do parâmetro name à variável de instância name.

    } //Fim do método setName.

    public String getName() { //Início do método getName.

        return this.name; //Retornando o valor da variável de instância name.

    } //Fim do método getName.

 } //Fim da classe Account.