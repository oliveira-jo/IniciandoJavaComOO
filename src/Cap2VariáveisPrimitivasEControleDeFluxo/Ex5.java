/*
* Imprima todos os múltiplos de 3, entre 1 e 100.
*/
package Cap2VariáveisPrimitivasEControleDeFluxo;


public class Ex5 {
    
    public static void main(String[] args) {
        
        for (int i = 1; i < 100; i++) {
        
            if (i%3 == 0) {
                
                System.out.println("é multiplo de 3: "+ i);
                
            }
        
        }
        
    }
    
}
