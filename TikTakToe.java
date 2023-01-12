package labs_20;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int [][] game = new int[3][3];
		boolean win = false;
		int value = 0;
		
		int iVal = 0;
		int jVal = 0;
		int jogador = ((int)Math.round(Math.random()*1)+1);;
		
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				game[i][j] = 0;
			}
		}
		
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				if (j == 2) {
					System.out.print(game[i][j]);
					System.out.println();
				} else {
					System.out.print(game[i][j]);
				}
			}
		}
		
		while (!win) {
			System.out.println("É a vez do jogador " + jogador + "!");
			System.out.println("faça a sua jogada, digite a cordenada para marcar");
			
			iVal = scan.nextInt();
			jVal = scan.nextInt();
			
			game[iVal][jVal] = jogador;
			
			if (game[0][0] == 1 && game[0][1] == 1 && game[0][2] == jogador) {
				win = true;
				value = 1;
			} else if (game[1][0] == jogador && game[1][1] == jogador && game[1][2] == jogador) {
				win = true;
				value = 1;
			} else if (game[2][0] == jogador && game[2][1] == jogador && game[2][2] == jogador) {
				win = true;
				value = 1;
			} else if (game[0][0] == jogador && game[1][0] == jogador && game[2][0] == jogador) {
				win = true;
				value = 1;
			} else if (game[0][1] == jogador && game[1][1] == jogador && game[2][1] == jogador) {
				win = true;
				value = 1;
			} else if (game[0][2] == jogador && game[1][2] == jogador && game[2][2] == jogador) {
				win = true;
				value = 1;
			} else if (game[0][0] == jogador && game[1][1] == jogador && game[2][2] == jogador) {
				win = true;
				value = 1;
			} else if (game[2][0] == jogador && game[1][1] == jogador && game[0][2] == jogador) {
				win = true;
				value = 1;
			}
			
			if (value == 1) {
				win = true;
				System.out.println("O jogador " + jogador + " ganhou!");
			} else {
				if (jogador == 1) {
					jogador = 2;
				} else { 
					jogador = 1;
				}
			}
			
			for (int i = 0; i < game.length; i++) {
				for (int j = 0; j < game[i].length; j++) {
					if (j == 2) {
						System.out.print(game[i][j]);
						System.out.println();
					} else {
						System.out.print(game[i][j]);
					}
			}
			}
		}
	}
}
