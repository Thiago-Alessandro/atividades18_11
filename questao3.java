package atividade18_11;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		
		int matriz[][] = new int [4][4];
		
		Scanner teclado = new Scanner (System.in);
		
		for (int c = 0; c < 4; c++) {
			
			for (int l = 0; l < 4; l++) {
				System.out.println("Insira o valor para a linha: " + l + " coluna: " + c );
				matriz[l][c] = teclado.nextInt(); 
			}
		}
		
		for (int c = 0; c < 4; c++) {
			
			for (int l = 0; l < 4; l++) {
				
				if (matriz[l][c] < 0) {
					matriz[l][c] = 0;
				}
				
			}
		}
		for (int c = 0; c < 4; c++) {
			
			for (int l = 0; l < 4; l++) {
				
				System.out.print("\nO valor da linha: " + l + " coluna: " + c + " é: " + matriz[l][c]);
			}
		}
		
	}

}
