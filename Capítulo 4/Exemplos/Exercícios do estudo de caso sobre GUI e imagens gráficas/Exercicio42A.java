/*Exercício do estudo de caso GUIs e imagens gráficas 4.2 letra (a) e (b). */

import javax.swing.JPanel; //Importando a classe JPanel da Java API.
import java.awt.Graphics; //Importando a classe Graphics da java API.

public class Exercicio42A extends JPanel { //Início da classe Exercicio42A.
    
    public void paintComponent(Graphics g) { //Início do método paintComponent.

        int widthX = 0; //Valor 0 é atribuido a variável local do tipo int.
        int widthY = 15; //Valor 15 é atribuido a variável local do tipo int.
        int heightX = 0; //Valor 0 é atribuido a variável local do tipo int.
        int heightY = getHeight(); //Valor da altura da janela é atribuido a variável local do tipo int.

        int numberLines = 0; //Valor 0 é atribuido a variável local do tipo int.

        while(numberLines < 15) { //Início da instrução de repetição controlada pela espressão numberLines < 15.

            g.drawLine(widthX, heightX, widthY, heightY); //Desenha uma linha de acordo os argumentos passados como parâmetro.

            widthY += 15; //Incrementa a variável widthY em 15.
            heightX += 15; //Incrementa a variável heightX em 15.

            numberLines++; //Incrementa em a variável numberLines em 1.

        } //Fim da instrução de repetição controlada pela espressão numberLines < 15.


        widthX = getWidth(); //Valor da largura da janela é atribuido a variável local do tipo int.
        widthY = getWidth() - 15; //Valor da largura da janela menos o valor 15 é atribuido a variável local do tipo int.
        heightX = 0; //Valor 0 é atribuido a variável local do tipo int.
        heightY = getHeight(); //Valor da altura da janela é atribuido a variável local do tipo int.

        numberLines = 0; //Valor 0 é atribuido a variável local do tipo int.

        while(numberLines < 15) { //Início da instrução de repetição controlada pela espressão numberLines < 15.

            g.drawLine(widthX, heightX, widthY, heightY); //Desenha uma linha de acordo os argumentos passados como parâmetro.

            widthY -= 15; //Decrementa a variável widthY em 15.
            heightX += 15; //Incrementa a variável heightX em 15.

            numberLines++; //Incrementa em a variável numberLines em 1.

        } //Fim da instrução de repetição controlada pela espressão numberLines < 15.


        widthX = getWidth(); //Valor da largura da janela é atribuido a variável local do tipo int.
        widthY = getWidth() - 15; //Valor da largura da janela menos o valor 15 é atribuido a variável local do tipo int.
        heightX = getHeight(); //Valor da altura da janela é atribuido a variável local do tipo int.
        heightY = 0; //Valor 0 é atribuido a variável local do tipo int.

        numberLines = 0; //Valor 0 é atribuido a variável local do tipo int.

        while(numberLines < 15) { //Início da instrução de repetição controlada pela espressão numberLines < 15.

            g.drawLine(widthX, heightX, widthY, heightY); //Desenha uma linha de acordo os argumentos passados como parâmetro.

            widthY -= 15; //Decrementa a variável widthY em 15.
            heightX -= 15; //Decrementa a variável heightX em 15.

            numberLines++; //Incrementa em a variável numberLines em 1.

        } //Fim da instrução de repetição controlada pela espressão numberLines < 15.


        widthX = 0; //Valor 0 é atribuido a variável local do tipo int.
        widthY = 15; //Valor 15 é atribuido a variável local do tipo int.
        heightX = getHeight(); //Valor da altura da janela é atribuido a variável local do tipo int.
        heightY = 0; //Valor 0 é atribuido a variável local do tipo int.

        numberLines = 0; //Valor 0 é atribuido a variável local do tipo int.

        while(numberLines < 15) { //Início da instrução de repetição controlada pela espressão numberLines < 15.

            g.drawLine(widthX, heightX, widthY, heightY); //Desenha uma linha de acordo os argumentos passados como parâmetro.

            widthY += 15; //Incrementa a variável widthY em 15.
            heightX -= 15; //Decrementa a variável heightX em 15.

            numberLines++; //Incrementa em a variável numberLines em 1.

        } //Fim da instrução de repetição controlada pela espressão numberLines < 15.

    } //Fim do método paintComponent.

} //Fim da classe Exercício42A.