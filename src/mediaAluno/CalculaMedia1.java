package mediaAluno;

/**
 * Foi criada uma classe pr�pria para o calcular a m�dia pois caso futuramente seja feita uma outra regra
 * para o calculo, tem possibilidade de criar outra classe e fazer outra implementa��o e utilizar interfaces
 * para chamar a implementa��o desejada
 * 
 * @author Junior
 *
 */

public class CalculaMedia1 {
	
	public CalculaMedia1() {
	
	}
	
	public double calculaMedia(double nota1, double nota2, double trabalho) {
		double media = ((nota1 * 1.5) + (nota1 * 1.5)  + (trabalho * 2)) / (1.5 + 1.5 + 2);
		return media;
	}

}
