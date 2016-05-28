package com.mehdi.beans;

public class Developpeur {
	
	
private int id_developpeur;
private String nom_developpeur;
private String prenom_developpeur;
private Langage langage;
private Societe societe;
public int getId_developpeur() {
	return id_developpeur;
}
public void setId_developpeur(int id_developpeur) {
	this.id_developpeur = id_developpeur;
}
public String getNom_developpeur() {
	return nom_developpeur;
}
public void setNom_developpeur(String nom_developpeur) {
	this.nom_developpeur = nom_developpeur;
}
public String getPrenom_developpeur() {
	return prenom_developpeur;
}
public void setPrenom_developpeur(String prenom_developpeur) {
	this.prenom_developpeur = prenom_developpeur;
}
public Langage getLangage() {
	return langage;
}
public void setLangage(Langage langage) {
	this.langage = langage;
}
public Societe getSociete() {
	return societe;
}
public void setSociete(Societe societe) {
	this.societe = societe;
}
@Override
public String toString() {
	return "Developpeur [id_developpeur=" + id_developpeur + ", nom_developpeur=" + nom_developpeur
			+ ", prenom_developpeur=" + prenom_developpeur + ", langage=" + langage + ", societe=" + societe + "]";
}



}
