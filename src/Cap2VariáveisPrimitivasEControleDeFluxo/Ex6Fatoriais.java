/*
*  Imprima os fatoriais de 1 a 10.
*  O fatorial de um número n é n * n-1 * n-2 ... até n = 1. Lembre-se de utilizar os parênteses. O fatorial de 0 é
*  1 O fatorial de 1 é (0!) * 1 = 1 O fatorial de 2 é (1!) * 2 = 2 O fatorial de 3 é (2!) * 3 = 6 O fatorial de 4 é (3!) *
*  4 = 24
**/
package Cap2VariáveisPrimitivasEControleDeFluxo;

public class Ex6Fatoriais {
    
    public static void main(String[] args) {
        
        for (int n=1, fatorial=1; n <= 10; n++) {
            System.out.println(n + "! = " + fatorial);
            if (n==1) {
                fatorial = 2;
            }else{
                fatorial = fatorial*(n+1);
            }
        }
    }
    
}
