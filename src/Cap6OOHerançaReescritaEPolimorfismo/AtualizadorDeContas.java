/*
* Vamos criar uma classe que seja responsável por fazer a atualização de todas as contas
* bancárias e gerar um relatório com o saldo anterior e saldo novo de cada uma das contas
**/
package Cap6OOHerançaReescritaEPolimorfismo;


public class AtualizadorDeContas {
    private double saldoTotal=0;
    private double selic;
    
    public AtualizadorDeContas(double selic){
        this.selic = selic;
    }
    
    public void roda(Conta c){
        
        System.out.println("Saldo Anterior: "+c.getSaldo());
        c.atualiza(selic);
        this.saldoTotal += c.getSaldo();
        System.out.println("Saldo Atualizado: "+c.getSaldo());
        System.out.println("____________________________________________________");
    
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
    
}
