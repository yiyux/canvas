package cl.uchile;

public class PrintVisitor extends GraphicsVisitor {
	private String list;
	@Override
	public void visitCirculo(Circulo ci) {
			list += ci.getClass().getName().toUpperCase() + " ";		
	}

	@Override
	public void visitCuadrado(Cuadrado cu) {
			list += cu.getClass().getName().toUpperCase() + " ";
	}

	@Override
	public void visitEllipse(Ellipse e) {
			list += e.getClass().getName().toUpperCase() + " ";
	}

	public String printElements() {
		return list;
	}
}
