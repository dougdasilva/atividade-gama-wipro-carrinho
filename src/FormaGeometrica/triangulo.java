package FormaGeometrica;

import FgInterface.FormaGeometrica;

public class Triangulo implements FormaGeometrica{
	
	private double base = 10;
	private double altura = 3;
	
	public Triangulo() {
		
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	@Override
	public String cor() {
		return "Ciano";
	}
	@Override
	public String quantidadeDeLados() {
		return "3 Lados";
	}
	@Override
	public double area(double a, double b) {
		double area = (a * b) / 2;
		return area;
	}
	
	
	
	
}
