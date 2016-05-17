/*
* Crie um código que insira 30 mil números numa ArrayList e pesquise-os. Vamos usar um método de
* System para cronometrar o tempo gasto:
* 
* Troque a ArrayList por um HashSet e verifique o tempo que vai demorar:
**/
package Cap12JacaCollectionsFramework;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformanceArrayListXHashSet {
    public static void main(String[] args) {
        
        System.out.println("Iniciando...");
        long inicio = System.currentTimeMillis();
        //Collection<Integer> teste = new ArrayList<Integer>();
        Collection<Integer> teste = new HashSet<Integer>();
        
        for (int i = 0; i < 50000; i++) {
            teste.add(i);
        }
        
        for (int i = 0; i < 50000; i++) {
            teste.contains(i);
        }
        
        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto: " + tempo);
    }
    
}
