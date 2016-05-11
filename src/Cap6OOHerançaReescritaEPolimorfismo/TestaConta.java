package Cap6OOHerançaReescritaEPolimorfismo;

public class TestaConta {
    
    public static void main(String[] args) {
        //Testes iniciais com conta
        //----------------------------------------------------------------------
        Conta c1 = new Conta(1);
        ContaCorrente cc1 = new ContaCorrente(2);
        ContaPoupanca cp1 = new ContaPoupanca(3);
        c1.deposita(1000.0);
        cc1.deposita(1000.0);
        cp1.deposita(1000.0);
        
        c1.atualiza(0.01);
        cc1.atualiza(0.01);
        cp1.atualiza(0.01);
        
        System.out.println("Conta: "+c1.getSaldo());
        System.out.println("Conta Corrente: "+cc1.getSaldo());
        System.out.println("Conta Poupança: "+cp1.getSaldo());
        
        //Testes Usando polimorfismo, obriga a iniciar o cod da conta ao criála
        //----------------------------------------------------------------------
        Conta c = new Conta(1);
        Conta cc = new ContaCorrente(2);
        Conta cp = new ContaPoupanca(3);
        
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        
        AtualizadorDeContas adc1 = new AtualizadorDeContas(0.01);
        adc1.roda(c);
        adc1.roda(cc);
        adc1.roda(cp);
        
        System.out.println("Saldo Total: "+adc1.getSaldoTotal());

        //Testes Utilizando Classes Conta e Classe Banco
        //----------------------------------------------------------------------
        Banco bb = new Banco("Banco do Brasil", 100);
        
        //Criando algumas contas aleatóriamente e insira-as no banco
        for (int i = 0; i <= 30; i++) {
            if (i<=10) { //cria conta 
                bb.adicionaConta(new Conta(i));

            } if (i>=11 && i<=20) { // cria CC
                bb.adicionaConta(new ContaCorrente(i));
                
            } if (i>=21 && i<=30) { //cria CP
                bb.adicionaConta(new ContaPoupanca(i));
                
            }
        }
        
        //Fazendo alguns depósitos nas contas criadas anteriormente 
        for (int i = 0; i <= 30; i++) {
            bb.pegaConta(i).deposita(1000);
        }
        
        //percorra todas as contas do Banco para passá-las como argumento para o 
        // AtualizadorDeContas.
        AtualizadorDeContas adc = new AtualizadorDeContas(0.1);
        for (int i = 0; i < bb.totalDeContas(); i++) {
            System.out.println("Número da Conta: "+bb.pegaConta(i).getNumConta());
            adc.roda(bb.pegaConta(i));
        }
    
    }
    
}
