/*Exemplo da figura 4.15, classe Increment mostra como usar os operadores de pré-incremento e pós-incremento.*/

public class Increment { //Início da classe Increment.

    //Método main, inicia a execução da aplicação.
    public static void main(String[] args) { //Início do método main.
        
        int c = 5; //Inicializando variável inteira com valor 5.

        System.out.println("_______________________________________"); //Exibe traço no terminal.

        System.out.printf("| c before postincrement: %d.%n", c); //Exibindo o valor de c antes do pós-incremento.
        System.out.printf("| postincrementing c: %d.%n", c++); //Exibindo o valor de c usando o operador de pós-incremento.
        System.out.printf("| c after postincrement: %d.%n", c); //Exivindo o valor de c após o uso do pós-incremento.

        System.out.println("|______________________________________"); //Exibe traço no terminal.

        c = 5; //Inicializando variável inteira com valor 5.

        System.out.printf("| c before preincrement: %d.%n", c); //Exibindo o valor de c antes do pré-incremento.
        System.out.printf("| preincrementing c: %d.%n", ++c); //Exibindo o valor de c usando o operador de pré-incremento.
        System.out.printf("| c after preincrementing: %d.%n", c); //Exibindo o valor de c após o uso do pré-incremento.

        System.out.println("|______________________________________"); //Exibe traço no terminal.
    } //Fim do método main.

} //Fim da classe Increment.