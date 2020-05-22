package Amir.gl51;

import java.io.Serializable;
import java.util.ArrayList;

public class Affichage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 821891992194259070L;
	private ArrayList<InterfacePersonnel> groupe;
	public Affichage(InterfacePersonnel tete) {
		this.groupe = new ArrayList<InterfacePersonnel>();
		groupe.add(tete);
	}
	private class GroupeIterator implements Iterator<Object>{
		private int count = 0;
		
		
		public GroupeIterator() {
			for(int i=0; i<groupe.size();i++) {
				if(groupe.get(i) instanceof CompositePersonnel) {
					for(InterfacePersonnel ip : groupe.get(i).getPersonnel().groupe_personnel) {
						groupe.add(ip);
					}
				}
			}
		}
		public Iterator getIterator() {
			return new GroupeIterator();
		}
		public InterfacePersonnel next() {
			// TODO Auto-generated method stub
			if(this.hashNext()) {
				return groupe.get(count++);
			}
			return null;
		}
		public boolean hashNext() {
			// TODO Auto-generated method stub
			if(count<groupe.size()) return true;
			return false;
		}
		public void remove() {
			// TODO Auto-generated method stub
			
		}
	}
}
