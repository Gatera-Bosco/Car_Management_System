/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import Dao.Carsdao;
import Dao.Customerdao;
import Dao.Rentdao;
import Model.Cars;
import Model.Customer;
import Model.Rent;

/**
 *
 * @author frank
 */
public class Main {
    public static void main(String[] args) {
//         Customerdao customerdao = new Customerdao();
//
//        
//        Carsdao carsdao = new Carsdao();
       
       Rentdao rentdao = new Rentdao();
        Rent rent = new Rent();
        rent.setRent_id("001");
       rent.setFees("2000");
        rent.setRent_date("2020-23-2");
       // rent.setCar(carsdao.allcars().get(0));
    //   rent.setCustomer(customerdao.allcustomers().get(0));
        rentdao.registerrent(rent);
        
    }
}
