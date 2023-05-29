/*Exemplo da figura 4.19, a classe DrawPanelTest é usada exibir um objeto da classe JPanel.*/

import javax.swing.JFrame; //Importando a classe JFrame da Java API.

public class DrawPanelTest { //Início da classe DrawPanelTest.

    //Método main, inicia a execução da aplicação.
    public static void main(String[] args) { //Início do método main.
        
        DrawPanel panel = new DrawPanel(); //Instanciando um objeto da classe DrawPanel.

        JFrame application = new JFrame(); //Cria um quadro para armazenar o painel.

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Configurando o frame para ser encerrado quando fechado.

        application.add(panel); //Adicionando o objeto da clsse DrawPanel no quadro.
        application.setSize(250, 250); //Configurando o tamanho do quadro.
        application.setVisible(true); //Alterando a visibilidade do quadro.

    } //Fim do método main.
    
} //Fim da classe DrawPanelTest.
