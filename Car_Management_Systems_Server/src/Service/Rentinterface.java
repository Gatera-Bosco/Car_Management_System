/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import Model.Rent;
import java.rmi.Remote;
import java.util.List;
import java.rmi.RemoteException;

/**
 *
 * @author Eng.Blaise
 */
public interface Rentinterface extends Remote {
     public String registerrent(Rent ren) throws RemoteException;
     public String updaterent(Rent ren) throws RemoteException;
     public String deleterent(Rent ren) throws RemoteException;        
     public List<Rent> allrent() throws RemoteException;
}
