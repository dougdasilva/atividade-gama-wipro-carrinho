package mediaAluno;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	private List<Aluno> turma = new ArrayList<>();
	
	public Turma() {
	}

	public List<Aluno> getTurma() {
		return turma;
	}

	public void setTurma(List<Aluno> turma) {
		this.turma = turma;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((turma == null) ? 0 : turma.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Turma other = (Turma) obj;
		if (turma == null) {
			if (other.turma != null)
				return false;
		} else if (!turma.equals(other.turma))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Turma [turma=" + turma + "]";
	}
	
}
