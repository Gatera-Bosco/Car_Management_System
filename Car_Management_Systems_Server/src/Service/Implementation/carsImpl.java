/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Implementation;
import Dao.Carsdao;
import Model.Cars;
import Service.carsinterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
/**
 *
 * @author Eng.Blaise
 */
public class carsImpl  extends UnicastRemoteObject implements  carsinterface{

    public carsImpl() throws RemoteException{
        super();      }
    public Carsdao dao = new Carsdao();
    
    @Override
    public String registercar(Cars car) throws RemoteException {
        return dao.registercar(car);
                }

    @Override
    public String updatecar(Cars car) throws RemoteException {
       return dao.Updatecar(car);
    }

    @Override
    public String deletecar(Cars car) throws RemoteException {
       return dao.deletecar(car);
    }

    @Override
    public List<Cars> allcars() throws RemoteException {
     return dao.allcars();
    }
    
}
