package centrogravidade;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CentroGravidade {
    
   
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader arquivo;
        arquivo = new FileReader("entrada.txt");
        BufferedReader leBufferizado;
        leBufferizado = new BufferedReader(arquivo);
        String linha;
        linha = leBufferizado.readLine();
        System.out.println(linha);
        
    }
    
}
