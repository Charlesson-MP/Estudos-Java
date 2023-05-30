/*Exercício do estudo de caso GUIs e imagens gráficas 4.1 letra a.*/

import javax.swing.JFrame; //Importando a classe JFrame da Java API.

public class Exercicio41ATeste { //Início da classe Exercicio41ATeste.

    //Método main, inicia a execução da aplicação.
    public static void main(String[] args) { //Início do método main.

        Exercicio41A panel = new Exercicio41A();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setVisible(true);
        application.setSize(300, 300);
        application.setLocation(700, 1300);

        
    } //Fim do método main.
    
} //Fim da classe Exercicio41ATeste.