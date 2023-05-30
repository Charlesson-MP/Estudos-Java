/*Exercício do estudo de caso GUIs e imagens gráficas 4.1 letra a.*/

import javax.swing.JFrame; //Importando a classe JFrame da Java API.

public class Exercicio41ATeste { //Início da classe Exercicio41ATeste.

    //Método main, inicia a execução da aplicação.
    public static void main(String[] args) { //Início do método main.

        Exercicio41A panel = new Exercicio41A(); //Criando objeto da class Exercicio41A

        JFrame application = new JFrame(); //Criando objeto da classe JFrame.

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Configurando o comportamento da aplicação ao ser fechada.

        application.add(panel); //Adicionando o objeto panel a aplicação.
        application.setVisible(true); //Tornando a aplicação visível.
        application.setSize(300, 300); //Configurando a altura e largura da aplicação.
        
    } //Fim do método main.
    
} //Fim da classe Exercicio41ATeste.