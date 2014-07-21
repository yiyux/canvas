package cl.uchile;

public class Circulo implements Figura {
	public void accept(GraphicsVisitor v){
		v.visitCirculo(this);
	}

	@Override
	public boolean isGroup() {
		return false;
	}

	@Override
	public boolean isFigura() {
		return true;
	}
}
