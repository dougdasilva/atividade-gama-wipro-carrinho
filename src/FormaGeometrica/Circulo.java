package FormaGeometrica;

import FgInterface.FormaGeometrica;

public class Circulo implements FormaGeometrica{
	
	private double raio;
	private double pi = Math.PI;
	
	public Circulo() {
		// TODO Auto-generated constructor stub
	}
	
	public Circulo(double diametro) {
		// TODO Auto-generated constructor stub
	}
	
	public double getPi() {
		return pi;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return this.raio; 
	}
	
	
	
	@Override
	public String cor() {
		return "Amarelo";
	}
	
	
	@Override
	public String quantidadeDeLados() {
		return "0 lados";
	}
	
	

	@Override
	public double area(double a, double b) {
		double area = (a * a) * b;
		return area;
	}
}
