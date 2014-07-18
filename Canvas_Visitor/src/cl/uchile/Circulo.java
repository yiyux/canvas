package cl.uchile;

public class Circulo implements Figura {
	public void accept(GraphicsVisitor v){
		v.visitCirculo(this);
	}
}
