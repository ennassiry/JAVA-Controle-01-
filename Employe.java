package com.ennassiry.controle;

import java.lang.reflect.Array;

public abstract class Employe {

	protected String matricule;
	protected String nom;
	protected double tarifJournalier;
	private  Employe  superieur ;

	public Employe(String matricule, String nom, double tarifJournalier) {
		this.matricule = matricule;
		this.nom = nom;
		this.tarifJournalier = tarifJournalier;
		this.superieur = this;
	}

	public String getMatricule() {
		return matricule;
	}

	public abstract double calculerCout(int nbJours);

	public void afficherDetails() {

		System.out.println(
				"Employe [matricule=" + matricule + ", nom=" + nom + ", tarifJournalier=" + tarifJournalier + "]");

	}

	public void setSuperieur(Employe superieur) {
		this.superieur = superieur;

	}


	public Employe getSuperieur() {

		return this.superieur;
	}

}
