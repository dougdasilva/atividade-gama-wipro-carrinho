package mediaAluno;

import java.util.ArrayList;
import java.util.List;

public class Escola {

	public static void main(String[] args) {
		Turma classeCurso = new Turma();
		CalculaMedia1 calculadora = new CalculaMedia1();
		
		List<Aluno> gama = new ArrayList<>();
		
		gama.add(new Aluno(1L, "João", 8.5, 9.0, 7));
		gama.add(new Aluno(2L, "Maria", 10, 8, 10));

		classeCurso.setTurma(gama);
		
		classeCurso.getTurma().forEach(aluno ->{
			double media = calculadora.calculaMedia(aluno.getNota1(),aluno.getNota2(), aluno.getTrabalho());
		
			aluno.setMedia(media);
			
			if(classeCurso.getTurma().get(0).getMedia() >= 7) {
				System.out.println("O aluno " + aluno.getNome() + " Passou!!!");
				System.out.println("Sua Média é: " + aluno.getMedia() + "\n");
			}else {
				System.out.println("O aluno " + aluno.getNome() + " Ficou de Recuperação!");
				System.out.println("Sua Média é: " + aluno.getMedia() + "\n");
			}
		});		
	}
}