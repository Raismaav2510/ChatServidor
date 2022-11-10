import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ImplementacionServidor extends UnicastRemoteObject implements InterfaceServidor {
    public ArrayList<InterfaceCliente> clientes;

    public ImplementacionServidor () throws RemoteException {
        clientes = new ArrayList<InterfaceCliente>();
    }

    public void mensaje(String mensaje) throws RemoteException {
        int a = 0;
        while (a < clientes.size()) {
            clientes.get(a++).mensajeCliente(mensaje);
        }
    }

    public void registro(InterfaceCliente cliente) throws RemoteException {
        this.clientes.add(cliente);
    }
}
