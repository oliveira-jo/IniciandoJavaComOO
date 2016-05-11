/*
* 
* Modele um funcionário. Ele deve ter o nome do funcionário, o departamento onde trabalha, seu salário
* (double), a data de entrada no banco (String), seu RG (String) e um valor booleano que indique se o
* funcionário está na empresa no momento ou se já foi embora.
* Você deve criar alguns métodos de acordo com sua necessidade. Além deles, crie um método bonifica que
* aumenta o salario do funcionário de acordo com o parâmetro passado como argumento. Crie, também, um
* método demite, que não recebe parâmetro algum, só modifica o valor booleano indicando que o funcionário
* não trabalha mais aqui.
* A idéia aqui é apenas modelar, isto é, só identifique que informações são importantes e o que um funcionário
* faz. Desenhe no papel tudo o que um Funcionario tem e tudo que ele faz.
* 
* Transforme o modelo acima em uma classe Java. Teste-a, usando uma outra classe que tenha o main. Você
* deve criar a classe do funcionário chamada Funcionario, e a classe de teste você pode nomear como quiser.
* 
**/
package Cap3OrientaçãoAObjetos;


public class Funcionario {
    public String nome;
    public String partamento;
    public double salario;
    public String dataDeAdmissao;
    public String rg;
    public boolean estaNaEmpresaNoMomento = true;
    public boolean trabalhaNaEmpresa = true;
    
    //método que aumenta o salário 
    public void bonifica(double valAumento){
        this.salario = this.salario + valAumento;
    }
    
    //método que demite o funcionário
    public void demite(){
        this.trabalhaNaEmpresa = false;
    }
    
    //mostrar todos os dados do funcionário
    public void mostraDados(){
        
        System.out.println("Nome: "+this.nome);
        System.out.println("Departamento: "+this.partamento);
        System.out.println("Salário: "+this.salario);
        System.out.println("RG: "+this.rg);
        System.out.println("Data de Admissão: "+this.dataDeAdmissao);
        System.out.println("Esta na Empresa: "+this.estaNaEmpresaNoMomento);
        System.out.println("Funcionário da empresa: "+this.trabalhaNaEmpresa);
    
    }
    
}
