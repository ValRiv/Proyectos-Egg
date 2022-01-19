/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect.vale;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Ejemplo28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    	Scanner sc = new Scanner(System.in);
    	int m [][] = new int [10][10];
    	int p [][] = new int [3][3];
    	int cont=0, contMatriz=0;
   	 
    	//genera una matriz de 10*10 con enteros aleatorios y los muestra por pantalla
    	for(int i=0; i<10; i++){
        	for(int j=0; j<10; j++){
            	m[i][j] = (int) (Math.random()*100);
            	if(m[i][j]<10){
                	System.out.print("0"+m[i][j]+"   ");
            	}else{
                	System.out.print(m[i][j]+"   ");
            	}
        	}
        	System.out.println("");
    	}
   	 
    	//Se llena la matriz de 3*3
    	for(int i=0; i<3; i++){
        	System.out.println("Ingrese los numeros para la fila "+(i+1));
        	for(int j=0; j<3; j++){
            	p[i][j] = sc.nextInt();
        	}
    	}
   	 
    	//busco la matriz de 3*3 en la matriz de 10*10
    	int fila, col;
    	for(int i=0; i<8; i++){
        	for(int j=0; j<8; j++){
            	fila=i;
            	col=j;
            	for(int k=0; k<3; k++){
                	for(int n=0; n<3; n++){
                    	if(p[k][n] == m[fila][col]){
                        	cont++;
                    	}
                    	col++;
                	}
                	col=j;
                	fila++;
            	}
           	 
            	if(cont == 9){
                	System.out.println("Se encontró la matriz en la fila "+i+" columna "+j);
                	contMatriz++;
            	}
            	cont=0;
        	}
    	}
   	 
    	if(contMatriz == 0)
        	System.out.println("La matriz de 3*3 no esta incluida en la matriz de 10*10");
	}

}


    

