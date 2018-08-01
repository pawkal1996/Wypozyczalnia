/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

import java.util.Date;

/**
 *
 * @author Paweł K
 */
public class Rezerwacja {
    private static int idRezerwacji;
    private Date dataStartu;
    private Date dataKonca;
    private Klient klient;
    private Pojazd pojazd;
    private int kosztRezerwacji;
    private StatusRezerwacji statusRezerwacji;
    
    static int licznikId=0;
    public Rezerwacja(int idRezerwacji, Date dataStartu, Date dataKonca, Klient klient,
                      Pojazd pojazd, int kosztRezerwacji, StatusRezerwacji statusRezerwacji){
        
        this.idRezerwacji=licznikId;
        ++licznikId;
        this.dataStartu=dataStartu;
        this.dataKonca=dataKonca;
        this.klient=klient;
        this.pojazd=pojazd;
        this.kosztRezerwacji=kosztRezerwacji;
        this.statusRezerwacji=statusRezerwacji;
    }
    
    public int getIdRezerwacji(){
        return idRezerwacji;
    }
    public Date getDataStartu(){
        return dataStartu;
    }
    public Date getDataKonca(){
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
    public void setDataStartu(Date dataStartu){
        this.dataStartu=dataStartu;
    }
    public void setDataKonca(Date dataKonca){
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
