package cl.uchile;

public class CountVisitor extends GraphicsVisitor {
	private int cir, cua, eli = 0;
	@Override
	public void visitCirculo(Circulo ci) {
		cir++;
	}

	@Override
	public void visitCuadrado(Cuadrado cu) {
		cua++;
	}

	@Override
	public void visitEllipse(Ellipse e) {
		eli++;
	}
	
	public int totalFiguras() {
		return cir + cua + eli;
	}
	
	public int totalCirculos() {
		return cir;
	}

}
