/*Questão 3.13.
 * Criar uma classe chamada Employee que possua 3 variáveis de instância, método contrutor para inicializar
 * às variáveis e em caso de variáveis númericas utilizar estrutura de tomada de decisão para não receber 
 * valores negativos. Também  criar métodos getter e setter.
 */


public class Employee { //Início da classe Employee.

    private String name; //Variável de instância tipo String.
    private String lastName; //Variável de instância tipo String.
    private double monthlySalary; //Variável de instância tipo double.

    //Método construtor, inicializa as variáveis de instância com os argumentos recebidos pelos parâmetros.
    public Employee(String name, String lastName, double monthlySalary) { //Início do método construtor.

        this.name = name; //Variável de instância name recebe o valor do parâmetro name.
        this.lastName = lastName; //Variável de instância lastName recebe valor do parâmetro lastName.

        if(monthlySalary >= 0) { //Início do if que verifica à expressão monthlySalary >= 0.

            this.monthlySalary = monthlySalary; //Variável de instância monthlySalary recebe valor do parâmetro monthlySalary.

        } //Fim do if que verifica à expressão monthlySalary >= 0.


    } //Fim do método construtor.


    public void setName(String newName) { //Início do método newName.

        this.name = newName; //Variável de instância name recebe valor do parâmetro newName.

    } //Fim do método newName.

    public String getName() { //Início do método getName.
        
        return this.name; //Retorna valor da variável de instância name.

    } //Fim do método getName.


    public void setLastName(String newLastName) { //Início do método setLastName.

        this.lastName = newLastName; //Variável de instância lastName recebe valor do parâmetro newLastName.

    } //Fim do método setLastName.

    public String getLastName() { //Início do método getLastName.

        return this.lastName; //Retorna o valor da variável de instância lastName.

    } //Fim do método getLastName.


    public void setMonthlySalary(double newMontlySalary) { //Início do método setMonthlySalary.

        if(newMontlySalary >= 0.0) { //Início do if que verifica à expressão newMonthlySalary >= 0.
            
            System.out.printf("| Monthly salary is now $%.2f.%n", newMontlySalary); //Exibe Mensagem no terminal.
            this.monthlySalary = newMontlySalary; //Variável de instância monthlySalary recebe valor do parâmetro newMonthlySalary.

        } //Fim do if que verifica à expressão newMonthlySalary >= 0.

        if(newMontlySalary < 0) { //Início do if que verifica à espressão newMonthlySalary < 0.

            System.out.println("| Invalid monthly salary."); //Exibe mensagem no terminal.

        } //Fim do if que verifica à expressão newMonthlySalary < 0.

    } //Fim do método setMonthlySalary.

    public double getMonthlySalary() { //Início do método getMontlySalary.

        return this.monthlySalary; //Retorna o valor da variável de instância monthlySalary.

    } //Fim do método getMonthlySalary.


    public String getAnnualSalary() { //Início do método getAnnualSalary.

        return String.format("| Annual salary is $%.2f.%n", this.monthlySalary * 12); //Retorna mensagem contendo o salário anual.

    } //Fim do método getAnnualSalary.


    public void increaseSalary(int percentageIncrease) { //Início do método increaseSalary.

        if(percentageIncrease > 0) { //Início do if que verifica à expressão percentageIncrease > 0.

            System.out.printf("| Percentage increase is %d%%.%n", percentageIncrease); //Exibe mensagem no terminal com a porcentagem de aumento.
            this.monthlySalary = this.monthlySalary + this.monthlySalary * percentageIncrease/100; //Incrementa o salário mensal de acordo a porcentagem de aumento.
            System.out.printf("| New monthly salary is $%.2f.%n", this.monthlySalary); //Exibe mensagem no terminal com novo salário mensal.

        } //Fim do if que verifica à expressão percentageIncrease > 0.

        if(percentageIncrease <= 0) { //Início do if que verifica à expressão percentageIncrease <= 0.

            System.out.println("| Invalid percentage."); //Exibe mensagem no terminal.

        } //Fim do if que verifica à expressão percentageIncrease <= 0.

    } //Fim do método increaseSalary.


    public void decreaseSalary(int percentageDecrease) { //Início do método decreaseSalary.

        if(percentageDecrease > 0) { //Início do if que verifica à expressão percentageDecrease > 0.

            System.out.printf("| Percentage decrease is %d%%.%n", percentageDecrease); //Exibe mensagem no terminal com porcentagem de desconto.
            this.monthlySalary = this.monthlySalary - this.monthlySalary * percentageDecrease/100;
            System.out.printf("| New monthly salary is $%.2f.%n", this.monthlySalary); //Exibe mensagem no terminal com novo salario mensal.

        } //Fim do if que verifica à expressão percentageDecrease > 0.

        if(percentageDecrease <= 0) { //Início do if que verifica à expressão percentageDecrease <= 0.

            System.out.println("| Invalid percentage."); //Exibe mensagem no terminal.

        } //Fim do if que verifica à expressão percentageDecrease <= 0.

    } //Fim do método decreaseSalary.
    
} //Fim da classe Employee.