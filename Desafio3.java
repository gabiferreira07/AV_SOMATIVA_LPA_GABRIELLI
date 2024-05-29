package AvaliativaSomativa;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		//Instanciar classe scanner
		Scanner ler = new Scanner(System.in);
		
		//Variavel
		int dia;
		
		//Entrada de dados
		System.out.print("Informe o dia da semana(1-7): ");
		dia = ler.nextInt();
		
		//Processamento e saída de dados, informando de acordo com a condição
		if (dia == 1) {
			System.out.println("Domingo");
		}
		else if (dia == 2) {
				System.out.println("Segunda-feira");
		}
		else if (dia == 3) {
			System.out.println("Terça-feira");
		}
		else if (dia == 4) {
			System.out.println("Quarta-feira");
		}
		else if (dia == 5) {
			System.out.println("Quinta-feira");
		}
		else if (dia == 6) {
			System.out.println("Sexta-feira");
		}
		else if (dia == 7) {
			System.out.println("Sabádo");
		}
		else {
			System.out.println("Dia Inválido");
		}
		ler.close();
	}

}