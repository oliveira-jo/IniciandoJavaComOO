package Cap7OOClassesAbstratas;

public class ContaPoupanca extends ContaCap7{
    
    public ContaPoupanca(int numeroDaConta){
        super(numeroDaConta);
    }
 
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa * 3;
    }
    
}
