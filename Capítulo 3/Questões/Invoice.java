/*Questão 3.12.
 * Classe Invoice representa a fatura de uma loja de suprimentos de informática, com 4 variáveis de instância
 * e seus metodos getter e setter. Além disso, a classe deve conter um método para calcular o valor da fatura
 * e estruturas de tomada de decisão para assegurar-se de não receber valores negativos.
 */

public class Invoice { //Início da classe Invoice.

    private String number; //Variável de instância tipo String.
    private String description; //Variável de instância tipo String.
    private int amount; //Variável de instância tipo int.
    private double priceUnit; //Variável de instância tipo double.

    //Método construtor, inicializa um objeto da classe Invoice.
    public Invoice(String number, String description, int amount, double priceUnit) { //Início do método Invoice.

        this.number = number; //Atribui o argumento recebido pelo parâmetro number à variável de instância number.
        this.description = description; //Atribui o argumento recebido pelo parâmetro description à variável de instância description.

        if(amount > 0) { //Início do if que verifica a expressão amount > 0.

            this.amount = amount; //Atribui o argumento recebido pelo parâmetro amount à variável de instância Amount.

        } //Fim do if que verifica a expressão amount > 0.

        if(priceUnit > 0.0) { //Início do if que verifica à expressão priceUnit > 0.0.

            this.priceUnit = priceUnit; //Atribui o argumento recebido pelo parâmetro priceUnit à variável de instância priceUnit.

        } //Fim do if que verifica à expressão priceUnit > 0.0.

    } //Fim do método Invoice.


    public void setNumber(String newNumber) { //Início do método setNumber.

        this.number = newNumber; //Atribui o argumento recebido pelo parâmetro newNumber à variável de instância number.

    } //Fim do método setNumber.

    public String getNumber() { //Início do método getNumber.

        return this.number; //Retorna o conteúdo da variável de instância number.

    } //Fim do método setNumber.


    public void setDescription(String newDescription) { //Início do método setDescription.

        this.description = newDescription; //Atribui o argumento recebido pelo parâmetro newDescription à variável de instância description.

    } //Fim do método setDescription.

    public String getDescription() { //Início do método getDescription.

        return this.description; //Retorna o conteúdo da variável de instância description.

    } //Fim do método getDescription.


    public void setAmount(int newAmount) { //Início do método setAmount.

        if(newAmount > 0) { //Início do if que verifica à expressão newAmount > 0.

            System.out.printf("| New amount is %d.%n", newAmount); //Exibe mensagem no terminal.
            this.amount = newAmount; //Atribui o argumento recebido pelo parâmetro à variável de instância amount.

        } //Fim do if que verifica à expressão newAmount > 0.

        if(newAmount <= 0) { //Início do if que verifica à expressão newAmount <= 0.
            
            System.out.println("| Invalid amount."); //Exibe mensagem no terminal.

        } //Fim do if que verifica à expressão newAmount <= 0.

    } //Fim do método setAmount.

    public int getAmount() { //Início do método getAmount.

        return this.amount; //Retorna o conteúdo da variável de instância amount

    } //Fim do método getAmount.


    public void setPriceUnit(double newPriceUnit) { //Início do método setPriceUnit.

        if(newPriceUnit > 0.0) { //Início do if que verifica à expressão newPriceUnit > 0.0.

            System.out.printf("| New price unit is $%.2f.%n", newPriceUnit); //Exibe mensagem no terminal.
            this.priceUnit = newPriceUnit; //Atribui o argumento recebido pelo parâmetro à variável de instância priceUnit.

        } //Fim do if que verifica à expressão newPriceUnit > 0.0.

        if(newPriceUnit <= 0.0) { //Início do if que verifica à expressão newPriceUnit <= 0.0.

            System.out.println("| Invalid price unit."); //Exibe mensagem no terminal.

        } //Fim do if que verifica à expressão newPriceUnit <= 0.0.

    } //Fim do método setPriceUnit.

    public double getPriceUnit() { //Início do método getPriceUnit.

        return this.priceUnit; //Retorna o conteúdo da variável de instância priceUnit.

    } //Fim do método getPriceUnit.


    public double getInvoiceAmount() { //Início do método getInvoiceAmout.

        return this.priceUnit * this.amount; //Retorna o valor de priceUnit multiplicado pelo valor de amount.

    } //Fim do método getInvoiceAmount;
    
} //Fim da classe Invoice.