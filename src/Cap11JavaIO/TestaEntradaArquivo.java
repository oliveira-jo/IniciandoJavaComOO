/*
* Crie um programa (simplesmente uma classe com um main) que leia da entrada padrão. 
* Para isso, você vai precisar de um BufferedReader que leia do System.in da mesma 
* forma como fizemos:
**/
package Cap11JavaIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaEntradaArquivo {
    
    public static void main(String[] args) throws IOException{
        
        //Leitura apartir de um aquivo
        //Antes criar o arquivo "arquivo.txt" com algum conteudo dentro do projeto
        //----------------------------------------------------------------------
        InputStream is = new FileInputStream("arquivoLeituraDePrograma.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        
        String s;
        do {            
            s = br.readLine();
            System.out.println(s);
        } while (s!=null);
        
        //Leitura apartir do teclado
        //----------------------------------------------------------------------
        InputStream isk = System.in;
        InputStreamReader isrk = new InputStreamReader(isk);
        BufferedReader brk = new BufferedReader(isrk);
        String linha = br.readLine();
        while (linha!=null) {
            System.out.println(linha);
            linha = br.readLine();
            
        }
    }
    
}
