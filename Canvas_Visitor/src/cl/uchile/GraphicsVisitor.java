package cl.uchile;

public abstract class GraphicsVisitor {
	public abstract void visitCirculo(Circulo ci);
	public abstract void visitCuadrado(Cuadrado cu);
	public abstract void visitEllipse(Ellipse e);
}
