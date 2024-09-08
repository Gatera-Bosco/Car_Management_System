/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import java.rmi.Remote;
import java.util.List;
import Model.Returncar;
import java.rmi.RemoteException;

/**
 *
 * @author Eng.Blaise
 */
public interface Returncarinterface extends Remote{
    public String registerreturn(Returncar retu)  throws RemoteException;
    public String updatereturn(Returncar retu)  throws RemoteException;
    public String deletereturn(Returncar retu)  throws RemoteException;
    public List<Returncar> allreturncar()  throws RemoteException;
    
}
