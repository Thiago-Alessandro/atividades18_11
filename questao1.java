package atividade18_11;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		
		int quantiaLinhas, quantiaColunas,opcao = 0;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Qual a quantidade de linhas das matrizes A e B?");
		quantiaLinhas = teclado.nextInt();
		
		System.out.println("\nQual a quantia de colunas das matrizes A e B?");
		quantiaColunas = teclado.nextInt();
		
		int matrizA[][] = new int[quantiaLinhas][quantiaColunas];
		int matrizB [][] = new int [quantiaLinhas][quantiaColunas];
		
		int matrizesSoma[][] = new int [quantiaLinhas][quantiaColunas];
		int matrizesSubtracao[][] = new int [quantiaLinhas][quantiaColunas];
		int matrizesMultiplicacao[][] = new int [quantiaLinhas][quantiaColunas];
		
		for(int contadorColuna = 0; contadorColuna < quantiaColunas;contadorColuna++) {
			
			for (int contadorLinha = 0;contadorLinha < quantiaLinhas;contadorLinha++) {
				
				System.out.println("Qual o valor da matriz A linha: " + contadorLinha + " coluna: " + contadorColuna + "?");
				matrizA[contadorLinha][contadorColuna] = teclado.nextInt();
				
				System.out.println("Qual o valor da matriz B linha: " + contadorLinha + " coluna: " + contadorColuna + "?");
				matrizB[contadorLinha][contadorColuna] = teclado.nextInt();
			}
		}
		for (int contador = 0;opcao != 0 || contador == 0;contador++) {
		
			System.out.println("\n\tMENU\n1 - somar\n2 - Subtrair\n3 - Multiplicar\n0 - Sair");
			opcao = teclado.nextInt();
			
			switch (opcao) {
			
			case 1: 
				
				for (int c = 0; c < quantiaColunas;c++) {
					
					for (int l = 0; l < quantiaLinhas;l++) {
						
						matrizesSoma[l][c] = matrizA[l][c] + matrizB [l][c];
						
						System.out.println("A soma das matrizes linha: " + l + " coluna: " + c + " é: " + matrizesSoma[l][c]);
					}
				}
				
			break;
			case 2:
				
				for (int c = 0; c < quantiaColunas;c++) {
					
					for (int l = 0; l < quantiaLinhas;l++) {
						
						matrizesSubtracao[l][c] = matrizA[l][c] - matrizB [l][c];
						
						System.out.println("A subtração das matrizes linha: " + l + " coluna: " + c + " é: " + matrizesSubtracao[l][c]);
					}
				}
			
			break;
			case 3:
				
				for (int c = 0; c < quantiaColunas;c++) {
					
					for (int l = 0; l < quantiaLinhas;l++) {
						
						matrizesMultiplicacao[l][c] = matrizA[l][c] * matrizB [l][c];
						
						System.out.println("A multiplicação das matrizes linha: " + l + " coluna: " + c + " é: " + matrizesMultiplicacao[l][c]);
					}
				}
	
			break;
			}
		}
		
	}

}
