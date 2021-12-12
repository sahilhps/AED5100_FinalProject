/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author Sahil Sonawane <your.name at your.org>
 */
public class Address {
     private String street;
    private int apt;
    private String city;
    private String state;
    private int zip;
    
    public Address(String s, int apt, String c, String st, int zip){
        this.street = s;
        this.apt = apt;
        this.city = c;
        this.state = st;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getapt() {
        return apt;
    }

    public void setapt(int apt) {
        this.apt = apt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String State) {
        this.state = State;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int Zip) {
        this.zip = Zip;
    }
    
    
    
}
