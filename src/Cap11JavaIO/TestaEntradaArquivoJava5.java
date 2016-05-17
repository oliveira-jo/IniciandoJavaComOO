/*
* -> Utilize a classe Scanner para ler de um arquivo e colocar na tela. 
* O código vai ficar incrivelmente pequeno.
* -> Depois troque a variável is para que ela se refira ao System.in. 
* Agora você esta lendo do teclado!
**/
package Cap11JavaIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class TestaEntradaArquivoJava5 {
    public static void main(String[] args) throws IOException{
        
        //Leitura do arquivo, mais simplificada a partir do java 5
        //----------------------------------------------------------------------
        InputStream is = new FileInputStream("arquivoLeituraDePrograma.txt");        
        Scanner entrada = new Scanner(is);
        while (entrada.hasNextLine()) {
            System.out.println(entrada.nextLine());
        }
        is.close();
        
        //Leitura do teclado
        //----------------------------------------------------------------------
        Scanner entrada2 = new Scanner(System.in);
        while (entrada2.hasNextLine()) {
            System.out.println(entrada.nextLine());
        }
        entrada2.close();
        
    }
}
