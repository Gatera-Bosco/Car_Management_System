/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import Model.Returncar;
import java.util.List;
import org.hibernate.*;
/**
 *
 * @author Eng.Blaise
 */
public class Returncardao {
    
    public String registerreturn(Returncar retu){
      Session ss = HibernateUtil.getSessionFactory().openSession();
       Transaction tr = ss.beginTransaction();
      ss.save(retu);
      tr.commit();
      ss.close();
      return "Data saved Successful";
  }  
   public String updatereturn(Returncar retu){
      Session ss = HibernateUtil.getSessionFactory().openSession();
       Transaction tr = ss.beginTransaction();
      ss.update(retu);
      tr.commit();
      ss.close();
      return "Data update Successful";
  }  
    public String deletereturn(Returncar retu){
      Session ss = HibernateUtil.getSessionFactory().openSession();
       Transaction tr = ss.beginTransaction();
      ss.delete(retu);
      tr.commit();
      ss.close();
      return "Data delete Successful";
  } 
     public List<Returncar> allreturncar(){
      Session ss = HibernateUtil.getSessionFactory().openSession();
      List<Returncar> returncarsList = ss.createQuery(" from Returncar ").list();
      ss.close();
      return returncarsList;
    
}
    
}
