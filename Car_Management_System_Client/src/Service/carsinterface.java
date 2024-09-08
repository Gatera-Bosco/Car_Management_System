/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.rmi.Remote;
import java.util.List;
import Model.Cars;
import java.rmi.RemoteException;

/**
 *
 * @author Eng.Blaise
 */
public interface carsinterface extends Remote {
    public String registercar(Cars car) throws RemoteException;
    public String updatecar(Cars car) throws RemoteException;
    public String deletecar(Cars car) throws RemoteException;
    public List<Cars> allcars() throws RemoteException;
}
