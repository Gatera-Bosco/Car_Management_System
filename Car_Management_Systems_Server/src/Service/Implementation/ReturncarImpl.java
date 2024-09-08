/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Implementation;
import Dao.Returncardao;
import Model.Returncar;
import Service.Returncarinterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Eng.Blaise
 */
public class ReturncarImpl extends UnicastRemoteObject implements Returncarinterface {
 
    public ReturncarImpl() throws RemoteException{
        super();
    }
    public Returncardao dao = new Returncardao();
    
    @Override
    public String registerreturn(Returncar retu) throws RemoteException {
       return dao.registerreturn(retu);
    }

    @Override
    public String updatereturn(Returncar retu) throws RemoteException {
        return dao.updatereturn(retu);
    }

    @Override
    public String deletereturn(Returncar retu) throws RemoteException {
        return dao.deletereturn(retu);
    }

    @Override
    public List<Returncar> allreturncar() throws RemoteException {
      return dao.allreturncar();
    }
    
}
