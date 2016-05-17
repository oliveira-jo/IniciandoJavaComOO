package Cap12JacaCollectionsFramework;

public class ContaCorrente extends Conta{

    public ContaCorrente(int num, String nome) {
        super(num,nome);
    }
    
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa * 2;
    }
    
    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }

    
}
