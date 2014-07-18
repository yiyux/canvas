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
	
	public void accept(GraphicsVisitor v){
		for(Figura fig : this.getFiguras()){
			fig.accept(v);
		}
	}
	
	public String print(Collection<Figura> f){
		PrintVisitor visitor = new PrintVisitor();
		this.accept(visitor);
		return visitor.printElements();
	}
	
	public int totalFiguras(Collection<Figura> f){
		CountVisitor visitor = new CountVisitor();
		this.accept(visitor);
		return visitor.totalFiguras();
	}
	
	public int totalCirculos(Collection<Figura> f){
		CountVisitor visitor = new CountVisitor();
		this.accept(visitor);
		return visitor.totalCirculos();
	}

}
