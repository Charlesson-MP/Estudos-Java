/*Questão 3.13.
 * Criar a classe EmployeeTest para testar a classe Employee. Criando 2 objetos Employee e exibir o salário
 * anual e dar um aumento de 10% e exibir o salário anual novamente.
 */

import java.util.Scanner; //Importando a classe Scanner da java API.

public class EmployeeTest { //Início da classe EmployeeTest.
    
    //Método main, inicia à execução da aplicação.
    public static void main(String[] args) { //Início do método main.

        Scanner input = new Scanner(System.in); //Criando objeto da classe Scanner.

        Employee employee1 = new Employee("Jane", "Green", 1100.00); //Criando objeto da classe Employee.
        Employee employee2 = new Employee("John", "Green", 1000.00); //Criando objeto da classe Employee.

        System.out.println("________________________________________"); //Exibindo um traço no terminal.
        
        System.out.print(employee1.getAnnualSalary()); //Exibindo no terminal o salário anual do empregado1.
        System.out.print(employee2.getAnnualSalary()); //Exibindo no terminal o salário anual do empregado2.

        System.out.println("|_______________________________________"); //Exibindo um traço no terminal.

        System.out.printf("| Enter percentage decrease to %s: ", employee1.getName()); //Exibindo no terminal uma instrução para o usuário.
        employee1.decreaseSalary(input.nextInt());

        System.out.println("|_______________________________________"); //Exibindo um traço no terminal.

        System.out.printf("| Enter percentage increase to %s: ", employee2.getName()); //Exibindo no terminal uma instrução para o usuário.
        employee2.increaseSalary(input.nextInt());

        System.out.println("|_______________________________________"); //Exibindo um traço no terminal.

        System.out.print(employee1.getAnnualSalary()); //Exibindo no terminal o salário anual do empregado1.
        System.out.print(employee2.getAnnualSalary()); //Exibindo no terminal o salário anual do empregado2.

        System.out.println("|_______________________________________"); //Exibindo um traço no terminal.

        input.close(); //Fecha o objeto input.

    } //Fim do método main.

} //Fim da classe EmployeeTest.