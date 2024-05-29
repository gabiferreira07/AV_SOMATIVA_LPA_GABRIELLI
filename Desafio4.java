package AvaliativaSomativa;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		//Instanciar classe scanner
		Scanner ler = new Scanner(System.in);

		//Declaração de variaveis para guardar valores
		int valores[] = new int[15];
		int soma = 0;
		
		//Processamento - Receber 15 valores
		for (int i =0;i<15; i++) {
			System.out.print("Informe valor "+(i+1) +":");
			valores[i]=ler.nextInt();
		}
		//Processamento - Somar os 15 valores
        for (int valor : valores) {
            soma += valor;
        }
        //Saída de dados - Resultado da soma
        System.out.println("A soma dos valores é: " + soma);
    }
}