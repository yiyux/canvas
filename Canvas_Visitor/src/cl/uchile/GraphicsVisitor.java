package cl.uchile;

public abstract class GraphicsVisitor {
	public abstract void visit(Circulo ci);
	public abstract void visit(Cuadrado cu);
	public abstract void visit(Elipse e);
}
