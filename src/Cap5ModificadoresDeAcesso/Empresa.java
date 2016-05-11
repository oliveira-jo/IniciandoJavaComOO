/*
* 1. Crie os getters e setters da sua classe Empresa e coloque seus atributos como private. Lembre-se
* de que não necessariamente todos os atributos devem ter getters e setters.
* 2. Em vez de criar um array de tamanho fixo, receba como parâmetro no construtor
* o tamanho do array de Funcionario.
* Agora, com esse construtor, o que acontece se tentarmos dar new Empresa() sem passar argumento algum?
* Por quê?
**/
package Cap5ModificadoresDeAcesso;


public class Empresa {
    
    private String nome;
    private String cnpj;
    private final Funcionario[] funcionarios;
    private int contFuncionario;
    
    public Empresa(int tamanhoArrayFuncionario){
       funcionarios = new Funcionario[tamanhoArrayFuncionario];
       this.contFuncionario=0;
    }
    
    public void adiciona(Funcionario f){
        this.funcionarios[this.contFuncionario] = f;
        this.contFuncionario++;
    }
    
    public void mostraFuncionarios(){
        
        //try{}catch(){} resolve o problema de null pointer exception do array
        try{
            for (Funcionario f : this.funcionarios) {
                f.mostraDados();
                System.out.println(" --------------------------------------- ");
            }
        }catch(NullPointerException e){}
    
    }
    
    //Get and Set --------------------------------------------------------------
    //--------------------------------------------------------------------------
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }

    public int getContFuncionario() {
        return contFuncionario;
    }

    public void setContFuncionario(int contFuncionario) {
        this.contFuncionario = contFuncionario;
    }
    
}
