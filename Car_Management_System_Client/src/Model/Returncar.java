/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Eng.Blaise
 */
public class Returncar  implements Serializable{
       private static final long serialVersionUID = 1L;
    private String rent_id;
    private String registration;
    private String returndate;
    private String delay;
    private String fine;

    public Returncar() {
    }

    public Returncar(String rent_id, String registration, String returndate, String delay, String fine) {
        this.rent_id = rent_id;
        this.registration = registration;
        this.returndate = returndate;
        this.delay = delay;
        this.fine = fine;
    }

    public String getRent_id() {
        return rent_id;
    }

    public void setRent_id(String rent_id) {
        this.rent_id = rent_id;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getReturndate() {
        return returndate;
    }

    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    public String getFine() {
        return fine;
    }

    public void setFine(String fine) {
        this.fine = fine;
    }

   
    
}
