/*Exemplo 3.1: Account.java
*Classe Account que contém uma variável de instância name
*e métodos para configurar e obter seu valor. 
*/

public class Account { //Início da classe Account

    private String name;

    //Método para definir nome do objeto
    public void setName(String name) { //Início do método newName

        this.name = name; //Variável de instância name recebe o parâmetro newName

    } //Fim do método newName

    //Método para recuperar nome do objeto
    public String getName() { //Início do método getName

        return this.name; //Retorna o valor de name para o método chamador

    } //Fim do método getName

} //Fim da classe Account