package com.mehdi.DAO;

import java.util.List;

import com.mehdi.beans.Langage;
import com.mehdi.beans.Societe;

public interface SocieteDAO {
	
	
	void add_societe(Societe s);
	void delete_societe(int id);
	Societe findSocietebyId(int id);
	List<Societe> get_all_societes();

}
