package cl.uchile;

public class PrintVisitor extends GraphicsVisitor {
	private String list;
	private boolean visitCirculo, visitCuadrado, visitElpise = false;
	@Override
	public void visit(Circulo ci) {
		if(!visitCirculo){
			list += ci.getClass().getName().toUpperCase() + " ";
			visitCirculo = true;
		}
	}

	@Override
	public void visit(Cuadrado cu) {
		if(!visitCuadrado){
			list += cu.getClass().getName().toUpperCase() + " ";
			visitCuadrado = true;
		}
		
	}

	@Override
	public void visit(Elipse e) {
		if(!visitElpise){
			list += e.getClass().getName().toUpperCase() + " ";
			visitElpise = true;
		}
	}

	public String printElements() {
		return list;
	}
}
