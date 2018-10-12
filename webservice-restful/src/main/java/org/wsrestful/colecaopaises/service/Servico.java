package org.wsrestful.colecaopaises.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.wsrestful.colecaopaises.modelo.Pais;
public class Servico {
	static HashMap<Integer,Pais> paisIdMap=getpaisIdMap();
	public Servico() {
		super();
		if(paisIdMap==null){
			paisIdMap=new HashMap<Integer,Pais>();
			Pais indiapais=new Pais(1, "India",10000);
			Pais chinapais=new Pais(4, "China",20000);
			Pais nepalpais=new Pais(3, "Nepal",8000);
			Pais bhutanpais=new Pais(2, "Bhutan",7000);
			paisIdMap.put(1,indiapais);
			paisIdMap.put(4,chinapais);
			paisIdMap.put(3,nepalpais);
			paisIdMap.put(2,bhutanpais);
		}
	}

	public List<Pais> getPaises(){
		List<Pais> paises = new ArrayList<Pais>(paisIdMap.values());
		return paises;
	}

	public Pais getPais(int id){
		Pais pais= paisIdMap.get(id);
		return pais;
	}
	
	public Pais addPais(Pais pais){
		pais.setId(paisIdMap.size()+1);
		paisIdMap.put(pais.getId(), pais);
		return pais;
	}
	
	public Pais updatePais(Pais pais){
		if(pais.getId()<=0) {
			return null;
		}
		paisIdMap.put(pais.getId(), pais);
		return pais;

	}
	public void deletePais(int id){
		paisIdMap.remove(id);
	}

	public static HashMap<Integer, Pais> getpaisIdMap() {
		return paisIdMap;
	}


}
