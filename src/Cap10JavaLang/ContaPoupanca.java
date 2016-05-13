package Cap10JavaLang;

public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(int numeroDaConta, String nome){
        super(numeroDaConta,nome);
    }
 
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa * 3;
    }
    
}
