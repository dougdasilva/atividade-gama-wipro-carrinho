package FormaGeometrica;

import FgInterface.FormaGeometrica;

public class Quadrado implements FormaGeometrica{
	
	private String cor;
	private double lado; 
	
	public Quadrado() {
		// TODO Auto-generated constructor stub
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double getLado() {
		return lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public String cor() {
		return "Azul";
		
	}
	@Override
	public String quantidadeDeLados() {
		return "4 Lados";
	}
	@Override
	public double area(double a, double b) {
		double area = a * b;
		return area;
	}
}
