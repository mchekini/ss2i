package com.mehdi.beans;

public class Societe {
	
	private int id_societe;
	private String nom_societe;
	private String lieu_societe;
	public int getId_societe() {
		return id_societe;
	}
	public void setId_societe(int id_societe) {
		this.id_societe = id_societe;
	}
	public String getNom_societe() {
		return nom_societe;
	}
	public void setNom_societe(String nom_societe) {
		this.nom_societe = nom_societe;
	}
	public String getLieu_societe() {
		return lieu_societe;
	}
	public void setLieu_societe(String lieu_societe) {
		this.lieu_societe = lieu_societe;
	}
	@Override
	public String toString() {
		return "Societe [id_societe=" + id_societe + ", nom_societe=" + nom_societe + ", lieu_societe=" + lieu_societe
				+ "]";
	}
	
	

}
