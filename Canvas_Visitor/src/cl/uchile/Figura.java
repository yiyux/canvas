package cl.uchile;

public interface Figura extends IGroup {
	public abstract void accept(GraphicsVisitor v);
}
