package Cap6OOHerançaReescritaEPolimorfismo;


public class ContaCorrente extends Conta{

    public ContaCorrente(int num) {
        super(num);
    }
    
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa * 2;
    }
    
    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }
    
}
