package FormaGeometrica;

import FgInterface.FormaGeometrica;

public class Retangulo implements FormaGeometrica{
	
	private double base;
	private double altura;
	
	
	public Retangulo() {
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
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String cor() {
		return "Roxo";
	}
	@Override
	public String quantidadeDeLados() {
		return "4 lados";
	}
	@Override
	public double area(double a, double b) {
		double area = (a * b);
		return area;
	}
}
