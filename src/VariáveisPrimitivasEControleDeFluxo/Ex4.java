/*
* Imprima a soma de 1 até 1000.
*/
package VariáveisPrimitivasEControleDeFluxo;


public class Ex4 {
    
    public static void main(String[] args){
        
        int soma=0;
        for(int i=1; i<=1000; i++){
            soma += i;
            System.out.println("A soma é: "+soma);
        }
        
    }
    
}
