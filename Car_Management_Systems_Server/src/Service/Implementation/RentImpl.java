/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Implementation;
import Dao.Rentdao;
import Model.Rent;
import Service.Rentinterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Eng.Blaise
 */
public class RentImpl extends UnicastRemoteObject implements Rentinterface {

    public RentImpl() throws RemoteException{
        super();
    }
    public Rentdao dao = new Rentdao();
    
    @Override
    public String registerrent(Rent ren) throws RemoteException {
        return dao.registerrent(ren);
    }

    @Override
    public String updaterent(Rent ren) throws RemoteException {
        return dao.updaterent(ren);
    }

    @Override
    public String deleterent(Rent ren) throws RemoteException {
        return dao.deleterent(ren);
    }

    @Override
    public List<Rent> allrent() throws RemoteException {
      return dao.allrent();
    }
    
}
