package Cap5ModificadoresDeAcesso;

public class Teste {
    
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa(100);
        
        empresa1.setNome("BelloPane");
        Funcionario f1 = new Funcionario();
        f1.setNome("João");
        f1.setSalario(1000);
        Funcionario f2 = new Funcionario();
        f2.setNome("Paulo");
        f2.setSalario(1000);
        Funcionario f3 = new Funcionario();
        f3.setNome("Carlos");
        f3.setSalario(1500);
        Funcionario f4 = new Funcionario();
        f4.setNome("Betina");
        f4.setSalario(4000);
        
        empresa1.adiciona(f1);
        empresa1.adiciona(f2);
        empresa1.adiciona(f3);
        empresa1.adiciona(f4);
        
        empresa1.mostraFuncionarios();
    }
    
}


