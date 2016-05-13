package Cap10JavaLang;

import java.io.PrintStream;

public class TestaString {
    
    public static void main(String[] args) {
        //Teste os exemplos desse capítulo, para ver que uma String é imutável. 
        String s = "fj11";
        s.replaceAll("1", "2");
        System.out.println(s);
        System.out.println("____________________________________________________");
        
        //descubra de que classe é o objeto referenciado pelo atributo out da
        //System = PrintStrean
        PrintStream saida = System.out;
        saida.println("Ola");
        System.out.println("____________________________________________________");
        
        //Crie e imprima uma referência para Conta (ContaCorrente ou ContaPoupanca, 
        //no caso de sua Conta ser abstrata):
        // -> ao imprimir conta estara chamando o método conta.toString();
        //na qual imprime o nome do objeto mais uma referencia na memória ao mesmo
        Conta conta = new ContaCorrente(0,"Jonathan");
        System.out.println(conta);
        System.out.println("____________________________________________________");
        
        //Reescreva o método toString da sua classe Conta fazendo com que uma 
        //mensagem mais propícia seja devolvida.
        Conta conta2 = new ContaCorrente(1,"Carlos");
        System.out.println(conta2);
        System.out.println("____________________________________________________");
        
        //Um double não está sendo suficiente para guardar a quantidade de casas
        // necessárias em uma aplicação. Preciso guardar um número decimal muito 
        //grande! O que poderia usar? usa-se um float
        float numeroGrandeDeMaisComCasasDecimais;
        
        //Crie o GuardadorDeObjetos visto nesse capítulo, coloque uma 
        //ContaPoupanca na primeira posição, e tente recuperar essa conta 
        //fazendo um casting para ContaCorrente:
        GuardadorDeObjetos gdo = new GuardadorDeObjetos(10);
        gdo.addObjeto(conta);
        Conta aux = (Conta) gdo.getObj(0);
        System.out.println("conta nome: "+aux.getNomeCliente());
        System.out.println("____________________________________________________");
        
        //o método charAt(i), retorna o caractere existente na posição i da string, 
        //o método length retorna o número de caracteres na mesma e 
        //o método substring que recebe um int e devolve a SubString a partir da 
        //posição passada por aquele int.
        //O indexOf recebe um char ou uma String e devolve o índice em que aparece 
        //pela primeira vez na String principal 
        //(há também o lastIndexOf que devolve o índice da última ocorrência).
        //O toUpperCase e o toLowerCase devolvem uma nova String toda em maiúscula 
        //e toda em minúscula, respectivamente.
        //do Java 6, o método isEmpty, que devolve true se a String for vazia ou false

        //Escreva um método que usa os métodos charAt e length de uma String 
        //para imprimir a mesma caractere a caractere, com cada caractere em uma 
        //linha diferente.
        System.out.println("____________________________________________________");
        oneByOnString("Jonathan");
        
        //Reescreva o método do exercício anterior, mas agora imprima a string 
        //de trás para a frente.
        System.out.println("____________________________________________________");
        oneByOneStringBackwards("Jonathan");
        
        
    }
    
    public static void oneByOnString(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(": "+str.charAt(i));
        }
    }
    
    public static void oneByOneStringBackwards(String str){
        int contador = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            System.out.println(": "+str.charAt(contador));
            contador--;
        }
    }
    
}
