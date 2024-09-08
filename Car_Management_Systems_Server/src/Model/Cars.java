/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;
/**
 *
 * @author Eng.Blaise
 */

@Entity
public class Cars implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    private String Registration_num;
    private String brand;
    private String model;
    private String status;
    private String price;
    @OneToOne(mappedBy = "car")
    private Rent rent;
    private boolean isCarbooked;

    public Cars() {
    }

    public Cars(String Registration_num, String brand, String model, String status, String price) {
        this.Registration_num = Registration_num;
        this.brand = brand;
        this.model = model;
        this.status = status;
        this.price = price;
        
    }

    
    public String getRegistration_num() {
        return Registration_num;
    }

    public void setRegistration_num(String Registration_num) {
        this.Registration_num = Registration_num;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return "Cars{" + "Registration_num=" + Registration_num + ", brand=" + brand + ", model=" + model + ", status=" + status + ", price=" + price + ", rent=" + rent + '}';
    }

    public void isIsCarbooked(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
