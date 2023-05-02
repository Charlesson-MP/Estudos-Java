//Questão 2.34 do capítulo 2
//Receber a população mundial atual e a taxa de crescimento, calcular e exibir a população estimada depois de 1,2 3, 4 e 5 anos 

public class Questao234 { //Início da classe Questao234
    
    //Método main, inicia a execução da aplicação
    public static void main(String[] args) { //Início do método main

        long populacaoMundial2023 = 8000000000L; //Variável do tipo double para guardar a população mundial em 2023
        float taxaDeCrescimentoPopulacional = 0.9f/100; //Variável do tipo double para guardar a taxa de crescimento populacional

        System.out.println("_______________________________________________________"); //Exibe no terminal um traço horizontal para delimitar o início da saída

        System.out.printf("| População mundial em 2023 é %d de pessoas.%n", populacaoMundial2023);

        System.out.println("|______________________________________________________"); //Exibe no terminal um traço na vertical e outro na horizontal para delimitar o fim da saída no ano de atual

        System.out.println("| Com uma taxa de crescimento de " + taxaDeCrescimentoPopulacional + ", teremos: "); //Exibe no terminal um traço na vertical e uma descrição do que virá abaixo
        
        System.out.println("| - Em 2024 " + ((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023)
            + " de pessoas."); //Exibe no terminal um traço na vertical e o resultado para o ano de 2024
        
        
        System.out.println("| - Em 2025 " + ((((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023)
            * taxaDeCrescimentoPopulacional) + ((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023))
            + " de pessoas."); //Exibe no terminal um traço na vertical e o resultado para o ano de 2025

        System.out.println("| - Em 2026 " + ((((((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023)
            * taxaDeCrescimentoPopulacional) + ((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023))
            * taxaDeCrescimentoPopulacional) + ((((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023)
            * taxaDeCrescimentoPopulacional) + ((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023)))
            + " de pessoas."); //Exibe no terminal um traço na vertical e o resultado para o ano de 2026

        System.out.println("| - Em 2027 " + (((((((((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023)
            * taxaDeCrescimentoPopulacional) + ((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023))
            * taxaDeCrescimentoPopulacional) + ((((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023)
            * taxaDeCrescimentoPopulacional) + ((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023))))
            * taxaDeCrescimentoPopulacional) + ((((((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023)
            * taxaDeCrescimentoPopulacional) + ((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023))
            * taxaDeCrescimentoPopulacional) + ((((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023)
            * taxaDeCrescimentoPopulacional) + ((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023))))
            + " de pessoas."); //Exibe no terminal um traço na vertical e o resultado para o ano de 2027

        System.out.println("| - Em 2028 " + ((((((((((((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023)
            * taxaDeCrescimentoPopulacional) + ((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023))
            * taxaDeCrescimentoPopulacional) + ((((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023)
            * taxaDeCrescimentoPopulacional) + ((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023))))
            * taxaDeCrescimentoPopulacional) + ((((((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023)
            * taxaDeCrescimentoPopulacional) + ((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023))
            * taxaDeCrescimentoPopulacional) + ((((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023)
            * taxaDeCrescimentoPopulacional) + ((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023)))))
            * taxaDeCrescimentoPopulacional) + (((((((((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023)
            * taxaDeCrescimentoPopulacional) + ((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023))
            * taxaDeCrescimentoPopulacional) + ((((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023)
            * taxaDeCrescimentoPopulacional) + ((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023))))
            * taxaDeCrescimentoPopulacional) + ((((((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023)
            * taxaDeCrescimentoPopulacional) + ((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023))
            * taxaDeCrescimentoPopulacional) + ((((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023)
            * taxaDeCrescimentoPopulacional) + ((taxaDeCrescimentoPopulacional * populacaoMundial2023) + populacaoMundial2023)))))
            + " de pessoas."); //Exibe no terminal um traço na vertical e o resultado para o ano de 2028

        
        System.out.println("|______________________________________________________"); //Exibe no terminal um traço na vertical e outro na horizontal para delimitar o fim da saída de dados

    } //Fim do método main
} //Fim da classe Questao234