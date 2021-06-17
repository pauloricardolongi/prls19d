package entities;

public class Circulo implements Shape {
	
	private double raios;	

	public Circulo(double raios) {
		super();
		this.raios = raios;
	}

	public double getRaios() {
		return raios;
	}

	public void setRaios(double raios) {
		this.raios = raios;
	}
    
	@Override
	public double area() {
		
		return Math.PI * raios * raios;
	}

}
