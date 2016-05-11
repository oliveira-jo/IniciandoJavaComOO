package Cap7OOClassesAbstratas;

public class TestaConta {
    
    public static void main(String[] args) {
        
        //Testes Usando polimorfismo, obriga a iniciar o cod da conta ao criála
        //----------------------------------------------------------------------
        ContaCap7 c = new ContaCorrente(1);
        ContaCap7 cc = new ContaCorrente(2);
        ContaCap7 cp = new ContaPoupanca(3);
        
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        
        AtualizadorDeContasCap7 adc1 = new AtualizadorDeContasCap7(0.01);
        adc1.roda(c);
        adc1.roda(cc);
        adc1.roda(cp);
        
        System.out.println("Saldo Total: "+adc1.getSaldoTotal());
    
    }
    
}
