/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Customer;
import java.util.List;
import org.hibernate.*;

/**
 *
 * @author Eng.Blaise
 */
public class Customerdao {
     public String registercustomer(Customer cust){
      Session ss = HibernateUtil.getSessionFactory().openSession();
       Transaction tr = ss.beginTransaction();
      ss.save(cust);
      tr.commit();
      ss.close();
      return "Data saved Successful";
     }
     public String updatecustomer(Customer cust){
      Session ss = HibernateUtil.getSessionFactory().openSession();
       Transaction tr = ss.beginTransaction();
      ss.update(cust);
      tr.commit();
      ss.close();
      return "Data update Successful";
     }
     public String deletecustomer(Customer cust){
      Session ss = HibernateUtil.getSessionFactory().openSession();
       Transaction tr = ss.beginTransaction();
      ss.delete(cust);
      tr.commit();
      ss.close();
      return "Data delete Successful";
     }
     public List<Customer> allcustomers(){
      Session ss = HibernateUtil.getSessionFactory().openSession();
      List<Customer> customerList = ss.createQuery(" from Customer").list();
      ss.close();
      return customerList;
}
}
