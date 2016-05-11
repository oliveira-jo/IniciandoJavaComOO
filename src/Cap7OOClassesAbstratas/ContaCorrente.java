package Cap7OOClassesAbstratas;

public class ContaCorrente extends ContaCap7{

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
