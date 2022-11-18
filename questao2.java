package atividade18_11;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		
		int matriz[][] = new int [5][5];
		
		Scanner teclado = new Scanner(System.in);
		
		for (int c = 0; c < 5; c++) {
			
			for (int l = 0; l < 5; l++) {
				
				System.out.println("Insira o valor para a linha: " + l + " coluna: " + c);
				matriz[l][c] = teclado.nextInt();
			}
		}
		
		for (int c = 0; c < 5; c++) {
			
			for (int l = 0; l < 5; l++) {
				
				if (l == c) {
					System.out.print("\nValor da linha: " + l + " coluna: " + c + " é: " + matriz[l][c]);
				}
			}
		}
		
	}

}
