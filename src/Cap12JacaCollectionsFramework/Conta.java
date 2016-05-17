package Cap12JacaCollectionsFramework;

public abstract class Conta {
    
    protected String nomeCliente;
    protected int numeroDaConta;
    protected double saldo;
    
    public Conta(int num, String nome){
        this.numeroDaConta = num;
        this.nomeCliente = nome;
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

    public String getNomeCliente() {
        return nomeCliente;
    }
    
}
