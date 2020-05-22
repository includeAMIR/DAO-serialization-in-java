package Amir.gl51;

import java.io.Serializable;
import java.util.ArrayList;

public class CompositePersonnel implements InterfacePersonnel,  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4936862728143092331L;
	/**
	 * 
	 */
	private final ArrayList<InterfacePersonnel> groupe_personnel = new ArrayList<InterfacePersonnel>();
	public void print() {
		for(InterfacePersonnel groupe : this.groupe_personnel) {
			groupe.print();
		}
	}
	public void Add(InterfacePersonnel groupe) {
		if(groupe_personnel.contains(groupe)) 
			System.out.println("Already exist");
		else groupe_personnel.add(groupe);
	}
	public void Remove(InterfacePersonnel groupe) {
		if(groupe_personnel.contains(groupe)) 
			groupe_personnel.remove(groupe);
		else 
			System.out.println("not exist");
	}
	public CompositePersonnel getPersonnel() {
		// TODO Auto-generated method stub
		return this;
	}

}
