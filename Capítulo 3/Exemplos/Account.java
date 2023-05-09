/*Exemplo: Account.java
*Classe Account que contém as variáveis de instância name do tipo String e balance do tipo double, método construtor
*e métodos para configurar e obter seu valor.
*/

public class Account { //Início da classe Account.

    private String name; //Variável de instância.
    private double balance; //Variável de instância.

    
    //Método construtor, inicializa a variável de instância com o parâmetro passado.
    public Account(String name, double balance) { //Início do método name.

        this.name = name; //Valor do parâmetro é atribuído à variável de instância name.
        
        if(balance > 0.0) { //Início do if que avalia a expressão balance > 0.0.

            this.balance = balance; //Valor do parâmetro é atribuído à variável de instância balance.

        } //Fim do if que avalia a expressão balance > 0.0.

    } //Fim do método main.

    
    //Método deposit, método para acrescentar saldo a conta.
    public void deposit(double depositAmount) { //Início do método deposit.

        if(depositAmount > 0.0) { //Início do if que avalia a expressão depositAmount > 0.0.

            this.balance = balance + depositAmount; //Instrução que soma o valor do parâmetro ao da variável balance e o atribui a balance

        } //Fim do if que avalia a expressão depositAmount > 0.0.

    } //Fim do método deposit.

    
    //Método getBalance, retorna o valor da variável de instância balance.
    public double getBalance() { //Início do método getBalance.

        return this.balance; //Instrução para retornar o valor da variável de instância balance.

    } //Fim do método getBalance.


    //Método para definir nome do objeto.
    public void setName(String name) { //Início do método setName.

        this.name = name; //Variável de instância name recebe o parâmetro setName.

    } //Fim do método setName.

    //Método para recuperar nome do objeto.
    public String getName() { //Início do método getName.

        return this.name; //Instrução para retornar o valor da variável de instância name.

    } //Fim do método getName.

} //Fim da classe Account.