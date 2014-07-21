package cl.uchile;

public class Ellipse implements Figura {
	public void accept(GraphicsVisitor v){
		v.visitEllipse(this);
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
