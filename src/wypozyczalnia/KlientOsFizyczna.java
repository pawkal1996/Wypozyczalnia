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
public class KlientOsFizyczna extends Klient {
    private String imieKlienta;
    private String nazwiskoKlienta;
    private Date dataUrKlienta;
    private String adresKlienta;
    private String telKlienta;
    
    //gettery
    public String getImieKlienta(){
        return imieKlienta;
    }
    public String getNazwiskoKlienta(){
        return nazwiskoKlienta;
    }
    public Date getDataUrKlienta(){
        return dataUrKlienta;
    }
    public String getAdresKlienta(){
        return adresKlienta;
    }
    public String getTelKlienta(){
        return telKlienta;
    }
    //settery
    public void setImieKlienta(String imieKlienta){
        this.imieKlienta=imieKlienta;
    }
    public void setNazwiskoKlienta(String nazwiskoKlienta){
        this.nazwiskoKlienta=nazwiskoKlienta;
    }
    public void setDataUrKlienta(Date dataUrKlienta){
        this.dataUrKlienta=dataUrKlienta;
    }
    public void setAdresKlienta(String adresKlienta){
        this.adresKlienta=adresKlienta;
    }
    public void setTelKlienta(String telKlienta){
        this.telKlienta=telKlienta;
    }
}
