
package Controller;

import Service.Implementation.RentImpl;
import Service.Implementation.ReturncarImpl;
import Service.Implementation.carsImpl;
import Service.Implementation.customerImpl;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Eng.Blaise
 */
public class Server{
    
   
    public static void main(String[] args){
   
        try {
        System.setProperty("java.rmi.server.hostname","127.0.0.1");
        Registry registry = LocateRegistry.createRegistry(5000);
        registry.rebind("car", new carsImpl());
        registry.rebind("cust", new customerImpl());
        registry.rebind("rent", new RentImpl());
        registry.rebind("returncar", new ReturncarImpl());
        System.out.println("server is running on port 5000");
    }catch(Exception ex){
       ex.printStackTrace();
    }
    }}
