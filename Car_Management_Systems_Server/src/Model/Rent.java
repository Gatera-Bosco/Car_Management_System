/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Eng.Blaise
 */
@Entity
public class Rent implements Serializable {
       private static final long serialVersionUID = 1L;
    @Id
    private String Rent_id;
    private String Registration;
    @OneToOne
    private Customer customer;
    @OneToOne
    private Cars car;
    private String Rent_date;
    private String Return_date;
    private String Fees;
    private boolean isCarbooked;

    public Rent() {
    }

    public Rent(String Rent_id, String Registration, Customer customer, Cars car, String Rent_date, String Return_date, String Fees) {
        this.Rent_id = Rent_id;
        this.Registration = Registration;
        this.customer = customer;
        this.car = car;
        this.Return_date = Return_date;
        this.Fees = Fees;
    }

   

    public void setIsCarbooked(boolean isCarbooked) {
        this.isCarbooked = isCarbooked;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Cars getCar() {
        return car;
    }

    public void setCar(Cars car) {
        this.car = car;
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
        return "Rent{" + "Rent_id=" + Rent_id + ", Registration=" + Registration + ", customer=" + customer + ", car=" + car + ", Rent_date=" + Rent_date + ", Return_date=" + Return_date + ", Fees=" + Fees + '}';
    }

}