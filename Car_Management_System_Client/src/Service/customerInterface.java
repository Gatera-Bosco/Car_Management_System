/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import java.rmi.Remote;
import java.util.List;
import Model.Customer;
import java.rmi.RemoteException;


/**
 *
 * @author Eng.Blaise
 */
public interface customerInterface extends Remote {
     public String registercustomer(Customer cust) throws RemoteException;
     public String updatecustomer(Customer cust) throws RemoteException;
    public String deletecustomer(Customer cust) throws RemoteException;
     public List<Customer> allcustomers()  throws RemoteException;      
}
