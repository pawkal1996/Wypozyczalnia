/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rezerwacje;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import datacheck.DataStore;
import osoby.Klient;
import pojazdy.Cennik;
import pojazdy.Motocykl;
import pojazdy.Pojazd;
import pojazdy.Rower;
import pojazdy.Samochod;
import pojazdy.SegmentSamochodu;
import pojazdy.TypMotocykla;
import pojazdy.TypRoweru;

/**
 *
 * @author Paweł K
 */
public class Rezerwacja {
	private int idRezerwacji;
	private LocalDate dataStartu;
	private LocalDate dataKonca;
	private Klient klient;
	private Pojazd pojazd;
	private int kosztRezerwacji;
	private StatusRezerwacji statusRezerwacji;

	static int licznikId=0;

	long dlugosc;
	public Rezerwacja(LocalDate dataStartu, LocalDate dataKonca, Klient klient,
			Pojazd pojazd, StatusRezerwacji statusRezerwacji){

		this.idRezerwacji=licznikId;
		this.dataStartu=dataStartu;
		this.dataKonca=dataKonca;
		this.klient=klient;
		this.pojazd=pojazd;
		this.statusRezerwacji=statusRezerwacji;
		this.dlugosc= ChronoUnit.DAYS.between(dataStartu,dataKonca);
		DataStore.storeRezerwacja(this);

	}

	public int obliczKosztRezerwacji() {
		int iloscDni = (int)ChronoUnit.DAYS.between(this.dataStartu,this.dataKonca);
		if(this.pojazd instanceof Samochod) {
			Samochod car=(Samochod)this.pojazd;
			SegmentSamochodu segmentTmp = car.getSegmentSamochodu();
			return iloscDni*Cennik.cenaSamochodu[segmentTmp.getValue()];
		}
		if(this.pojazd instanceof Motocykl) {
			Motocykl moto=(Motocykl)this.pojazd;
			TypMotocykla typTmp=moto.getTypMotocykla();
			return iloscDni*Cennik.cenaMotocykla[typTmp.getValue()];
		}
		if(this.pojazd instanceof Rower) {
			Rower rower=(Rower)this.pojazd;
			TypRoweru typTmp=rower.getTypRoweru();
			return iloscDni*Cennik.cenaRoweru[typTmp.getValue()];
		}
		return 0;

	}
	public boolean czyPojazdWolny(LocalDate dataStartu, LocalDate dataKonca) {

		//Od<=pojazd.getdataKonca()  && pojazd.getDataStartu()<=Do
		if((dataStartu.isBefore(this.getDataKonca())) &&(this.getDataStartu().isBefore(dataKonca))) {
			return false;
		}   				


		return true;
	}

	public static int zwiekszIdRezerwacji() {
		return ++licznikId;
	}

	public int getIdRezerwacji(){
		return idRezerwacji;
	}
	public LocalDate getDataStartu(){
		return dataStartu;
	}
	public LocalDate getDataKonca(){
		return dataKonca;
	}
	public Klient getKlient(){
		return klient;
	}
	public Pojazd getPojazd(){
		return pojazd;
	}
	public int getKosztRezerwacji(){
		return kosztRezerwacji;
	}
	public StatusRezerwacji getStatusRezerwacji(){
		return statusRezerwacji;        
	}
	public void setDataStartu(LocalDate dataStartu){
		this.dataStartu=dataStartu;
	}
	public void setDataKonca(LocalDate dataKonca){
		this.dataKonca=dataKonca;
	}
	public void setKlient(Klient klient){
		this.klient=klient;
	}
	public void setPojazd(Pojazd pojazd){
		this.pojazd=pojazd;
	}
	public void setKosztRezerwacji(int kosztRezerwacji){
		this.kosztRezerwacji=kosztRezerwacji;
	}
	public void setStatusRezerwacji(StatusRezerwacji statusRezerwacji){
		this.statusRezerwacji=statusRezerwacji;
	}

}
