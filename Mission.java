package com.ennassiry.controle;

public class Mission {
	
	private int nbJours ;
	Employe employe ;
	Projet maprojet;
	public Mission(int nbJours, Employe employe, Projet maprojet) {
		super();
		this.nbJours = nbJours;
		this.employe = employe;
		this.maprojet = maprojet;
	}
	
	public double calculerMontant() {
		return employe.calculerCout(nbJours);
	}
	
	public void afficherRecapitulatif() {
		System.out.println("Employe :"+employe.nom+" , matricule "+employe.getMatricule()+" , tarif Journalier "+ employe.tarifJournalier+", le superieur : "+employe.getSuperieur().nom+
				           "\nProjet : code "+maprojet.getIntitule()+" , intitule"+maprojet.getIntitule()+
				           "\n nobmre Jours :"+this.nbJours);
	}

	
}
