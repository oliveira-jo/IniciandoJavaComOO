package Cap11JavaIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class DoTecladoParaArquivo {
    public static void main(String[] args) throws IOException{
        //leitura de um arquivo qualquer
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        
        //criando arquivo novo
        OutputStream os = new FileOutputStream("newSaidaDoTeclado.txt");
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
