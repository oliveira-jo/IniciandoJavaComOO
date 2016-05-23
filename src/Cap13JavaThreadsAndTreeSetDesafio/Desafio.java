/*
* Gere todos os números entre 1 e 1000 e ordene em ordem decrescente utilizando um TreeSet.
**/
package Cap13JavaThreadsAndTreeSetDesafio;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Desafio {
    
    public static void main(String[] args) {
        
        //criando a TreeSet e fazendo a parte decrescente atráves do comparator
        TreeSet<Integer> set = new TreeSet<Integer>(
                //aqui a mágica acontece...
                new Comparator<Integer>(){
                    public int compare(Integer obj1, Integer obj2){
                        if (obj1 < obj2) return +1;
                        else if (obj1 > obj2) return -1;
                        else return 0;
                    }
                }
        );
        //adicionando elementos na Tree
        for(int i = 0; i<=1000;i++){
            set.add(i);
        }
        //impressão de elementos
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {            
            System.out.println(itr.next()+" ");
        }
    }
    
}
