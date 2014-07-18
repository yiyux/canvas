package cl.uchile;

public class Ellipse implements Figura {
	public void accept(GraphicsVisitor v){
		v.visitEllipse(this);
	}
}
