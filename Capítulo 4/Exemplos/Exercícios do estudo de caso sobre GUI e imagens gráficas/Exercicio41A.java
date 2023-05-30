/*Exercício do estudo de caso GUIs e imagens gráficas 4.1 letra a. */

import java.awt.Graphics;
import javax.swing.JPanel;

public class Exercicio41A extends JPanel { //Início da classe Exercicio41A.
    
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g); //Chama método paintComponent da superclasse.

        
        int numberLines = 0; //Cria variável inteira e inicializa com valor 0.

        int widthDown = getWidth();
        int widthUp = getWidth();
        int heightDown = getHeight();
        int heightUp = getHeight();


        while(numberLines <= 15) {

            if(numberLines < 8){

                g.drawLine(0, 0, widthDown/2, heightDown/2);
                widthDown -= 35;
                heightDown += 35;
            
            } else {

                g.drawLine(0, 0, widthUp/2, heightUp/2);
                widthUp += 35;
                heightUp -= 35;

            }

            numberLines++;
            
        }

    }

} //Fim da classe Exercicio41A.
