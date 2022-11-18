package atividade18_11;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		int valorBusca = 0;
		boolean verificador = false;
		int matriz [][]= new int[6][6];
		
		Scanner teclado = new Scanner (System.in);
		
		for (int c = 0; c < 6; c++) {
			
			for (int l = 0; l < 6; l++) {
				
				System.out.println("Insira o valor da linha: " + l + " coluna: " + c);
				matriz[l][c] = teclado.nextInt();
			}
		}
		
		System.out.println("Qual valor você deseja encontrar?");
		valorBusca = teclado.nextInt();
		
		for (int c = 0; c < 6; c++) {
			
			for (int l = 0; l < 6; l++) {
				
				if (matriz[l][c] == valorBusca) {
					
					System.out.print("\nO valor pode ser encontrado na linha: " + l + " coluna: " + c);
					verificador = true;
				}
			}
		}
		if (verificador == false) {
			System.out.println("\nO valor não pode ser encontrado");
		}
		
	}

}
