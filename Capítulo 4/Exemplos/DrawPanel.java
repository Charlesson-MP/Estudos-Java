/*Exemplo da figura 4.18, onde é implementada uma classe para desenhar traços usando componentes GUI.*/

import java.awt.Graphics; //Importando a classe Graphics da Java API.
import javax.swing.JPanel; //Importando a classe JPanel da Java API.

public class DrawPanel extends JPanel { //Início da classe DrawPanel.

    public void paintComponent(Graphics g) { //Início do método paintComponent.

        super.paintComponent(g); //Chama paintComponent para assegurar que o painel é exibido corretamente.

        int width = getWidth(); //Variável local tipo int recebe valor da largura total.
        int height = getHeight(); //Variável local tipo int recebe valor da altura total.

        g.drawLine(0, 0, width, height); //Desenha uma linha do canto superior esquerdo até o canto inferior direito.
        g.drawLine(0, height, width, 0); //Desenha uma linha do canto inferior esquerdo até o canto superior direito.

    } //Fim do método paintComponent.
    
} //Fim da classe DrawPanel.