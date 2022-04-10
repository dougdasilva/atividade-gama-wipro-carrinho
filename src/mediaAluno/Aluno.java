package mediaAluno;

public class Aluno {

	private Long matricula;
	private String nome;
	private double notaProva1;
	private double notaProva2;
	private double trabalho;
	private double media;
	
	public Aluno() {}
	
	public Aluno(Long matricula, String nome, double nota1, double nota2, double trabalho) {
		this.matricula = matricula;
		this.nome = nome;
		this.notaProva1 = nota1;
		this.notaProva2 = nota2;
		this.trabalho = trabalho;
	}
	
	
	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return notaProva1;
	}

	public void setNota1(double nota1) {
		this.notaProva1 = nota1;
	}

	public double getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(double trabalho) {
		this.trabalho = trabalho;
	}

	public double getNota2() {
		return notaProva2;
	}

	public void setNota2(double nota2) {
		this.notaProva2 = nota2;
	}
	


	public double getMedia() {
		return media;
	}
	

	public void setMedia(double media) {
		this.media = media;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(notaProva1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(notaProva2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(trabalho);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Aluno other = (Aluno) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(notaProva1) != Double.doubleToLongBits(other.notaProva1))
			return false;
		if (Double.doubleToLongBits(notaProva2) != Double.doubleToLongBits(other.notaProva2))
			return false;
		if (Double.doubleToLongBits(trabalho) != Double.doubleToLongBits(other.trabalho))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", nota1=" + notaProva1 + ", nota2=" + notaProva2 + ", media="
				+ trabalho + "]";
	}

}
