package main;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int pont = 0;
		System.out.println("bem vindo presione s");
		String s = scan.nextLine();
		
		if(s.equals("s") || s.equals("S")) {
			System.out.println("Qual a capital do brasil?");
			s = scan.nextLine();
			if(s.equals("Brasilia")) {
				pont++;
				System.out.println("+1 ponto");
				System.out.println("voce quer continuar? (s) ou (d)");
				s = scan.nextLine();
				if(s.equals("s")) {
					//proxima pergunta
					System.out.println("Em qual continente fica o brasil:");
					s = scan.nextLine();
					if(s.equals("america do sul")) {
						pont++;
						System.out.println("parabens +"+pont+"pontos");
						System.out.println("+1 ponto");
						System.out.println("voce quer continuar? (s) ou (d)");
						s = scan.nextLine();
						if(s.equals("s")) {
							System.out.println("qual o nome da melhor escola de ti do brasil:");
							s = scan.nextLine();
							if(s.equals("danki code")) {
								pont++;
								System.out.println("pontuação final: "+pont+"pontos");
							}else {
								System.out.println("game over");
							}
						}else {
							System.out.println("");
						}
					}else {
						System.out.println("game over"+pont);
					}
					}else {
					System.out.println("game over! sua pontuação:"+pont);
				}
			}else {
				System.out.println("game over pontos:"+pont);
			}
		}else {
			System.out.println("acabou o jogo. pontos obtidos 0");
		}
		
	}

}
