package Amir.gl51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class PersonnelDAO extends DAO<Personnel> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7493448686678914037L;
	private ArrayList<Personnel> groupe;
	public PersonnelDAO() {
		this.groupe = new ArrayList<Personnel>();
	}
	public Personnel find(String path) {
		// TODO Auto-generated method stub
		return null;
	}
	public Personnel create(Personnel obj) {
		// TODO Auto-generated method stub
		return null;
	}
	public Personnel updatet(Personnel obj) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Personnel obj) {
		// TODO Auto-generated method stub
	}


}
