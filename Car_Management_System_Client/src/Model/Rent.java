/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Eng.Blaise
 */
public class Rent implements Serializable {
       private static final long serialVersionUID = 1L;
    private String Rent_id;
    private String Registration;
    private String Customer_name;
    private String Rent_date;
    private String Return_date;
    private String Fees;

    public Rent() {
    }

    public Rent(String Rent_id, String Registration, String Customer_name, String Rent_date, String Return_date, String Fees) {
        this.Rent_id = Rent_id;
        this.Registration = Registration;
        this.Customer_name = Customer_name;
        this.Rent_date = Rent_date;
        this.Return_date = Return_date;
        this.Fees = Fees;
    }

    public String getRent_id() {
        return Rent_id;
    }

    public void setRent_id(String Rent_id) {
        this.Rent_id = Rent_id;
    }

    public String getRegistration() {
        return Registration;
    }

    public void setRegistration(String Registration) {
        this.Registration = Registration;
    }

    public String getCustomer_name() {
        return Customer_name;
    }

    public void setCustomer_name(String Customer_name) {
        this.Customer_name = Customer_name;
    }

    public String getRent_date() {
        return Rent_date;
    }

    public void setRent_date(String Rent_date) {
        this.Rent_date = Rent_date;
    }

    public String getReturn_date() {
        return Return_date;
    }

    public void setReturn_date(String Return_date) {
        this.Return_date = Return_date;
    }

    public String getFees() {
        return Fees;
    }

    public void setFees(String Fees) {
        this.Fees = Fees;
    }

    @Override
    public String toString() {
        return "Rent{" + "Rent_id=" + Rent_id + ", Registration=" + Registration + ", Customer_name=" + Customer_name + ", Rent_date=" + Rent_date + ", Return_date=" + Return_date + ", Fees=" + Fees + '}';
    }

    public void getRent_date(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
