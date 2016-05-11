package Cap8OOInterfaces.ex2;

public class ContaCorrente extends ContaCap7 implements Tributavel{

    public ContaCorrente(int num) {
        super(num);
    }
    
    public void atualiza(double taxa){
        this.saldo += this.saldo * taxa * 2;
    }
    
    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }

    //implementando a interface
    @Override
    public double calculaTributos() {
        return this.saldo * 0.01;
    }
    
}
