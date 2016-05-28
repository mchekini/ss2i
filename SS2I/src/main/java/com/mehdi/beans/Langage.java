package com.mehdi.beans;

public class Langage {
	
	
	private int id_langage;
	private String nom_langage;
	public int getId_langage() {
		return id_langage;
	}
	public void setId_langage(int id_langage) {
		this.id_langage = id_langage;
	}
	public String getNom_langage() {
		return nom_langage;
	}
	public void setNom_langage(String nom_langage) {
		this.nom_langage = nom_langage;
	}
	@Override
	public String toString() {
		return "Langage [id_langage=" + id_langage + ", nom_langage=" + nom_langage + "]";
	}
	
	

}
