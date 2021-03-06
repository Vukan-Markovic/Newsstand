package com.mulesoft.training;

public class Proizvod implements java.io.Serializable, Comparable<Proizvod> {
	private static final long serialVersionUID = 5652428569906834393L;
	int proizvodID;
	double cena;
	String sifra;
	String naziv;
	int active;

	public Proizvod(int proizvodID, double cena, String sifra, String naziv, int active) {
		this.proizvodID = proizvodID;
		this.cena = cena;
		this.sifra = sifra;
		this.naziv = naziv;
		this.active = active;
	}

	public int getProizvodID() {
		return proizvodID;
	}

	public void setProizvodID(int proizvodID) {
		this.proizvodID = proizvodID;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int compareTo(Proizvod otherProizvod) {
		return Integer.compare(this.getProizvodID(), otherProizvod.getProizvodID());
	}
}