package FormaGeometrica;

import FgInterface.FormaGeometrica;

public class TestaForma {

	public static void main(String[] args) {

		System.out.println("CIRCULO");
		FormaGeometrica interfaceCirculo = new Circulo();
		Circulo circulo = new Circulo();
		circulo.setRaio(18);
		
		System.out.println("Raio: " + circulo.getRaio());
		System.out.println("Cor " + interfaceCirculo.cor());
		System.out.println("Area do Circulo: " + interfaceCirculo.area(circulo.getRaio(), circulo.getPi()) + "\n");

		
		System.out.println("QUADRADO");
		FormaGeometrica interfaceQuadrado = new Quadrado();
		Quadrado quadrado = new Quadrado();
		quadrado.setLado(4);
		
		System.out.println("Lado " + quadrado.getLado());
		System.out.println("Cor: " + interfaceQuadrado.cor());
		System.out.println("Area Quadrado " + interfaceQuadrado.area(quadrado.getLado(), quadrado.getLado()) + "\n");
		
		
		System.out.println("RETANGULO");
		FormaGeometrica interfaceRetangulo = new Retangulo();
		Retangulo retangulo  = new Retangulo();
		retangulo.setAltura(5);
		retangulo.setBase(10);
		
		System.out.println("Lado " + quadrado.getLado());
		System.out.println("Cor: " + interfaceRetangulo.cor());
		System.out.println("Area Retangulo " + interfaceRetangulo.area(retangulo.getBase(), retangulo.getAltura()) + "\n");
		
		
		System.out.println("Triangulo");
		FormaGeometrica interfaceTriangulo = new Triangulo();
		Triangulo triangulo = new Triangulo();
		triangulo.setAltura(12);
		triangulo.setAltura(9);
		
		System.out.println("Lado " + interfaceTriangulo.quantidadeDeLados());
		System.out.println("Cor: " + interfaceTriangulo.cor());
		System.out.println("Area Triangulo " + interfaceTriangulo.area(triangulo.getAltura(), triangulo.getBase()) + "\n");
		
	}

}
