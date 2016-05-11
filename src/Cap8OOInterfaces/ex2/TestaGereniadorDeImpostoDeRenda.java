/*
* Crie um main para instanciar diversas classes que implementam Tributavel e passar como argumento para
* um GerenciadorDeImpostoDeRenda. Repare que você não pode passar qualquer tipo de conta para o método
* adiciona, apenas a que implementa Tributavel. Além disso, pode passar o SeguroDeVida.
* Repare que, de dentro do GerenciadorDeImpostoDeRenda, você não pode acessar o método getSaldo, por
* exemplo, pois você não tem a garantia de que o Tributavel que vai ser passado como argumento tem
* esse método. A única certeza que você tem é de que esse objeto tem os métodos declarados na interface
* Tributavel.
* É interessante enxergar que as interfaces (como aqui, no caso, Tributavel) costumam ligar classes muito
* distintas, unindo-as por uma característica que elas tem em comum. No nosso exemplo, SeguroDeVida e
* ContaCorrente são entidades completamente distintas, porém ambas possuem a característica de serem
* tributáveis.
* Se amanhã o governo começar a tributar até mesmo PlanoDeCapitalizacao, basta que essa classe
* implemente a interface Tributavel! Repare no grau de desacoplamento que temos: a classe
* GerenciadorDeImpostoDeRenda nem imagina que vai trabalhar como PlanoDeCapitalizacao. Para ela, a
* única coisa que importa é que o objeto respeite o contrato de um tributável, isso é, a interface Tributavel.
* Novamente: programe voltado a interface, não a implementação.
*
**/
package Cap8OOInterfaces.ex2;

public class TestaGereniadorDeImpostoDeRenda {

    public static void main(String[] args) {
        
        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
        
        SeguroDeVida sv = new SeguroDeVida();
        gerenciador.adiciona(sv);
        
        ContaCorrente cc = new ContaCorrente(0);
        cc.deposita(1000);
        gerenciador.adiciona(cc);
        
        System.out.println(gerenciador.getTotal());
        //método printf para imprimir o saldo com exatamente duas casas deimais
        System.out.printf("CC Saldo: %.2f", cc.getSaldo());
    }
    
}
