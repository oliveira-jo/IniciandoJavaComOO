/*
* Imprima os primeiros números da série de Fibonacci até passar de 100. A série de Fibonacci é a
* seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... Para calculá-la, o primeiro e segundo elementos valem 1, daí por
* diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somando ao (n-2)-ésimo elemento (ex: 8 = 5 + 3). 
* --> Utilizando 2 Variáveis <--
**/
package Cap2VariáveisPrimitivasEControleDeFluxo;

public class Ex7Fibonacci {
    
    public static void main(String[] args) {
        
        int anterior=1, fib=1; 
        System.out.print("0,1,1,");
        while (fib<=100) {
            fib = fib+anterior;
            System.out.print(fib+",");
            anterior=fib-anterior;   
        }
    }
    
}
