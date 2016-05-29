package com.mehdi.DAO;

import java.util.List;

import com.mehdi.beans.*;

public interface LangageDAO {
	
	void add_langage(Langage l);
	void delete_langage(int id);
	Langage findlangagebyId(int id);
	List<Langage> get_all_langages();
	

}
