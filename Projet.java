package com.ennassiry.controle;

public class Projet {

	private String code;
	private String intitule;

	public Projet(String code, String intitule) {
		super();
		this.code = code;
		this.intitule = intitule;
	}

	public String getCode() {
		return code;
	}

	public String getIntitule() {
		return intitule;
	}

	@Override
	public String toString() {
		return "Projet [code=" + code + ", intitule=" + intitule + "]";
	}

}
