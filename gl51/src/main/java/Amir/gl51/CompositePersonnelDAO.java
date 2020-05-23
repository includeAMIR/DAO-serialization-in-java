package Amir.gl51;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public class CompositePersonnelDAO extends DAO<CompositePersonnel> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4167312234762053696L;
	private ArrayList<CompositePersonnel> composite = new ArrayList<CompositePersonnel>();
	@Override
	public CompositePersonnel create(CompositePersonnel obj, String path) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		composite.add(obj);
		this.SerialWriter(path);
		return obj;
	}

	@Override
	public void read(String path) throws FileNotFoundException, ClassNotFoundException {
		this.SerialReader(path);
	}

	@Override
	public CompositePersonnel update(CompositePersonnel obj, Map<String, Object> map) {
		// TODO Auto-generated method stub
		if(!composite.isEmpty()) {
			@SuppressWarnings("unchecked")
			ArrayList<CompositePersonnel> cp = (ArrayList<CompositePersonnel>)map.get("groupe_personnel");
			for(CompositePersonnel p : cp) {
				obj.Add(p);
			}
			return obj;
		}
		else
		return null;
	}

	@Override
	public void delete(CompositePersonnel cp, String path) {
		// TODO Auto-generated method stub
		composite.remove(cp);
		File f = new File(path);
		f.delete();	
	}

}
