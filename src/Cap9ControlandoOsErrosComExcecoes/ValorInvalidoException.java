/*
* Crie sua própria Exception, ValorInvalidoException. Para isso, você precisa criar uma classe com esse
* nome que extenda de RuntimeException.
* 
* Atenção: nem sempre é interessante criarmos um novo tipo de exception! Depende do caso. Neste aqui,
* seria melhor ainda utilizarmos IllegalArgumentException.
* 
**/
package Cap9ControlandoOsErrosComExcecoes;

public class ValorInvalidoException extends RuntimeException {
    private double valor;
    public ValorInvalidoException(double valor){
        if (valor < 0) {
            this.valor=valor;
            this.getMessage();
            
        }
    }
    public String getMessage(){
        return "Não posso retirar valor negativo: "+this.valor;
    }

}
