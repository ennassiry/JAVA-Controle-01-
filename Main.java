package com.ennassiry.controle;

public class Main {

	public static void main(String[] args) {

		Employe g1 = new Ingenieur("A999", "Mohammed", 500, 4);
		Employe g2 = new Ingenieur("A999", "Morad", 350, 2);
		Employe c1 = new Commercial("B77", "Hamza", 300, 0.10);
		Employe c2 = new Commercial("G77", "Kamal", 400, 0.15);
		Employe[] employes = { g1, g2, c1, c2 };

		Projet p1 = new Projet("989", "Projet1");
		Projet p2 = new Projet("779", "Projet2");

		g1.setSuperieur(g2);
		c2.setSuperieur(g1);

		c1.setSuperieur(c2);

		for (Employe e : employes) {
			if(e.getSuperieur() != null) {
			System.out.print("nom :" + e.nom + " leur supérieur est "+e.getSuperieur().nom);
			
			System.out.println();}
		}
		System.out.println("-----------------------------------");
		Mission m1 = new Mission(3, g1, p1);
		Mission m2 = new Mission(2, g2, p2);
		Mission m3 = new Mission(4, c1, p1);
		Mission m4 = new Mission(2, c2, p1);
		Mission[] missions = { m1, m2, m3, m4 };

		double somme = 0;
		for (Mission m : missions) {
			m.afficherRecapitulatif();
			somme += m.calculerMontant();
		}
		System.out.println("-----------------------------------");

		System.out.println("monatant total est " + somme);

		System.out.println("-----------------------------------");


	}
}
