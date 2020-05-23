package Amir.gl51;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

public class PersonnelDAO extends DAO<Personnel> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7493448686678914037L;
	private ArrayList<Personnel> groupe;
	public PersonnelDAO() {
		this.groupe = new ArrayList<Personnel>();
	}
	public Personnel create(Personnel per, String path) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		groupe.add(per);
		this.SerialWriter(path);
		
		return null;
	}
	public void read(String path) throws FileNotFoundException, ClassNotFoundException {
		// TODO Auto-generated method stub
		this.SerialReader(path);
	}
	@SuppressWarnings("unchecked")
	public Personnel update(Personnel p, Map<String, Object>map) {
		// TODO Auto-generated method stub
		Personnel p2 = null;
		if (!groupe.isEmpty()) {
	          String nom = (String) map.get("nom");
	          String prenom = (String) map.get("prenom");
	          String fonction = (String) map.get("fonction");
	          java.time.LocalDate dateN = (LocalDate) map.get("dateN");
	          ArrayList<String> num = (ArrayList<String>) map.get("num");
	          p2 = (Personnel) new Personnel.Builder(
	              nom, prenom, fonction, dateN).AddAllNum(num).build();
	          groupe.add(p2);
	  		return p2;
	      }
		else return null;
	}

	public void delete(Personnel p, String path) {
		groupe.remove(p);
		File f = new File(path);
		f.delete();
		// TODO Auto-generated method stub
	}


}
