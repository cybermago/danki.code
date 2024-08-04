package main;

import java.util.Scanner;


public class Main2{
	
	public char[] nome = new char[100];
	public int[] nums = {10,20};

	public static void main(String[] args) {
		new Main();
		Scanner scan = new Scanner(System.in);
		double tempat = System.currentTimeMillis();
		String s = scan.nextLine();
		System.out.println(s);
		
		
		if(System.currentTimeMillis() - tempat >= 2000) {
			if(s.length() > 10) {
				System.out.println("show");
			}else {
				System.out.println("muuito curto");
			}
		}else {
			System.out.println("ops esperar");
			tempat = System.currentTimeMillis();
			s = scan.nextLine();
			if(System.currentTimeMillis() - tempat >= 2000) {
				System.out.println("agora sim");
			}else {
				System.out.println("erro");
			}
			}
		}
	
	public double convertTime(double temp) {
		return temp/100;
	}}