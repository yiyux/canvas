package cl.uchile;

public class Elipse implements Figura {
	public void accept(GraphicsVisitor v){
		v.visit(this);
	}
}
