/*
* Altere seu programa para que ele leia do arquivo e, em vez de jogar na tela, jogue em um arquivo.
* Você vai precisar, além do código anterior para ler de um arquivo, do código para escrever num arquivo.
* Para isso, você pode usar o BufferedWriter:
**/
package Cap11JavaIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class DeUmArquivoParaOutro {
    public static void main(String[] args) throws IOException{
        //leitura de um arquivo qualquer
        InputStream is = new FileInputStream("arquivoLeituraDePrograma.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        
        //criando arquivo novo
        OutputStream os = new FileOutputStream("newSaida.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        
        //escrevendo no arquivo "newSaida"o que foi lido de "arquivo"
        String linha = br.readLine();
        while (linha != null) {
            System.out.println(linha);
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }
        is.close();
        bw.close();
    }
    
}
