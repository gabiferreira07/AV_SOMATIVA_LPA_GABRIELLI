package AvaliativaSomativa;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		//Instanciar classe scanner
		Scanner ler = new Scanner(System.in); 
		
		//Variaveis
		double a, b, soma, sub, mult, div; 
		
		//Entrada de dados - Informa valores para as operações
		System.out.println("Informe valor 1: ");
		a = ler.nextDouble();
		
		System.out.println("Informe valor 2: ");
		b = ler.nextDouble();
		
		//Processamento - Calcula as operações
		soma = a + b;
		sub = a - b;
		mult = a * b;
		div = a / b;
		
		//Saída de dados - Resultado das operações
		System.out.println("Resultado(soma): " + soma);
		System.out.println("Resultado(subtração): " + sub);
		System.out.println("Resultado(multiplicação): " + mult);
		System.out.println("Resultado(divisão): " + div);
	}

}
