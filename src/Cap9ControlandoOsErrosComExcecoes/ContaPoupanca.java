package Cap9ControlandoOsErrosComExcecoes;

public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(int numeroDaConta){
        super(numeroDaConta);
    }
 
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa * 3;
    }
    
}
