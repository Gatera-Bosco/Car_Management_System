/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Eng.Blaise
 */
public class Customer implements Serializable{
       private static final long serialVersionUID = 1L;
    
    
    private String customer_id;
    private String customer_name;
    private String address;
    private String phone_number;
    @OneToMany
    private Rent rent;
    public Customer() {
    }

    public Customer(String customer_id, String customer_name, String address, String phone_number) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.address = address;
        this.phone_number = phone_number;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "customer{" + "customer_id=" + customer_id + ", customer_name=" + customer_name + ", address=" + address + ", phone_number=" + phone_number + '}';
    }
    
}
