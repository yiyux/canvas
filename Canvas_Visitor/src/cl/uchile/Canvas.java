package cl.uchile;

import java.util.ArrayList;
import java.util.Collection;

public class Canvas {
	private static Collection<Figura> figuras;
	
	public Canvas(){
		figuras = new ArrayList<Figura>();
	}
	
	public Collection<Figura> getFiguras(){
		return figuras;
	}
	
	public void add(Figura f){
		figuras.add(f);
	}
	
	public String print(Collection<Figura> f){
		GraphicsVisitor visitor = new PrintVisitor();
		for(Figura fig : f){
			fig.accept(visitor);
		}
		return ((PrintVisitor) visitor).printElements();
	}
	
	public int totalFiguras(Collection<Figura> f){
		GraphicsVisitor visitor = new CountVisitor();
		for(Figura fig : f){
			fig.accept(visitor);
		}
		return ((CountVisitor) visitor).totalFiguras();
	}
	
	public int totalCirculos(Collection<Figura> f){
		GraphicsVisitor visitor = new CountVisitor();
		for(Figura fig : f){
			fig.accept(visitor);
		}
		return ((CountVisitor) visitor).totalCirculos();
	}
	
	/*
	public static void main(String[] args) {
		
		visitor = new CountVisitor();
		visitor2 = new PrintVisitor();
		figuras.add(new Circulo());
		figuras.add(new Circulo());
		figuras.add(new Cuadrado());
		figuras.add(new Cuadrado());
		figuras.add(new Cuadrado());
		figuras.add(new Elipse());
		for(Figura fig : figuras){
			fig.accept(visitor);
			fig.accept(visitor2);
		}
		System.out.println(((PrintVisitor) visitor2).printElements());
		System.out.println(((CountVisitor) visitor).totalFiguras());
		System.out.println(((CountVisitor) visitor).totalCirculos());
	}
*/
}
