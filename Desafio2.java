package AvaliativaSomativa;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		//Instanciar classe scanner
		Scanner ler = new Scanner(System.in); 
		
		//Variaveis
		double area , b, h; 
		
		//Entrada de dados - Recebe valor da base e altura
		System.out.println("Informe a base: ");
		b = ler.nextDouble();
		
		System.out.println("Informe a altura: ");
		h = ler.nextDouble();
		
		//Processamento - Calcula area do triangulo
		area = (b * h) / 2; 
		
		//Saída de dados - Resultado da area
		System.out.println("A área do triângulo é: " + area); 
	}

}
