package com.br.trocar.valores;

import java.util.Scanner;

public class Trocar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int primeiro = 0;
		int segundo = 0;
		int troca = 0;
		
		System.out.println("Digite o primeiro valor:");
		primeiro = scan.nextInt();
		
		System.out.println("Digite o segundo valor:");
		segundo = scan.nextInt();
		
		System.out.println("Numeros digitados: "+ primeiro + " e " + segundo);
		
		troca = primeiro;
		primeiro = segundo;
		segundo = troca;
		
		
		System.out.println("Numeros trocados: "+ primeiro + " e " + segundo);
		
		
	}

}
