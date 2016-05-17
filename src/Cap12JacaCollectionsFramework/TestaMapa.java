/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
* 
* Depois, altere o código para usar o generics, e não haver a necessidade do casting, além da garantia de que
* nosso mapa estará seguro em relação a tipagem usada.
**/
package Cap12JacaCollectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class TestaMapa {
    
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente(0, "Jonathan");
        c1.deposita(10000);
        
        Conta c2 = new ContaCorrente(1, "Jorge");
        c2.deposita(3000);
        
        //cria o mapa
        //Map mapaDeContas = new HashMap();
        Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();
        mapaDeContas.put("desenvolvedor", c1);
        mapaDeContas.put("analista", c2);
        
        //qual conta do desenvolvedor?
        //Object elemento = mapaDeContas.get("desenvolvedor");
        //Conta contaDoDesenvolvedor = (Conta) elemento;
        
        Conta contaDoDesenvolvedor = mapaDeContas.get("desenvolvedor");
        System.out.println(contaDoDesenvolvedor.getNomeCliente());
        System.out.println(contaDoDesenvolvedor.getSaldo());
        
    }
    
}
