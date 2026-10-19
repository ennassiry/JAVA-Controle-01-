package com.ennassiry.controle;

public class Commercial extends Employe{
	private double tauxPrime ;

	public Commercial(String matricule, String nom, double tarifJournalier, double tauxPrime) {
		super(matricule, nom, tarifJournalier);
		this.tauxPrime = tauxPrime;
	}

	@Override
	public double calculerCout(int nbJours) {
	return this.tarifJournalier * nbJours * this.tauxPrime;
	}
	

}
