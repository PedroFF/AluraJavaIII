
package testeio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;


public class TesteIO {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        /*
        InputStream is = System.in; //new FileInputStream("leitura.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        
        OutputStream os = new FileOutputStream("saida.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        
        String linha = br.readLine();
        while (linha!=null){
        bw.append(linha);
        bw.newLine();
        linha = br.readLine();
        }
        
        br.close();
        bw.close();
        */
        
        Scanner sc = new Scanner(new FileInputStream("leitura.txt"));
        PrintStream ps = new PrintStream("saida.txt");
        
        while(sc.hasNextLine()){
            String linha = sc.nextLine();
            ps.println(linha);
        }
        
        ps.close();
        sc.close();
    }
    
    
}
