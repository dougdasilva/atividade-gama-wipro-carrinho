package aula02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaAluno2 {

	public static void main(String[] args) {

		List<Double> listaNotas= new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota");
		listaNotas.add(scan.nextDouble());
		System.out.println("Informe a segunda nota");
		listaNotas.add(scan.nextDouble());
		
		double media = (listaNotas.get(0) + listaNotas.get(1)) / listaNotas.size();
		if(media > 5) {
			System.out.println("Aprovado - Média " +  media);
		}else {
			System.out.println("Reprovado - Média " +  media);
		}
		scan.close();
	}
}
