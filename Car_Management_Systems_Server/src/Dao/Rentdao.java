/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import Model.Rent;

import java.util.List;
import org.hibernate.*;

/**
 *
 * @author Eng.Blaise
 */
public class Rentdao {
    public String registerrent(Rent ren){
      Session ss = HibernateUtil.getSessionFactory().openSession();
       Transaction tr = ss.beginTransaction();
       
      ss.save(ren);
      tr.commit();
      ss.close();
      return "Data saved Successful";
  }  
    public String updaterent(Rent ren){
      Session ss = HibernateUtil.getSessionFactory().openSession();
       Transaction tr = ss.beginTransaction();
      ss.update(ren);
      tr.commit();
      ss.close();
      return "Data update Successful";
    }
     public String deleterent(Rent ren){
      Session ss = HibernateUtil.getSessionFactory().openSession();
       Transaction tr = ss.beginTransaction();
      ss.delete(ren);
      tr.commit();
      ss.close();
      return "Data delete Successful";
     }
      public List<Rent> allrent(){
      Session ss = HibernateUtil.getSessionFactory().openSession();
      List<Rent> rentsList = ss.createQuery(" from Rent").list();
      ss.close();
      return rentsList;
}
     
}
