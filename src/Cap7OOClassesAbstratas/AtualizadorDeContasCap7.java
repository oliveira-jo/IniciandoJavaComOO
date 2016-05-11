/*
* Vamos criar uma classe que seja responsável por fazer a atualização de todas as contas
* bancárias e gerar um relatório com o saldo anterior e saldo novo de cada uma das contas
**/
package Cap7OOClassesAbstratas;

public class AtualizadorDeContasCap7 {
    private double saldoTotal=0;
    private double selic;
    
    public AtualizadorDeContasCap7(double selic){
        this.selic = selic;
    }
    
    public void roda(ContaCap7 c){
        
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
