/*Exercício do estudo de caso GUIs e imagens gráficas 4.1 letra (a) e (b). */

import java.awt.Graphics; //Importando a classe Graphics da Java API.
import javax.swing.JPanel; //Importando a classe JPanel da Java API.

public class Exercicio41A extends JPanel { //Início da classe Exercicio41A.
    
    public void paintComponent(Graphics g) { //Início do método paintComponent.
        
        super.paintComponent(g); //Chama método paintComponent da superclasse.

        
        int numberLines = 0; //Cria variável local do tipo int e inicializa com valor 0.

        int widthDown = getWidth(); //Cria variável local tipo do int e inicializa com a largura da janela.
        int widthUp = getWidth(); //Cria variável local tipo do int e inicializa com a largura da janela.
        int heightDown = getHeight(); //Cria variável local do tipo int e inicializa com a altura da janela.
        int heightUp = getHeight(); //Cria variável local do tipo int e inicializa com a altura da janela.


        while(numberLines <= 15) { //Início da instrução de repetição controlada pela expressão numberLines <= 15.

            if(numberLines < 8){ //Início da instrução de seleção controlada pela expressão numberLines < 8.
                //Bloco executado caso a expressão numberLines < 8 seja verdadeira.

                g.drawLine(0, 0, widthDown/2, heightDown/2); //Desenha uma linha de acordo os argumentos passados como parâmetros.
                widthDown -= 35; //Decrementa a variável widthDown em 35.
                heightDown += 35; //Incrementa a variável heigthDown em 35.
            
            } else { //Caso a expressão seja falsa, o bloco else é executado.

                g.drawLine(0, 0, widthUp/2, heightUp/2);
                widthUp += 35; //Incrementa a variável widthUp em 35.
                heightUp -= 35; //Decrementa a variável heightUp em 35.

            } //Fim da instrução de seleção controlada pela expressão numberLines < 8.

            numberLines++; //Incrementa a variável local numberLines.
            
        } //Fim da instrução de repetição controlada pela expressão numberLines <= 15.


        numberLines = 0; //Atribui 0 a variável numberLines.

        widthDown = getWidth(); //Cria variável local tipo do int e inicializa com a largura da janela.
        widthUp = getWidth(); //Cria variável local tipo do int e inicializa com a largura da janela.
        heightDown = getHeight(); //Cria variável local do tipo int e inicializa com a altura da janela.
        heightUp = getHeight(); //Cria variável local do tipo int e inicializa com a altura da janela.

        while(numberLines <= 15) { //Início da instrução de repetição controlada pela expressão numberLines <= 15.

            if(numberLines < 8) { //Início da instrução de escolha controlada pela expressão numberLines < 8.
                //Bloco executado caso a expressão numberLines < 8 seja verdadeira.

                g.drawLine(getWidth(), getHeight(), widthDown/2, heightDown/2); //Desenha uma linha de acordo os argumentos passados como parâmetros.
                widthDown -= 35; //Decrementa a variável widthDown em 35.
                heightDown += 35; //Incrementa a variável heigthDown em 35.

            } else { //Caso a expressão seja falsa, o bloco else é executado.

                g.drawLine(getWidth(), getHeight(), widthUp/2, heightUp/2); //Desenha uma linha de acordo os argumentos passados como parâmetros.
                widthUp += 35; //Incrementa a variável widthUp em 35.
                heightUp -= 35; //Decrementa a variável heightUp em 35.

            } //Fim da instrução de escolha controlada pela expressão numberLines < 8.

            numberLines++; //Incrementa a variável local numberLines.

        } //Fim da instrução de repetição controlada pela expressão numberLines <= 15.


        numberLines = 0; //Atribui 0 a variável numberLines.

        widthDown = getWidth(); //Cria variável local tipo do int e inicializa com a largura da janela.
        widthUp = getWidth(); //Cria variável local tipo do int e inicializa com a largura da janela.
        heightDown = getHeight(); //Cria variável local do tipo int e inicializa com a altura da janela.
        heightUp = getHeight(); //Cria variável local do tipo int e inicializa com a altura da janela.

        while(numberLines <= 15) { //Início da instrução de repetição controlada pela expressão numberLines <= 15.

            if(numberLines < 8) { //Início da instrução de seleção controlada pela expressão numberLines < 8.
                //Bloco executado caso a expressão numberLines < 8 seja verdadeira.

                g.drawLine(getWidth(), 0, widthDown/2, heightDown/2); //Desenha uma linha de acordo os argumentos passados como parâmetros.
                widthDown += 35; //Incrementa a variável local widthDown em 35.
                heightDown += 35; //Incrementa a variável local heightDown em 35.

            } else { //Caso a expressão seja falsa, o bloco else é executado.

                g.drawLine(getWidth(), 0, widthUp/2, heightUp/2); //Desenha uma linha de acordo os argumentos passados como parâmetro.
                widthUp -= 35; //Decrementa a variável local widthUp em 35.
                heightUp -=35; //Decrementa a variável local heightUp em 35.

            } //Fim da instrução de seleção controlada pela expressão numberLines < 8.

            numberLines++; //Incrementa a variável local numberLines em 1.

        } //Fim da instrução de repetição controlada pela expressão numberLines <= 15.


        numberLines = 0; //Atribui 0 a variável numberLines.

        widthDown = getWidth(); //Cria variável local tipo do int e inicializa com a largura da janela.
        widthUp = getWidth(); //Cria variável local tipo do int e inicializa com a largura da janela.
        heightDown = getHeight(); //Cria variável local do tipo int e inicializa com a altura da janela.
        heightUp = getHeight(); //Cria variável local do tipo int e inicializa com a altura da janela.

        while(numberLines <= 15) { //Início da instrução de repetição controlada pela expressão numberLines <= 15.

            if(numberLines < 8) { //Início da instrução de seleção controlada pela expressão numberLines < 8.
                //Bloco executado caso a expressão numberLines < 8 seja verdadeira.

                g.drawLine(0, getHeight(), widthDown/2, heightDown/2);
                widthDown += 35; //Incrementa a variável local em 35.
                heightDown += 35; //Incrementa a variável local em 35.

            } else { //Caso a expressão seja falsa, o bloco else é executado.

                g.drawLine(0, getHeight(), widthUp/2, heightUp/2);
                widthUp -= 35; //Decrementa a variável local em 35.
                heightUp -= 35; //Decrementa a variável local em 35.

            } //Fim da instrução de seleção controlada pela expressão numberLines < 8.

            numberLines++; //Incrementa a variável local em 1.

        } //Fim da instrução de repetição controlada pela expressão numberLines <= 15.

    } //Fim do método paintComponent.

} //Fim da classe Exercicio41A.