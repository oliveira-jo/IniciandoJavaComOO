/*
* Volte ao nosso sistema de Funcionario e crie uma classe Empresa. A Empresa tem um nome, cnpj e uma
* array de Funcionario, além de outros atributos que você julgar necessário.
**/
package Cap4Arrays;
import Cap3OrientaçãoAObjetos.Funcionario;


public class Empresa {
    
    public String nome;
    public String cnpj;
    public Funcionario[] funcionarios;
    public int contFuncionario=0;
    
    public Empresa(){
       funcionarios = new Funcionario[100];
    }
    
    public void adiciona(Funcionario f){
        this.funcionarios[contFuncionario] = f;
        this.contFuncionario++;
    }
    
}
