/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cap8OOInterfaces.ex2;

public class TestaTributavel {
    
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(0);
        cc.deposita(100);
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
        
    }
    
}
