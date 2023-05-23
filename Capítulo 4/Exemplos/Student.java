/*Exemplo da figura 4.4, a classe Student representa um aluno, armazena seu nome e nota e contém métodos
 * para obter e configurar os atributos, além disso um método para definir uma letra a partir de sua nota.
 */

import javax.lang.model.util.ElementScanner6;

public class Student { //Início da classe Student.

    private String name; //Variável de instância do tipo String.
    private double average; //Variável de instância do tipo double.

    public Student(String name, double average) { //Início do método construtor.

        this.name = name;

        if(average > 0.0) { //Início do if que avalia a expressão average > 0.0.

            if(average <= 100.0) //if que avalia a expressão average <= 100.0.
                this.average = average; //Variável de instância average recebe valor do parâmetro average.

        } //Fim do if que avalia a expressão average > 0.0.

    } //Fim do método construtor.



    public void setName(String newName) { //Início do método setName.

        this.name = newName; //Variável de instância name recebe valor do parâmetro newName.

    } //Fim do método setName.

    public String getName() { //Início do método getName.

        return this.name; //Retorna o conteúdo da variável de instância name.

    } //Fim do método getName.



    public void setAverage(double newAverage) { //Início do método setAverage.

        if(newAverage > 0.0) { //Início do if que avalia a expressão newAverage > 0.0.

            if(newAverage <= 100.0) //if que avalia a expressão newAverage <= 100.0.
                this.average = newAverage; //Variável de instância average recebe valor do parâmetro newAverage.

        } //Fim do if que avalia a expressão average > 0.0.

    } //Fim do método setAverage.

    public double getAverage() { //Início do método getAverage.

        return this.average; //Retorna valor da variável de instância average.

    } //Fim do método getAverage.



    public String getLetterGrade() { //Início do método getLetterGrade.

        String letterGrade = ""; //Declarando variável local.

        if(this.average >= 90) //Comando if que avalia a expressão average >= 90.
            letterGrade = "A"; //Variável local recebe "A" caso average seja maior ou igual a 90.

        else if(this.average >= 80) //Caso a outra condição não seja satisfeita, outro comando if avalia a expressão average >= 80.
            letterGrade = "B"; //Variável local recebe "B" caso average seja maior ou igual a 80.

        else if(this.average >= 70) //Caso as outras condições não sejam satisfeitas, outro comando if avalia a expressão average >= 70.
            letterGrade = "C"; //Variável local recebe "C" caso average seja maior ou igual a 70.

        else if(this.average >= 60) //Caso as outras condições não sejam satisfeitas, outro comando if avalia a expressão average >= 60.
            letterGrade = "D"; //Variável local recebe "D" caso average seja maior ou igual a 60.

        else //Caso as outras condições não sejam satisfeitas, ou seja, average é menor que 60.
            letterGrade = "F"; //Variável local recebe "F".

        return letterGrade; //Retorna o valor de letterGrade.

    } //Fim do método getLetterGrade


} //Fim da classe Student.