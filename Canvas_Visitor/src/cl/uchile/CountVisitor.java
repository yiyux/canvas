package cl.uchile;

public class CountVisitor extends GraphicsVisitor {
	private int cir, cua, eli = 0;
	@Override
	public void visit(Circulo ci) {
		cir++;
	}

	@Override
	public void visit(Cuadrado cu) {
		cua++;
	}

	@Override
	public void visit(Elipse e) {
		eli++;
	}
	
	public int totalFiguras() {
		return cir + cua + eli;
	}
	
	public int totalCirculos() {
		return cir;
	}

}
