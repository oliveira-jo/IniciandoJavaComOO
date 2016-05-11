/*
* Repare que a nossa classe Conta é uma excelente candidata para uma classe abstrata. Por quê? Que
* métodos seriam interessantes candidatos a serem abstratos?
* Transforme a classe Conta em abstrata, repare o que acontece no seu main já existente do TestaContas.
*
* Para que o código do main volte a compilar, troque o new Conta() por new ContaCorrente().
*
* Apenas pare efeito de entender melhor o abstract, remova (delete) o método atualiza() da ContaPoupanca,
* dessa forma ele herdará o método diretamente de Conta.
* Transforme o método atualiza() da classe Conta em abstrato
**/
package Cap8OOInterfaces.ex2;

public abstract class ContaCap7 {
    
    protected int numeroDaConta;
    protected double saldo;
    
    public ContaCap7(int num){
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
    
    public abstract void atualiza(double taxaSelic);
//    public void atualiza(double taxa){
//        this.saldo += this.saldo * taxa;
//    }
    
    public int getNumConta(){
        return this.numeroDaConta;
    }
    
}
