package cl.uchile;

import java.util.Collection;

public class Canvas {
	private Group grupo;
	
	public Canvas(){
		grupo = new Group();
	}
	
	public Collection<Figura> getFiguras(){
		return grupo.getFiguras();
	}
	
	public void add(IGroup f){
		if(f.isFigura()){
			grupo.addFigura((Figura)f);
		}
		if(f.isGroup()){
			grupo.addGroup((Group)f);
		}
	}
	
	public void accept(GraphicsVisitor v){
			grupo.accept(v);
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
