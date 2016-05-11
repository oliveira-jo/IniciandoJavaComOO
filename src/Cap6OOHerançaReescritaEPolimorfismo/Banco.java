/*
 * Crie uma classe Banco que possui um array de Conta
 **/
package Cap6OOHerançaReescritaEPolimorfismo;

public class Banco {
    
    private String nome;
    private Conta [] contas;
    private int contadorDeContas;
    
    public Banco(String nome, int qtdContas){
        this.nome = nome;
        this.contas = new Conta[qtdContas];
        this.contadorDeContas=0;
    }
    
    //Método adiciona uma conta 
    public void adicionaConta(Conta c){
        if(contadorDeContas <=100){
            contas[contadorDeContas] = c;
            contadorDeContas++;
        }else{
            System.out.println("Limite de contas acabaram!");
        }
    }
    //Metodo retorna uma conta caso ela exista
    public Conta pegaConta(int numDaConta){
        
        boolean achou = false;
        try {
            for (Conta conta : contas) {
                if (conta.getNumConta() == numDaConta) {
                    achou = true;
                    return conta;
                }
            }    
        } catch (NullPointerException e) {
        }
        
        
        if (achou == false) {
            System.out.println("Conta não encontrada!!");
        }
        return new Conta(0);

    }
    //Metodo retorna o total de contas criadas
    public int totalDeContas(){
        return this.contadorDeContas;
    }
    
}
