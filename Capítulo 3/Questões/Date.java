/*Questão 3.14.
 * Criar uma classe Date com as variáveis de instância dia, mês e ano, criar o método construtor, métodos getter
 * e setter para cada atributo e um método displayDate que exiba mês, dia e ano separados por barra(/).
 */

public class Date { //Início da classe Date.
    
    private int day; //Variável de instância do tipo int.
    private int month; //Variável de instância do tipo int.
    private int year; //Variável de instância do tipo int.

    public Date(int month, int day, int year) { //Início do método Construtor.

        this.month = month; //Variável de instância month recebe valor do parâmetro month.
        this.day = day; //Variável de instância day recebe valor do parâmetro day.
        this.year = year; //Variável de instância year recebe valor do parâmetro year.

    } //Fim do método construtor.


    public void setDay(int newDay) { //Início do método setDay.

        this.day = newDay; //Variável de instância day recebe valor do parâmetro newDay.

    } //Fim do método setDay.

    public int getDay() { //Início do método getDay.

        return this.day; //Retorna valor da variável de instância day.

    } //Fim do método getDay.


    public void setMonth(int newMonth) { //Início do método setMonth.

        this.month = newMonth; //Variável de instância month recebe valor do parâmetro month.

    } //Fim do método setMonth.

    public int getMonth() { //Início do método getMonth.

        return this.month; //Retorna o valor da variável de instância month.

    } //Fim do método getMonth.


    public void setYear(int newYear) { //Início do método setYear.

        this.year = newYear; //Variável de instância year recebe valor do parâmetro year.

    } //Fim do método setYear.

    public int getYear() { //Início do método getYear.

        return this.year; //Retorna o valor da variável de instância year.

    } //Fim do método getYear.


    public void displayDate() { //Início do método displayDate.

        System.out.printf("| %d/%d/%d%n", this.month, this.day, this.year); //Exibe no terminal a data do objeto.

    } //Fim do método displayDate.


} //Fim da classe Date.