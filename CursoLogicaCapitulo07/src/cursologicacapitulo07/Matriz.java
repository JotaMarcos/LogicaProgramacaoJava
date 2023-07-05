package cursologicacapitulo07;

import java.util.Scanner;

public class Matriz {
    int matriz[][], linha, coluna;
    
    public Matriz(int linha, int coluna){
    System.out.println("-------------------------------------------------------------");
    	matriz = new int [linha][coluna];
        this.linha = linha;
        this.coluna = coluna;
    }

    public void Inserir(){
        Scanner entrada = new Scanner(System.in);
        for(int x=0; x < linha; x++){
            for(int y=0; y < coluna; y++){
                System.out.print("matriz ["+x+"]["+y+"] = ");
                matriz[x][y]= entrada.nextInt();
            }
        }
    }

    public void Imprimir(){
        for(int x=0; x < linha; x++){
            for(int y=0; y < coluna; y++){
                System.out.print(matriz[x][y]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int linha=0, coluna =0;
        System.out.println("-------------------------------------------------------------");
        System.out.print("Informe a quantidade de linhas da matriz: ");
        linha = entrada.nextInt();
        System.out.println("-------------------------------------------------------------");
        System.out.print("Informe a quantidade de colunas da matriz: ");
        coluna = entrada.nextInt();
        Matriz mat = new Matriz(linha, coluna);
        mat.Inserir();
        System.out.println("-------------------------------------------------------------");
        mat.Imprimir();
        System.out.println("-------------------------------------------------------------");
    }
}
