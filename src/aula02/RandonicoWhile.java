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
		
		System.out.println("Tente acertar o valor que n�s temos! Tente at� conseguir (o n�mero � de 0 a 10)");
		
		tentativa = scan.nextInt();
		
		while(tentativa != valor) {
			tentativa = scan.nextInt();
			
			if(tentativa > valor) {
				System.out.println(" voc� tentou o valor " + tentativa + ". Ele �  maior que valor que deve adivinhar");
			}else {
				System.out.println(" voc� tentou o valor " + tentativa + ". Ele �  menor que valor que deve adivinhar");
			}
			qtdTentativas++;
		}
		
		System.out.println("Parab�ns, voc� acertou!!! " + qtdTentativas + " realizadas.");
		scan.close();
	}
}
