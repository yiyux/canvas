package cl.uchile;

public class Cuadrado implements Figura {
	public void accept(GraphicsVisitor v){
		v.visitCuadrado(this);
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
