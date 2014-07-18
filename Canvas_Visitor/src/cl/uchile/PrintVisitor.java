package cl.uchile;

public class PrintVisitor extends GraphicsVisitor {
	private String list;
	@Override
	public void visit(Circulo ci) {
			list += ci.getClass().getName().toUpperCase() + " ";		
	}

	@Override
	public void visit(Cuadrado cu) {
			list += cu.getClass().getName().toUpperCase() + " ";
	}

	@Override
	public void visit(Elipse e) {
			list += e.getClass().getName().toUpperCase() + " ";
	}

	public String printElements() {
		return list;
	}
}
