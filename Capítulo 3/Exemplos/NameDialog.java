/*Exemplo NameDialog.java
 * Usando métodos da classe JOptionPane para obter uma entrada do usuário.
 */

import javax.swing.JOptionPane; //Importando a classe JOptionPane da Java API.

public class NameDialog { //Início da classe NameDialog.
    
    //Método main, inicía a execução do aplicativo.
    public static void main(String[] args) { //Início do método main.

        String name = JOptionPane.showInputDialog(null,
         "What's your name?"); //Recebe uma String através de uma caixa de diálogo e atribui a variável name.

        String message = String.format("Welcome %s to Java Programming!", name); //Formatando uma string através do método format da classe String e atribuindo a variável message.

        JOptionPane.showMessageDialog(null, message); //Mostrando a mensagem na caixa de diálogo.

    } //Fim do método main.


} //Fim da classe NameDialog.