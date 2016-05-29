package com.mehdi.DAO;

import java.util.List;

import com.mehdi.beans.Developpeur;

public interface DeveloppeurDAO {
	
	
		
		
		void add_Developpeur(Developpeur d);
		void delete_developpeur(int id);
		Developpeur findDeveloppeurbyId(int id);
		List<Developpeur> get_all_developpeurs();

	


}
