package aplicacao;


import java.util.ArrayList;
import java.util.List;

import entities.Circulo;
import entities.Retangulo;
import entities.Shape;

public class App02 {

	public static void main(String[] args) {
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Retangulo(3.0,2.0));
		shapes.add(new Circulo(2.0));
		
		List<Circulo> circulos= new ArrayList<>();
		circulos.add(new Circulo(2.0));
		circulos.add(new Circulo(3.0));
		

	System.out.println("Total area :" + totalArea(shapes));
	
	
	}
	public static double  totalArea(List<? extends Shape>list) {
		double soma= 0.0;
		for(Shape s : list ) {
			soma += s.area();
		}
		return soma;
	}

}
