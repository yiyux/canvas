package cl.uchile;

public interface IGroup {
	public abstract void accept(GraphicsVisitor v);
	public abstract boolean isGroup();
	public abstract boolean isFigura();
}
