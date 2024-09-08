/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Implementation;
import Dao.Customerdao;
import Model.Customer;
import Service.customerInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
/**
 *
 * @author  Eng.Blaise
 */
public class customerImpl extends UnicastRemoteObject implements customerInterface {

    public customerImpl() throws RemoteException{
        super();
    }
    
    public Customerdao dao = new Customerdao();
    @Override
    public String registercustomer(Customer cust) throws RemoteException {
        return dao.registercustomer(cust);
    }

    @Override
    public String updatecustomer(Customer cust) throws RemoteException {
        return dao.updatecustomer(cust);
    }

    @Override
    public String deletecustomer(Customer cust) throws RemoteException {
        return dao.deletecustomer(cust);
    }

    @Override
    public List<Customer> allcustomers() throws RemoteException {
        return dao.allcustomers();
    }
    
}
