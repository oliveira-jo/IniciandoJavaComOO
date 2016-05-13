/*
* Na classe Conta, modifique o método deposita(double x): Ele deve lançar uma exception chamada
* IllegalArgumentException, que já faz parte da biblioteca do java, sempre que o valor passado como
* argumento for inválido (por exemplo, quando for negativo).
**/
package Cap9ControlandoOsErrosComExcecoes;

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
        if (valor < 0) {
            throw new ValorInvalidoException(valor);
        }else{
            this.saldo += valor * 0.9962;            
        }
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
