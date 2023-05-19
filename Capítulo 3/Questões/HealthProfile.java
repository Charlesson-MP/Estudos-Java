/*Questão 3.17.
 * A questão consiste em uma classe que representa o perfil de um paciente com atributos nome, sobrenome, sexo,
 * data de nascimento (dia, mês e ano separados), altura (em metro), e peso. Método construtor para inicializar
 * os atribudos e métodos getter e setter para cada um dos atributos. Além disso métodos para calcular a idade,
 * frequência cardíaca máxima e frequência cardíaca alvo e também o índice de massa corporal (IMC). Por fim,
 * o aplicativo irá receber as informações necessárias e exibirá no terminal a idade, IMC e seus valores base e
 * frequência cardíaca máxima e frequência cardíaca alvo.
 */

import java.util.Scanner; //Importando a classe Scanner da java API.

public class HealthProfile { //Início da classe HealthProfile.

    private String name; //Variável de instância do tipo String.
    private String lastName; //Variável de instância do tipo String.
    private String gender; //Variável de instância do tipo String.
    private int birthMonth; //Variável de instância do tipo int.
    private int birthDay; //Variável de instância do tipo int.
    private int birthYear; //Variável de instância do tipo int.
    private double height; //Variável de instância do tipo double.
    private double weight; //Variável de instância do tipo double.



    public HealthProfile(String name, String lastName, String gender, int birthMonth, int birthDay,
        int birthYear, double height, double weight) { //Início do método construtor.

        this.name = name; //Variável de instância name recebe valor do parâmetro name.
        this.lastName = lastName; //Variável de instância lastName recebe valor do parâmetro lastName.
        this.gender = gender; //Variável de instância gender recebe valor do parâmetro gender.
        this.birthMonth = birthMonth; //Variável de instância birthMonth recebe valor do parâmetro birthMonth.
        this.birthDay = birthDay; //Variável de instância birthDay recebe valor do parâmetro birthDay.
        this.birthYear = birthYear; //Variável de instância birthYear recebe valor do parâmetro birthYear.
        this.height = height; //Variável de instância height recebe valor do parâmetro height.
        this.weight = weight; //Variável de instância weight recebe valor do parâmetro weight.

    } //Fim do método construtor.



    public void setName(String newName) { //Início do método setName.

        this.name = newName; //Variável de instância name recebe valor do parâmetro newName.

    } //Fim do método setName.

    public String getName() { //Início do método getName.

        return this.name; //Retorna valor da variável de instância name.

    } //Fim do método getName.



    public void setLastName(String newLastName) { //Início do método setLastName.

        this.lastName = newLastName; //Variável de instância lastName recebe valor do parâmetro newLastName.

    } //Fim do método setLastName.

    public String getLastName() { //Início do método getLastName.

        return this.lastName; //Retorna valor da variável de instância lastName.

    } //Fim do método getLastName.



    public void setGender(String newGender) { //Início do método setGender.

        this.gender = newGender; //Variável de instância gender recebe valor do parâmetro newGender.

    } //Fim do método setGender.

    public String getGender() { //Início do método getGender.

        return this.gender; //Retorna valor da variável de instância gender.

    } //Fim do método getGender.



    public void setBirthMonth(int newBirthMonth) { //Início do método setBirthMonth.

        this.birthMonth = newBirthMonth; //Variável de instância birthMonth recebe valor do parâmetro newBirthMonth.

    } //Fim do método setBirthMonth.

    public int getBirthMonth() { //Início do método getBirthMonth.

        return this.birthMonth; //Retorna valor da variável de instância birthMonth.

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

        return this.birthYear; //Retorna valor da variável de instância birthYear.

    } //Fim do método getBirthYear.



    public void setHeight(double newHeight) { //Início do método setHeight.

        this.height = newHeight; //Variável de instância height recebe valor do parâmetro newHeight.

    } //Fim do método setHeight.

    public double getHeight() { //Início do método getHeight.

        return this.height; //Retorna valor da variável de instância height.

    } //Fim do método getHeight.



    public void setWeight(double newWeight) { //Início do método setWeight.

        this.weight = newWeight; //Variável de instância weight recebe valor do parâmetro newWeight.

    } //Fim do método setWeight.

    public double getWeight() { //Início do método getWeight.

        return this.weight; //Retorna valor da variável de instância weight.

    } //Fim do método getWeight.



    public int calcAge(int currentYear) { //Início do método calcAge.

        return currentYear - this.birthYear; //Retorna a diferença entre o valor do parâmetro currentYear e o valor da variável de instância birthYear.

    } //Fim do método calcAge.



    public int calcMaxHeartRate(int currentYear) { //Início do método calcMaxHeartRate.

        return 220 - calcAge(currentYear); //Chama o método calcAge para calcular a idade e retorna a diferença entre 220 e a idade.

    } //Fim do método calcMaxHeartRate.



    public String targetHeartRate(int currentYear) { //Início do método targetHeartRate.

        double minValue = calcMaxHeartRate(currentYear) * 50.00/100; //Chama o método calcMaxHeartRate e multiplica por 50/100 (50%).
        double maxValue = calcMaxHeartRate(currentYear) * 85.00/100; //Chama o método calcMaxHeartRate e multiplica por 85/100 (85%).

        return String.format("| %s's target heart rate is between %.2f and %.2f.%n", this.name,
         minValue, maxValue); //Retorna uma string informando o intervalo de frequência cardíaca alvo do usuário.

    } //Fim do método targetHeartRate.




    public String calcBMI() { //Início do método calcBMI.

        double valueBMI = this.weight / (this.height * this.height); //Calcula o IMC do usuário e o atribui a variável valueBMI.
        String BMIValues = String.format("| BMI VALUES%n| Underweight: less than 18,5.%n" +
         "| Normal: between 18,5 and 24,9.%n| Overweight: between 25 and 29,9.%n" +
         "| Obese: 30 or greater.%n| %s's BMI is %.2f.%n", this.name, valueBMI); //Formata a string de saída e a atribui a variável local BMIValues.

        return BMIValues; //Retorna o valor de BMIValues.

    } //Fim do método calcBMI.



    //Método main, inicia a execução da aplicação.
    public static void main(String[] args) { //Início do método main.

        Scanner input = new Scanner(System.in); //Instânciando objeto da classe Scanner para entrada de dados pelo teclado.

        System.out.println("_________________________________________________________________"); //Exibe traço no terminal.

        System.out.print("| Enter your name: "); //Exibe no terminal instrução ao usuário.
        String name = input.nextLine(); //Recebe valor do usuário e atribui a variável local name.

        System.out.println("|________________________________________________________________"); //Exibe traço no terminal.

        System.out.print("| Enter your last name: "); //Exibe no terminal instrução ao usuário.
        String lastName = input.nextLine(); //Recebe valor do usuário e atribui a variável local lastName.

        System.out.println("|________________________________________________________________"); //Exibe traço no terminal.

        System.out.print("| Enter your gender: "); //Exibe no terminal instrução ao usuário.
        String gender = input.nextLine(); //Recebe valor do usuário e atribui a variável local gender.

        System.out.println("|________________________________________________________________"); //Exibe traço no terminal.

        System.out.print("| Enter your birth month: "); //Exibe no terminal instrução ao usuário.
        int birthMonth = input.nextInt(); //Recebe valor do usuário e atribui a variável local birthMonth.

        System.out.println("|________________________________________________________________"); //Exibe traço no terminal.

        System.out.print("| Enter your birth day: "); //Exibe no terminal instrução ao usuário.
        int birthDay = input.nextInt(); //Recebe valor do usuário e atribui a variável local birthDay.

        System.out.println("|________________________________________________________________"); //Exibe traço no terminal.

        System.out.print("| Enter your birth year: "); //Exibe no terminal instrução ao usuário.
        int birthYear = input.nextInt(); //Recebe valor do usuário e atribui a variável local birthYear.

        System.out.println("|________________________________________________________________"); //Exibe traço no terminal.

        System.out.print("| Enter your height: "); //Exibe no terminal instrução ao usuário.
        double height = input.nextDouble(); //Recebe valor do usuário e atribui a variável local height.

        System.out.println("|________________________________________________________________"); //Exibe traço no terminal.

        System.out.print("| Enter your weight: "); //Exibe no terminal instrução ao usuário.
        double weight = input.nextDouble(); //Recebe valor do usuário e atribui a variável local weight.

        System.out.println("|________________________________________________________________"); //Exibe traço no terminal.

        System.out.print("| Enter current year: ");
        int currentYear = input.nextInt(); //Recebe valor do usuário e atribui a variável local currentYear.

        System.out.println("|________________________________________________________________"); //Exibe traço no terminal.

        HealthProfile patientProfile = new HealthProfile(name, lastName, gender, birthMonth,
         birthDay, birthYear, height, weight); //Instânciando objeto da classe HealthProfile.

        System.out.println("| Patient profile\n|"); //Exibindo string no terminal.

        System.out.printf("| Name: %s.%n", patientProfile.getName()); //Exibindo nome do paciente no terminal.

        System.out.printf("| Last name: %s.%n", patientProfile.getLastName()); //Exibindo sobrenome do paciente no terminal.

        System.out.printf("| Gender: %s.%n", patientProfile.getGender()); //Exibindo gênero do paciente no terminal.

        System.out.printf("| Birth date: %d/%d/%d.%n", patientProfile.getBirthMonth(),
         patientProfile.getBirthDay(), patientProfile.getBirthYear()); //Exibindo data de nascimento do paciente no terminal.

        System.out.printf("| %s is %d years old.%n", patientProfile.getName(),
         patientProfile.calcAge(currentYear)); //Exibindo a idade do paciente no terminal.

        System.out.printf("| Height: %.2f.%n", patientProfile.getHeight()); //Exibe a altura do paciente no terminal.

        System.out.printf("| Weight: %.2f.%n", patientProfile.getWeight()); //Exibe o peso do paciente no terminal.

        System.out.println("|"); //Exibindo linha vazia 

        System.out.print(patientProfile.calcBMI()); //Calcula e exibe no terminal os dados do IMC e os valores padrões.

        System.out.println("|"); //Exibindo linha vazia

        System.out.println("| Heart rate values");

        System.out.printf("| Patient max heart rate: %d.%n",
         patientProfile.calcMaxHeartRate(currentYear)); //Calculando e exibindo no terminal a frequência cardíaca do paciente.

        System.out.print(patientProfile.targetHeartRate(currentYear)); //Calcula e exibe o intervalo ideal de frequência cardíaca do paciente.

        System.out.println("|________________________________________________________________"); //Exibe traço no terminal.

        input.close(); //Fecha objeto input.

    } //Fim do método main.
    
} //Fim da classe HealthProfile.