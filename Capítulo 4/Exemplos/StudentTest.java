/* Exemplo da figura 4.5, a classe StudentTest cria objetos da classe Student e testa suas funcionalidades.*/

public class StudentTest { //Início da classe StudentTest.
    
    //Método main, inicia a execução da aplicação.
    public static void main(String[] args) { //Início do método main.
        
        Student account1 = new Student("Jane Green", 93.5); //Objeto da classe Student.
        Student account2 = new Student("John Blue", 72.75); //Objeto da classe Student.

        System.out.println("________________________________________"); //Exibe traço no terminal.

        System.out.printf("| %s's letter grade is: %s%n",
         account1.getName(), account1.getLetterGrade()); //Exibe a letra correspondente a nota do objeto account1

        System.out.printf("| %s's letter grade is: %s%n",
         account2.getName(), account2.getLetterGrade()); //Exibe a letra correspondente a nota do objeto account2

        System.out.println("|_______________________________________"); //Exibe traço no terminal.

    } //Fim do método main.

} //Fim da classe StudentTest.