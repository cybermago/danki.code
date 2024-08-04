package com.dankicode.utilidades;

public class Utils {
	
	public static int numero=0;
	
	public int idade;
	public double peso = 70.5;
	public float peso2 = 70.5f;
	public String nome = "Jonata";
	protected String nome2 = "João";
	
	public Utils (int peso, String nome) {
		this.nome = nome;
		this.peso = peso;
		System.out.println(nome);
	}
	
	public void printHelloWorld() {
		System.out.println();
		idade = 30;
		printOutraCoisa();
		
	}
	
	private void printOutraCoisa() {
		System.out.println("outra coisa");
	}
	
	public int getIdade() {
		return idade;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
