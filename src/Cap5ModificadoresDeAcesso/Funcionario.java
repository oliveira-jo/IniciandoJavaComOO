/* 
* Adicione o modificador de visibilidade (private, se necessário) para cada atributo e método da classe
* Funcionario. Tente criar um Funcionario no main e modificar ou ler um de seus atributos privados. O
* que acontece?
* Crie os getters e setters necessários da sua classe Funcionario
**/
package Cap5ModificadoresDeAcesso;


public class Funcionario {
    private String nome;
    private String partamento;
    private double salario;
    private String dataDeAdmissao;
    private String rg;
    private boolean estaNaEmpresaNoMomento = true;
    private boolean trabalhaNaEmpresa = true;
    
    public Funcionario(){}
    
    public Funcionario(String nome){
        this.nome="nome";
        this.trabalhaNaEmpresa=true;
    }
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
    
    //Get and Set --------------------------------------------------------------
    //--------------------------------------------------------------------------
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }

    public String getPartamento() {
        return partamento;
    }

    public void setPartamento(String partamento) {
        this.partamento = partamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(String dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isEstaNaEmpresaNoMomento() {
        return estaNaEmpresaNoMomento;
    }

    public void setEstaNaEmpresaNoMomento(boolean estaNaEmpresaNoMomento) {
        this.estaNaEmpresaNoMomento = estaNaEmpresaNoMomento;
    }

    public boolean isTrabalhaNaEmpresa() {
        return trabalhaNaEmpresa;
    }

    public void setTrabalhaNaEmpresa(boolean trabalhaNaEmpresa) {
        this.trabalhaNaEmpresa = trabalhaNaEmpresa;
    }
    
}
