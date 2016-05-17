/*
* Utilizando as classes PrintStream e Scanner, você pode reescrever o exercício de copiar arquivos
* de uma maneira muito sucinta, experimente!
**/
package Cap11JavaIO;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class DeUmArquivoParaOutroDeManeiraSucinta {
    public static void main(String[] args) throws IOException{
        //leitura de um arquivo qualquer
        InputStream is = new FileInputStream("arquivoLeituraDePrograma.txt");
        Scanner entrada = new Scanner(is);
        
        //criando arquivo novo
        //PrintStream ps = new PrintStream("newSaida.txt");
        FileWriter fl = new FileWriter("newSaida.txt");
        
        //passando para o arquivo novo
        while(entrada.hasNext()){
            fl.write(entrada.nextLine());
        }
        fl.close();
    }
    
}
