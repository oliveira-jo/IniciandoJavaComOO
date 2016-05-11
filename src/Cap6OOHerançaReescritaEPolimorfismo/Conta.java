/*
 * Crie uma classe conta
 * Atributo saldo
 **/
package Cap6OOHerançaReescritaEPolimorfismo;


public class Conta {
    
    protected int numeroDaConta;
    protected double saldo;
    
    public Conta(int num){
        this.numeroDaConta = num;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void deposita(double valor){
        this.saldo += valor;
    }
    
    public void saca(double valor){
        this.saldo -= valor;
    }
    
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa;
    }
    
    public int getNumConta(){
        return this.numeroDaConta;
    }
    
}
