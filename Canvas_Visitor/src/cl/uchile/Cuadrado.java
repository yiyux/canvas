package cl.uchile;

public class Cuadrado implements Figura {
	public void accept(GraphicsVisitor v){
		v.visitCuadrado(this);
	}
}
