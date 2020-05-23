package Amir.gl51;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
	public Personnel read(String path) {
		// TODO Auto-generated method stub
		return null;
	}
	@SuppressWarnings("unchecked")
	public Personnel updatet(Personnel p, Map<String, Object>params) {
		// TODO Auto-generated method stub
		if (!groupe.isEmpty()) {
	          String nom = "";
	          if (params.containsKey("nom")) {
	              nom = (String) params.get("nom");
	          } else {
	              nom = p.getNom();
	          }
	          String prenom = "";
	          if (params.containsKey("prenom")) {
	              prenom = (String) params.get("prenom");
	          } else {
	              prenom = p.getPrenom();
	          }
	          String fonction = "";
	          if (params.containsKey("fonction")) {
	              fonction = (String) params.get("fonction");
	          } else {
	              fonction = p.getFonction();
	          }
	          java.time.LocalDate dateN;
	          if (params.containsKey("dateN")) {
	            dateN = (LocalDate) params.get("dateN");
	          } else {
	            dateN = p.getDate_naissance();
	          }
	          ArrayList<String> num;
	          if (params.containsKey("num")) {
	              num = (ArrayList<String>) params.get("num");
	          } else {
	              num = p.getNumero_tel();
	          }
	          Personnel pp = (Personnel) new Personnel.Builder(
	              nom, prenom, fonction, dateN).build();
	          groupe.add(p);
	      }
		return null;
	}

	public void delete(Personnel p, String path) {
		groupe.remove(p);
		File f = new File(path);
		f.delete();
		// TODO Auto-generated method stub
	}


}
