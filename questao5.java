package atividade18_11;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		
		int matriz [][] = new int [4][4];
		int opcao = 0;
		
		Scanner teclado = new Scanner (System.in);
		
		for (int c = 0; c < 4; c++) {
			
			for (int l = 0; l < 4; l++) {
				
				System.out.println("Insira o valor da linha: " + l + " coluna: " + c);
				matriz[l][c] = teclado.nextInt();
			}
		}
		for (int contador = 0;opcao != 0 || contador == 0;contador++) {
			
			System.out.println("\t\tMenu\n\n1 - Números da diagonal principal\n2 - Números sem a diagonal principal\n0 - Sair");
			opcao = teclado.nextInt();
			
			switch (opcao) {
			
			case 1:
				
				for (int c = 0; c < 4; c++) {
					
					for (int l = 0; l < 4; l++) {
						
						if (l == c) {
							System.out.println("O valor da linha: " + l + " coluna: " + c + " é: " + matriz[l][c]);
						}
					}
				}
			break;
			case 2:
				
				for (int c = 0; c < 4; c++) {
					
					for (int l = 0; l < 4; l++) {
						
						if (l != c) {
							System.out.println("O valor da linha: " + l + " coluna: " + c + " é: " + matriz[l][c]);
						}
					}
				}
			break;
			}
		}
	}

}
