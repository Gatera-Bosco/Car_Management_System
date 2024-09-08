
package Dao;
import Model.Cars;
import java.util.List;
import org.hibernate.*;


public class Carsdao {
  public String registercar(Cars car){
      Session ss = HibernateUtil.getSessionFactory().openSession();
       Transaction tr = ss.beginTransaction();
       
      ss.save(car);
      tr.commit();
      ss.close();
      return "Data saved Successful";
  }  
   public String Updatecar(Cars car){
      Session ss = HibernateUtil.getSessionFactory().openSession();
       Transaction tr = ss.beginTransaction();
      ss.update(car);
      tr.commit();
      ss.close();
      return "Data update Successful";
   }
   public String deletecar(Cars car){
      Session ss = HibernateUtil.getSessionFactory().openSession();
       Transaction tr = ss.beginTransaction();
      ss.delete(car);
      tr.commit();
      ss.close();
      return "Data delete Successful";
   }
    public List<Cars> allcars(){
      Session ss = HibernateUtil.getSessionFactory().openSession();
      List<Cars> carsList = ss.createQuery(" from Cars").list();
      ss.close();
      return carsList;
}

}

