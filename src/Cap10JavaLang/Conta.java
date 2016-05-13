/*
* Agora faça com que o equals da sua classe Conta também leve em consideração a String do
* nome do cliente a qual ela pertence. Teste-a.
**/
package Cap10JavaLang;

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

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public String toString(){
        return "esse objeto é uma conta de " + this.nomeCliente
                + " com saldo de: "+this.saldo;
    }
    
    public boolean equals(Object obj){
        Conta outraConta = (Conta) obj;
        return this.numeroDaConta == outraConta.numeroDaConta && 
                this.nomeCliente == outraConta.nomeCliente;
    }
    
}
