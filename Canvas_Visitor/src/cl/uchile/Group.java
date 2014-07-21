package cl.uchile;

import java.util.ArrayList;
import java.util.Collection;

public class Group implements IGroup {
	private Collection<IGroup> grupo; 
	
	public Group(){
		grupo = new ArrayList<IGroup>();
	}
	
	@Override
	public void accept(GraphicsVisitor v) {
		for(IGroup e : this.getGroup()){
				e.accept(v);
		}
	}

	public Collection<IGroup> getGroup() {
		return this.grupo;
	}

	public void addGroup(Group g) {
		grupo.add(g);
	}

	public void addFigura(Figura f) {
		grupo.add(f);	
	}

	@Override
	public boolean isGroup() {
		return true;
	}

	@Override
	public boolean isFigura() {
		return false;
	}
	
	public Collection<Figura> getFiguras(){
		Collection<Figura> aux = new ArrayList<Figura>();
		for(IGroup e : this.getGroup()){
			if(e.isFigura()){
				aux.add((Figura)e);
			}
			if(e.isGroup()){
				aux.addAll(((Group) e).getFiguras());
			}
		}
		return aux;
	}

}
