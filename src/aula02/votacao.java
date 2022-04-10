package aula02;

import java.util.Scanner;

public class votacao {

	public static void main(String[] args) {

		String[] candidatos = new String[4];
		int[] votos = new int[4];
		int opc = 0, qtdAlunos;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de alunos na sala:");
		qtdAlunos = scan.nextInt();
		
		System.out.println("Entre com os nomes dos 4 candidatos:");
		
		for(int i=0 ; i < 4 ; i++) {
			candidatos[i] = scan.next();
		}
		
		for(int i = 0; i < qtdAlunos; i ++) {
			System.out.println("escolha 1 para " + candidatos[0] + " | "  
					+ " escolha 2 para " + candidatos[1] + " | "
					+ " escolha 3 para " + candidatos[2] + " | "
					+ " escolha 4 para " + candidatos[3]);
			
			opc = scan.nextInt();
			
			switch(opc) {
			case 1:
				votos[0]++;
				break;
			case 2:
				votos[1]++;
				break;
			case 3:
				votos[2]++;
				break;
			case 4:
				votos[3]++;
				break;	
			}
		}

		if(votos[0] > votos[1]  && votos[0] > votos[2] && votos[0] > votos[3]) {
			System.out.println("O candidato vencedor é: " + candidatos[0]);
		}else if(votos[1] > votos[0]  && votos[1] > votos[2] && votos[1] > votos[3]) { 
			System.out.println("O candidato vencedor é: " + candidatos[1]);
		}else if(votos[2] > votos[0]  && votos[2] > votos[1] && votos[2] > votos[3]) { 
			System.out.println("O candidato vencedor é: " + candidatos[2]);
		}else if(votos[3] > votos[0]  && votos[3] > votos[1] && votos[3] > votos[2]) { 
			System.out.println("O candidato vencedor é: " + candidatos[2]);
		}else {
			System.out.println("Sem vencedor");
		}
		scan.close();
	}
}





//		valorMax = votos[0];
//		
//		for(int i = 0; i < 4; i++) {
//			if(votos[i] > valorMax) {
//				valorMax = votos[i];
//				posicao++;
//		}