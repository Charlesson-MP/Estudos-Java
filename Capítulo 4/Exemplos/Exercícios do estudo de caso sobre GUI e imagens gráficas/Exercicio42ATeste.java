/*Exercício do estudo de caso GUIs e imagens gráficas 4.2 letra (a) e (b).*/

import javax.swing.JFrame; //Importando a classe JFrame da Java API.

public class Exercicio42ATeste { //Início da classe Exercicio42ATeste.
    
    //Método main, inicia a execução da aplicação.
    public static void main(String[] args) { //Início do método main.

        Exercicio42A panel = new Exercicio42A(); //Instanciando objeto da classe Exercicio42A.

        JFrame application = new JFrame(); //Instanciando objeto da classe JFrame.

        application.add(panel); //Adicionando objeto panel ao objeto application.
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Configurando ação de fechamento da aplicação.
        application.setSize(250, 250); //Configurando as dimenções da janela da aplicação.
        application.setVisible(true); //Configurando a visibilidade da applicação.

    } //Fim do método main.

} //Fim da classe Exercicio42ATeste.