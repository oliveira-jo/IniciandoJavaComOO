/*
* imprimir números em paralelo
* Rode várias vezes a classe Teste e observe os diferentes resultados em cada execução
**/
package Cap13JavaThreadsAndTreeSetDesafio;

public class Programa implements Runnable{
    
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++){
            System.out.println("Programa "+id+" valor: "+i);
        }
    }
    
}
