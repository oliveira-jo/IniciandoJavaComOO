/*
* 1. Crie uma outra classe que possuirá o seu método main. Dentro dele crie algumas instâncias de Funcionario
* e passe para a empresa pelo método adiciona. Repare que antes você vai precisar criar a array, pois
* inicialmente o atributo funcionarios da classe Empresa não referencia lugar nenhum (null)
* 
* 2. Percorra o atributo funcionarios da sua instância da Empresa e imprima o salários de todos seus funcionários.
* Ou você pode chamar o método mostra() de cada Funcionario da sua array.
* Use também o for novo do java 5.0.
**/
package Cap4Arrays;

import Cap3OrientaçãoAObjetos.Funcionario;


public class TesteEmpresa {
    
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa();
        
        empresa1.nome="BelloPane";
        Funcionario f1 = new Funcionario();
        f1.nome="João";
        f1.salario=1000;
        Funcionario f2 = new Funcionario();
        f2.nome="Paulo";
        f2.salario=1000;
        Funcionario f3 = new Funcionario();
        f3.nome="Carlos";
        f3.salario=1500;
        Funcionario f4 = new Funcionario();
        f4.nome="Betina";
        f4.salario=5000;
        
        empresa1.adiciona(f1);
        empresa1.adiciona(f2);
        empresa1.adiciona(f3);
        empresa1.adiciona(f4);
        
        //try{}catch(){} resolve o problema de null pointer exception do array
        try{
            for (Funcionario f : empresa1.funcionarios) {
                f.mostraDados();
                System.out.println(" --------------------------------------- ");
            }
        }catch(NullPointerException e){}
    }
    
}
