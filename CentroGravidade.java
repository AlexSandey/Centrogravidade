package centrogravidade;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CentroGravidade {
    
   
// Esta funcao recebe o nome do arquivo a ser analisado, retira o tamanho do vetor na primeira linha, converte os valores obtidos em forma de string para um vetor do tipo char e retorna este mesmo vetor.

    static int leituraTamanhoVetor(String nomeArquivo) throws FileNotFoundException, IOException {
        FileReader arquivo;
        arquivo = new FileReader(nomeArquivo);
        BufferedReader leBufferizado;
        leBufferizado = new BufferedReader(arquivo);
        String primeiraLinha;
        primeiraLinha = leBufferizado.readLine();
        String[] palavras = primeiraLinha.split(","); 
        		
	  return primeiraLinha
        
    }
    
}
