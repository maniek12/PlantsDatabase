package database;

import java.util.ArrayList;

import javafx.scene.image.*;

/**
 * Klasa ma za zadanie przechowywaæ wszystkie dane o pojedynczej roœlinie oraz
 * za³adowane zdjêcia.
 * 
 * @author Mariusz
 *
 */
public class Plant {

	private int id;
	private String kategoria, rzadLac, rzadPol, rodzinaLac, rodzinaPol,
			rodzajLac, rodzajPol, gatunekLac, gatunekPol, odmiana;
	private float wysokoscMin, wysokoscMax, szerokosc, rozstawaX, rozstawaY;
	private String pokroj, zimozielonosc, mrozoodpornosc, rodzajGleby,
			odczynGleby, stanowiskoSwiatlo, stanowiskoWiatr, wilgotnosc,
			liscie, barwaLisci, kwiaty, barwaKwiatow;
	private int poraKwitnienia;
	private String zapach, owoce, przebarwianie, formowanie, bukiety,
			rozmnazanie, walory, uwagi;

	private ArrayList<Image> images;

	public Plant() {

	}

	// ---GETTERS----------------------
	public int getId() {
		return id;
	}

	public String getKategoria() {
		return kategoria;
	}

	public String getRzadLac() {
		return rzadLac;
	}

	public String getRzadPol() {
		return rzadPol;
	}

	public String getRodzinaLac() {
		return rodzinaLac;
	}

	public String getRodzinaPol() {
		return rodzinaPol;
	}

	public String getRodzajLac() {
		return rodzajLac;
	}

	public String getRodzajPol() {
		return rodzajPol;
	}

	public String getGatunekLac() {
		return gatunekLac;
	}

	public String getGatunekPol() {
		return gatunekPol;
	}

	public String getOdmiana() {
		return odmiana;
	}

	public float getWysokoscMin() {
		return wysokoscMin;
	}

	public float getWysokoscMax() {
		return wysokoscMax;
	}

	public float getSzerokosc() {
		return szerokosc;
	}

	public float getRozstawaX() {
		return rozstawaX;
	}

	public float getRozstawaY() {
		return rozstawaY;
	}

	public String getPokroj() {
		return pokroj;
	}

	public String getZimozielonosc() {
		return zimozielonosc;
	}

	public String getMrozoodpornosc() {
		return mrozoodpornosc;
	}

	public String getRodzajGleby() {
		return rodzajGleby;
	}

	public String getOdczynGleby() {
		return odczynGleby;
	}

	public String getStanowiskoSwiatlo() {
		return stanowiskoSwiatlo;
	}

	public String getStanowiskoWiatr() {
		return stanowiskoWiatr;
	}

	public String getWilgotnosc() {
		return wilgotnosc;
	}

	public String getLiscie() {
		return liscie;
	}

	public String getBarwaLisci() {
		return barwaLisci;
	}

	public String getKwiaty() {
		return kwiaty;
	}

	public String getBarwaKwiatow() {
		return barwaKwiatow;
	}

	public int getPoraKwitnienia() {
		return poraKwitnienia;
	}

	public String getZapach() {
		return zapach;
	}

	public String getOwoce() {
		return owoce;
	}

	public String getPrzebarwianie() {
		return przebarwianie;
	}

	public String getFormowanie() {
		return formowanie;
	}

	public String getBukiety() {
		return bukiety;
	}

	public String getRozmnazanie() {
		return rozmnazanie;
	}

	public String getWalory() {
		return walory;
	}

	public String getUwagi() {
		return uwagi;
	}

	public ArrayList<Image> getImages() {
		return images;
	}

	// ---SETTERS----------------------
	public void setId(int id) {
		this.id = id;
	}

	public void setKategoria(String kategoria) {
		this.kategoria = kategoria;
	}

	public void setRzadLac(String rzadLac) {
		this.rzadLac = rzadLac;
	}

	public void setRzadPol(String rzadPol) {
		this.rzadPol = rzadPol;
	}

	public void setRodzinaLac(String rodzinaLac) {
		this.rodzinaLac = rodzinaLac;
	}

	public void setRodzinaPol(String rodzinaPol) {
		this.rodzinaPol = rodzinaPol;
	}

	public void setRodzajLac(String rodzajLac) {
		this.rodzajLac = rodzajLac;
	}

	public void setRodzajPol(String rodzajPol) {
		this.rodzajPol = rodzajPol;
	}

	public void setGatunekLac(String gatunekLac) {
		this.gatunekLac = gatunekLac;
	}

	public void setGatunekPol(String gatunekPol) {
		this.gatunekPol = gatunekPol;
	}

	public void setOdmiana(String odmiana) {
		this.odmiana = odmiana;
	}

	public void setWysokoscMin(float wysokoscMin) {
		this.wysokoscMin = wysokoscMin;
	}

	public void setWysokoscMax(float wysokoscMax) {
		this.wysokoscMax = wysokoscMax;
	}

	public void setSzerokosc(float szerokosc) {
		this.szerokosc = szerokosc;
	}

	public void setRozstawaX(float rozstawaX) {
		this.rozstawaX = rozstawaX;
	}

	public void setRozstawaY(float rozstawaY) {
		this.rozstawaY = rozstawaY;
	}

	public void setPokroj(String pokroj) {
		this.pokroj = pokroj;
	}

	public void setZimozielonosc(String zimozielonosc) {
		this.zimozielonosc = zimozielonosc;
	}

	public void setMrozoodpornosc(String mrozoodpornosc) {
		this.mrozoodpornosc = mrozoodpornosc;
	}

	public void setRodzajGleby(String rodzajGleby) {
		this.rodzajGleby = rodzajGleby;
	}

	public void setOdczynGleby(String odczynGleby) {
		this.odczynGleby = odczynGleby;
	}

	public void setStanowiskoSwiatlo(String stanowiskoSwiatlo) {
		this.stanowiskoSwiatlo = stanowiskoSwiatlo;
	}

	public void setStanowiskoWiatr(String stanowiskoWiatr) {
		this.stanowiskoWiatr = stanowiskoWiatr;
	}

	public void setWilgotnosc(String wilgotnosc) {
		this.wilgotnosc = wilgotnosc;
	}

	public void setLiscie(String liscie) {
		this.liscie = liscie;
	}

	public void setBarwaLisci(String barwaLisci) {
		this.barwaLisci = barwaLisci;
	}

	public void setKwiaty(String kwiaty) {
		this.kwiaty = kwiaty;
	}

	public void setBarwaKwiatow(String barwaKwiatow) {
		this.barwaKwiatow = barwaKwiatow;
	}

	public void setPoraKwitnienia(int poraKwitnienia) {
		this.poraKwitnienia = poraKwitnienia;
	}

	public void setZapach(String zapach) {
		this.zapach = zapach;
	}

	public void setOwoce(String owoce) {
		this.owoce = owoce;
	}

	public void setPrzebarwianie(String przebarwianie) {
		this.przebarwianie = przebarwianie;
	}

	public void setFormowanie(String formowanie) {
		this.formowanie = formowanie;
	}

	public void setBukiety(String bukiety) {
		this.bukiety = bukiety;
	}

	public void setRozmnazanie(String rozmnazanie) {
		this.rozmnazanie = rozmnazanie;
	}

	public void setWalory(String walory) {
		this.walory = walory;
	}

	public void setUwagi(String uwagi) {
		this.uwagi = uwagi;
	}

	public void setImages(ArrayList<Image> images) {
		this.images = images;
	}
	
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("nazwa: ");
		builder.append(gatunekPol);
		
		return builder.toString();
	}

}