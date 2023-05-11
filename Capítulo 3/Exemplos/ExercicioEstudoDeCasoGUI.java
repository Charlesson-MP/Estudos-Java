/* Exercício estudo de caso GUI
 * Modificando o exercício do capítulo 2 figura 2.7 que faz a adição de 2 números 
 * e mostra o resultado, mas agora com recursos de imagens gráficas mostrados anteriormente.
 */

import java.util.Scanner; //Importando a classe Scanner da Java API.
import javax.swing.JOptionPane; //Importando a classe JOptionPane da Java API.

public class ExercicioEstudoDeCasoGUI { //Início da classe ExercicioEstudoDeCasoGUI.
    
    //Método main, inicia a execução da aplicação.
    public static void main(String[] args) { //Início do método main.

        Scanner input = new Scanner(System.in); //Criando objeto da classe Scanner para entrada de dados pelo teclado.

        int number1, //Criando variável para receber o primeiro valor.
            number2, //Criando variável para receber o segundo valor.
            sum; //Criando variável para receber a soma.

        String finalMessage; //Criando variável do tipo String para receber a mensagem final.

        number1 = Integer.parseInt(JOptionPane.showInputDialog(null,
         "Enter first integer:")); //Recebendo valor através da janela de entrada, convertendo valor de string para inteiro e atribuindo a variável number1.

        number2 = Integer.parseInt(JOptionPane.showInputDialog(null,
         "Enter second integer:")); //Recebendo valor através da janela de entrada, convertendo valor de string para inteiro e atribuindo a variável number2.
        
        sum = number1 + number2; //Somando os valores de number1 e number2 e atribuindo a variável sum.

        finalMessage = String.format("Sum is %d", sum); //Formantando a mensagem final com o método format da classe String e atribuindo a variável finalMessage.

        JOptionPane.showMessageDialog(null, finalMessage); //Mostrando a mensagem final através de uma janela de diálogo com o método showMessageDialog da classe JOptionPane.
        
        input.close(); //Fecha o objeto input.
    } //Fim do método main.


} //Fim da classe ExercicioEstudoDeCasoGUI.