package AvaliativaSomativa;

import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) {
		//Instanciar classe scanner
		Scanner ler = new Scanner(System.in);
		
		//Declaração de variavel - Quantidade de carro
		String c[]= new String[6]; 
		
		//Processamento - Informar carros para guardar
		for (int i =0;i<6; i++) {
			System.out.println("Informe o carro para estacionar:");
			c[i] = ler.nextLine();
		}
		//Saída de dados - Apresenta carros guardados na garagem 
		System.out.println("Carros na garagem: ");
		for (int i =0; i<6; i++) {
			System.out.println(c[i]);
		}
		ler.close();
	}

}
