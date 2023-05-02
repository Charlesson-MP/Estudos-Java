//Questão 2.35 do capítulo 2
/*Recebe os quilômetros dirigidos no dia, preço do litro de gasolina, quilômetros médios por litro,
taxa de estacionamento por dia e pedágio por dia. Calcular o custo total diário.*/

import java.util.Scanner; //Importando a classe Scanner da Java API

public class Questao235 { //Início da classe Questao235

    //Método main, inicia a execução da aplicação
    public static void main(String[] args) { //Início do método main

        Scanner input = new Scanner(System.in); //Instanciando objeto da classe Scanner
        double kilometerPerDay,
            gasPrice,
            kilometerPerLiter,
            parkingFeesPerDay,
            tollPerDay;

        System.out.println("________________________________________"); //Exibe um traço horizontal no terminal para delimitar o início da inserção de dados

        System.out.print("| Enter kilometers per day:   "); //Exibe no terminal um traço na vertical e a instrução ao usuário para inserir os quilômetros dirigidos por dia
        kilometerPerDay = input.nextDouble(); //Recebe o valor do teclado e o atribui à variável kilometerPerDay

        System.out.print("| Enter gas price:            "); //Exibe no terminal um traço na vertical e a instrução ao usuário para inserir o perço da gasolina
        gasPrice = input.nextDouble(); //Recebe o valor do teclado e o atribui à variável gasPrice

        System.out.print("| Enter kilometers per liter: "); //Exibe no terminal um traço na vertical e a instrução ao usuário para inserir a média de quilômetros por litro
        kilometerPerLiter = input.nextDouble(); //Recebe o valor do teclado e o atribui à variável kilometerPerLiter

        System.out.print("| Enter parking fees per day: "); //Exibe no terminal um traço na vertical e a instrução ao usuário para inserir a taxa de estacionamento diário
        parkingFeesPerDay = input.nextDouble(); //Recebe o valor do teclado e o atribui à variável 

        System.out.print("| Enter toll per day:         "); //Exibe no terminal um traço na vertical e a instrução ao usuário para inserir a taxa de pedágio diária
        tollPerDay = input.nextDouble(); //Recebe o valor do teclado e o atribui à variável tollPerDay

        System.out.println("|_______________________________________"); //Exibe um traço na vertical e outro  na horizontal no terminal para delimitar o fim da inserção de dados
        
        System.out.println("| You did pay " + (((kilometerPerDay * gasPrice) / kilometerPerLiter)
            + parkingFeesPerDay + tollPerDay) + " no dia.");

        System.out.println("|_______________________________________"); //Exibe um traço na vertical e outro  na horizontal no terminal para delimitar o fim da saída de dados
        
        input.close(); //Fecha o objeto input

    } //Fim do método main
    
} //Fim da classe Questao235