package aula02;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota1, nota2, media;
		
		System.out.println("digite a nota 1");
		nota1 = scan.nextDouble();
		
		System.out.println("digite a nota 2");
		nota2 = scan.nextDouble();
		
		media = (nota1 + nota2) / 2;
		if(media >= 6) {
			System.out.println("Aprovado - Média " + media);
		}
		else {
			System.out.println("Reprovado - Média " + media);
		}
		scan.close();
	}
}
