package appLayer;

import java.util.ArrayList;

public class Clientes {

    public ArrayList<Cliente> clientes;

    public Clientes() {
        clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente){

        clientes.add(cliente);
    }

    public ArrayList<Cliente> obtenerClientes(){
        return clientes;
    }
}
