/*Questão 3.16.
 * Desenvolver uma aplicação para calcular a frequência cardíaca máxima e a frequência cardíaca alvo. A aplicação
 * consiste em uma classe HeartRates com as variáveis de instância nome, sobrenome e data de 
 * nascimento(mês, dia e ano).
 */

import java.util.Scanner; //Importando a classe Scanner da java API.

public class HeartRates { //Início da classe HeartRates.

    private String name; //Variável de instância do tipo String
    private String lastName; //Variável de instância do tipo String
    private int birthMonth; //Variável de instância do tipo int
    private int birthDay; //Variável de instância do tipo int
    private int birthYear; //Variável de instância do tipo int

    public HeartRates(String name, String lastName, int birthMonth, int birthDay, int birthYear) { //Início do método construtor.

        this.name = name; //Váriável de instância name recebe valor do parâmetro name.
        this.lastName = lastName; //Variável de instância lastName recebe valor do parâmetro lastName.
        this.birthMonth = birthMonth; //Variável de instância birthMonth recebe valor do parâmetro birthMonth.
        this.birthDay = birthDay; //Variável de instância birthDay recebe valor do parâmetro birthDay.
        this.birthYear = birthYear; //Variável de instância birthYear recebe valor do parâmetro birthYear.

    } //Fim do método construtor.



    public void setName(String newName) { //Início do método setName.

        this.name = newName; //Variável de instância name recebe valor do parâmetro newName.

    } //Fim do método setName.

    public String getName() { //Início do método getName.

        return this.name; //Retorna o valor da variável de instância name.

    } //Fim do método getName



    public void setLastName(String newLastName) { //Início do método setLastName.

        this.lastName = newLastName; //Variável de instância lastName recebe valor do parâmetro newLastName.

    } //Fim do método setLastName.

    public String getLastName() { //Início do método getLastName.

        return this.lastName; //Retorna valor da variável de instância lastName.

    } //Fim do método getLastName.



    public void setBirthMonth(int newBirthMonth) { //Início do método setBirthMonth.

        this.birthMonth = newBirthMonth; //Variável de instância birthMonth recebe valor do parâmetro newBirthMonth.

    } //Fim do método setBirthMonth.

    public int getBirthMonth() { //Início do método getBirthMonth.

        return this.birthMonth; //Retorna o valor da variável de instância birthMonth.

    } //Fim do método getBirthMonth.



    public void setBirthDay(int newBirthDay) { //Início do método setBirthDay.

        this.birthDay = newBirthDay; //Variável de instância birthDay recebe valor do parâmetro newBirthDay.

    } //Fim do método setBirthDay.

    public int getBirthDay() { //Início do método getBirthDay.

        return this.birthDay; //Retorna valor da variável de instância birthDay.

    } //Fim do método getBirthDay.



    public void setBirthYear(int newBirthYear) { //Início do método setBirthYear.

        this.birthYear = newBirthYear; //Variável de instância birthYear recebe valor do parâmetro newBirthYear.

    } //Fim do método setBirthYear.

    public int getBirthYear() { //Início do método getBirthYear.

        return this.birthYear; //Retorna o valor da variável de instância birthYear.

    } //Fim do método getBirthYear.



    public int ageCalc(int currentYear) { //Início do método ageCalc.

        return currentYear - birthYear; //Retorna a diferença entre o parâmetro currentYear e a variável de instância birthYear.

    } //Fim do método ageCalc.



    public int calcMaxHeartRate(int currentYear) { //Início do método calcMaxHeartRate.

        return 220 - this.ageCalc(currentYear); //Retorna o valor do calculo da frequência cardíaca máxima. 

    } //Fim do método calcMaxHeartRate. 



    public String targetHeartRate(int currentYear) { //Início do método targetHeartRate.

        double minValue = calcMaxHeartRate(currentYear) * 50.00/100; //Calculando o valor mínimo da frequência cardíaca alvo.
        double maxValue = calcMaxHeartRate(currentYear) * 85.00/100; //Calculando o valor máximo da frequência cardíaca alvo.
        

        return String.format("| %s's target heart rate is between %.2f and %.2f.%n", 
         this.name, minValue, maxValue); //Retornando mensagem com o intervalo da frequência cardíaca alvo.

    } //Fim do método targetHeartRate.



    //Método main, inicia a execução da aplicação.
    public static void main(String[] args) { //Início do método main.

        Scanner input = new Scanner(System.in); //Criando objeto da classe Scanner para entrada de dados a partir do teclado.

        System.out.println("_________________________________________________________________"); //Exibindo traço no terminal.

        System.out.print("| Enter your name: "); //Exibindo no terminal uma instrução ao usuário.
        String name = input.nextLine(); //Recebendo valor do teclado e o atribuindo a variável local name.

        System.out.println("|________________________________________________________________"); //Exibindo traço no terminal.

        System.out.print("| Enter your last name: "); //Exibindo no terminal uma instrução ao usuário.
        String lastName = input.nextLine(); //Recebendo valor do teclado e o atribuindo a variável local lastName.

        System.out.println("|________________________________________________________________"); //Exibindo traço no terminal.

        System.out.print("| Enter your birth month: "); //Exibindo no terminal uma instrução ao usuário.
        int birthMonth = input.nextInt(); //Recebendo valor do teclado e o atribuindo a variável local birthMonth.

        System.out.println("|________________________________________________________________"); //Exibindo traço no terminal.

        System.out.print("| Enter your birth day: "); //Exibindo no terminal uma instrução ao usuário.
        int birthDay = input.nextInt(); //Recebendo valor do teclado e o atribuindo a variável local birthDay.

        System.out.println("|________________________________________________________________"); //Exibindo traço no terminal.

        System.out.print("| Enter your birth year: "); //Exibindo no terminal uma instrução ao usuário.
        int birthYear = input.nextInt(); //Recebendo valor do teclado e o atribuindo a variável local birthYear.

        System.out.println("|________________________________________________________________"); //Exibindo traço no terminal.

        HeartRates heartRates = new HeartRates(name, lastName, birthMonth, birthDay, birthYear); //Instânciando objeto da classe HeartRates

        System.out.printf("| Name: %s.%n| Last name: %s.%n| Birth date: %d/%d/%d.%n", 
         heartRates.getName(), heartRates.getLastName(), heartRates.getBirthMonth(),
         heartRates.getBirthDay(), heartRates.getBirthYear()); //Exibindo as informações do objeto heartRates.

        System.out.println("|________________________________________________________________"); //Exibindo traço no terminal.

        System.out.print("| Enter current year: "); //Exibindo no terminal uma instrução ao usuário.
        int currentYear = input.nextInt(); //Recebendo valor do teclado e o atribuindo a variável local currentYear.

        System.out.println("|________________________________________________________________"); //Exibindo traço no terminal.

        System.out.printf("| %s has %d years old.%n| Your max heart rate is %d.%n%s",
         heartRates.getName(), heartRates.ageCalc(currentYear), heartRates.calcMaxHeartRate(currentYear),
         heartRates.targetHeartRate(currentYear)); //Exibindo no terminal as informações a respeito da idade e fequência cardíaca do objeto heartRates.

        System.out.println("|________________________________________________________________"); //Exibindo traço no terminal.

        input.close(); //Fecha objeto input

    } //Fim do método main.

} //Fim da classe HeartRates.