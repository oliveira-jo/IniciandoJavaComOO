/*
* testando deposito com valores inválidos
**/
package Cap9ControlandoOsErrosComExcecoes;

public class TestaDeposito {
    public static void main(String[] args) {
        
        Conta cp = new ContaPoupanca(0);
        
        //Uma IllegalArgumentException é lançada uma vez que tentamos depositar 
        //um valor inválido
        //----------------------------------------------------------------------
        //cp.deposita(-100);
        
        //tratando o erro
        //----------------------------------------------------------------------
//        try {
//            cp.deposita(-100);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }

        //testando minha exception
        //----------------------------------------------------------------------
        try {
            cp.deposita(-100);
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
