/*
* Mude o critério de comparação da sua ContaPoupanca. Adicione um atributo nomeDoCliente
* na sua classe (caso ainda não exista algo semelhante) e tente mudar o compareTo para que uma lista de
* ContaPoupanca seja ordenada alfabeticamente pelo atributo nomeDoCliente.
**/
package Cap12JacaCollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaOrdenacao {
    public static void main(String[] args) {
        
        List<ContaPoupanca> contas = new ArrayList<ContaPoupanca>();
        
        ContaPoupanca c1 = new ContaPoupanca(150, "Paulo");
        contas.add(c1);
        
        ContaPoupanca c2 = new ContaPoupanca(100, "Lucia");
        contas.add(c2);
        
        ContaPoupanca c3 = new ContaPoupanca(200, "Jonathan");
        contas.add(c3);
        
        //ordenando as contas pelo seu id
        Collections.sort(contas);
        //impressão de todos ids das contas na lista já ordenada
        //lista ordenada por NÚMERO DA CONTA
        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Nome titular: "+contas.get(i).getNomeCliente());
            System.out.println("Conta número: "+contas.get(i).getNumConta());
        }
        
        //ordenando as contas pelo nome de usuário, ou seja sobrescreve o método compareTo
        TitularComparator comparator = new TitularComparator();
        Collections.sort(contas, comparator);
        //impressão de todos ids e nomes de todas as contas do List
        //lista ordenada por NOME DO TITULAR
        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Nome titular: "+contas.get(i).getNomeCliente());
            System.out.println("Conta número: "+contas.get(i).getNumConta());
        }
        
        //impressão de referências para essa lista
        System.out.println("toString: "+contas);
        
    }
    
}
