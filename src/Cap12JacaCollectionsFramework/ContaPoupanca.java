package Cap12JacaCollectionsFramework;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
    
    public ContaPoupanca(int numeroDaConta, String nome){
        super(numeroDaConta, nome);
    }
 
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa * 3;
    }

    //Comparando por id ou saldo
    @Override
    public int compareTo(ContaPoupanca o) {
        if (this.getNumConta() < o.getNumConta()) {
            return -1;
        }
        if (this.getNumConta() > o.getNumConta()) {
            return 1;
        }
        return 0;
    }
    
}
