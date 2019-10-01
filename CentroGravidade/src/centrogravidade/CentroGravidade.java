package centrogravidade;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CentroGravidade {
    static Scanner entrada = new Scanner(System.in);
    
    static int[] tamanhoVetor(String nomeArquivo)throws FileNotFoundException, IOException {
        FileReader arquivo;
        arquivo = new FileReader(nomeArquivo);
        BufferedReader leBufferizado;
        leBufferizado = new BufferedReader(arquivo);
        String linha;
        linha = leBufferizado.readLine();
        String[] tamanhoVetorS = linha.split(" ");       
        double[] tamanhoVetorD = new double[tamanhoVetorS.length];
        for (int i = 0; i<tamanhoVetorS.length; i++) tamanhoVetorD[i] = Double.valueOf(tamanhoVetorS[i]);
        double tamanhoX = tamanhoVetorD[0];
        double tamanhoY = tamanhoVetorD[1];
        int tamX = (int)tamanhoX;
        int tamY = (int)tamanhoY;
        int[] tamanhoVetor = new int[]{tamX,tamY}; 
        return tamanhoVetor;
    }
        
    static double[][] popularMatriz(String nomeArquivo, double[][]criarMatriz, int[]tamanhoVetor)throws FileNotFoundException, IOException {
        String valorS;
        double valor;
        double tamanhoX = tamanhoVetor[0];
        double tamanhoY = tamanhoVetor[1];
        int tamX = (int)tamanhoX;
        int tamY = (int)tamanhoY;
        String[] transS = new String [tamX];
        double[] transD = new double [tamX];
        FileReader arquivo;
        arquivo = new FileReader(nomeArquivo);
        BufferedReader leBufferizado;
        leBufferizado = new BufferedReader(arquivo);
        String linha;
        int j = 1;
        int cont = 0;
        int ver = 0;
        while ((linha = leBufferizado.readLine()) != null) {
            if (cont==0){
            System.out.println("Pulei");
            cont++;
            }else{
            transS = linha.split(" ");
            for (int i = 0; i<tamX; i++) transD[i] = Double.valueOf(transS[i]);
            System.out.println(transD[]);
            } 
            
        }
        return criarMatriz;
    }
    
    static double[][] criarMatriz(int[]tamanhoVetor){
        double tamanhoX = tamanhoVetor[0];
        double tamanhoY = tamanhoVetor[1];
        int tamX = (int)tamanhoX;
        int tamY = (int)tamanhoY;
        double[][] matriz = new double[tamX][tamY];
        return matriz;
    }
    
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        System.out.println("Entrada:");
        String arquivo = entrada.nextLine();
        int[] tamanhoVetor = new int[2];
        tamanhoVetor = tamanhoVetor(arquivo);
        double[][] criarMatriz = new double[tamanhoVetor[0]][tamanhoVetor[1]];   
        criarMatriz = criarMatriz(tamanhoVetor);
        double[][] popularMatriz = popularMatriz(arquivo, criarMatriz, tamanhoVetor);
        
        for (int i = 0; i < tamanhoVetor[i]; i++) {
            for (int j = 0; j < tamanhoVetor[j]; j++) {
                System.out.println(popularMatriz[i][j]);
                System.out.println("\n");
            }
        }
    
    }
    
}
