package aula02;

import java.util.Random;
import java.util.Scanner;

public class RandonicoWhile {

	public static void main(String[] args) {
		
		int valor = 0, tentativa = 0, qtdTentativas = 0;
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		valor = random.nextInt(10);
		
		System.out.println(valor);
		
		System.out.println("Tente acertar o valor que nós temos! Tente até conseguir (o número é de 0 a 10)");
		
		tentativa = scan.nextInt();
		
		while(tentativa != valor) {
			tentativa = scan.nextInt();
			
			if(tentativa > valor) {
				System.out.println(" você tentou o valor " + tentativa + ". Ele é  maior que valor que deve adivinhar");
			}else {
				System.out.println(" você tentou o valor " + tentativa + ". Ele é  menor que valor que deve adivinhar");
			}
			qtdTentativas++;
		}
		
		System.out.println("Parabéns, você acertou!!! " + qtdTentativas + " realizadas.");
		scan.close();
	}
}
