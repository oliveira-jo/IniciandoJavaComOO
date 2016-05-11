/*
* Crie um GerenciadorDeImpostoDeRenda, que recebe todos os tributáveis de uma pessoa e soma
* seus valores, e inclua nele um método para devolver seu total:
* 
**/
package Cap8OOInterfaces.ex2;

public class GerenciadorDeImpostoDeRenda {
    private double total;
    
    public void adiciona(Tributavel t){
        System.out.println("Adicionando trivutavel: "+t);
        this.total = this.total + t.calculaTributos();
    }
    
    public double getTotal(){
        return this.total;
    }
    
}
