package main;

import java.util.Scanner;

public class Main{
	
	public char[] nome = new char[100];
	public int[] nums = {10,20};
	
	public Main() {
		int soma=0;
		nome[0] = 'g';
		System.out.println(nome[1]);
		for(int i= 0; i< nums.length; i++) {
			System.out.println(nums[i]);
			soma+=nums[i];
		}
		System.out.println(soma);
	}

	public static void main(String[] args) {
		new Main();
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
	}

}

