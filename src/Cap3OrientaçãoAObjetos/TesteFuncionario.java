
package Cap3OrientaçãoAObjetos;


public class TesteFuncionario {
    
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.nome="Pedro";
        f1.salario=100;
        f1.bonifica(50);
        
        Funcionario f2 = new Funcionario();
        f2.nome="Pedro";
        f2.salario=100;
        f2.bonifica(50);
        
        //testando se objetos são iguais
        if (f1 == f2) {
            System.out.println("objetos iguais");
        }else{
            System.out.println("objetos diferentes");
        }
        
        //testando se os nomes dos objetos são iguais
        if (f1.nome.equals(f2.nome)) {
            System.out.println("nomes iguais");
        }else{
            System.out.println("nomes diferentes");
        }
        
        //criando apontador para um objeto já criado
        Funcionario f3 = f1;
        if (f1==f3) {
            System.out.println("objetos iguais");
        }else{
            System.out.println("objetos diferentes");
        }   
    }
    
}
