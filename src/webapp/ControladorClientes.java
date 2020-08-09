package webapp;

import appLayer.Cliente;
import appLayer.Clientes;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@MultipartConfig
@WebServlet(name = "clientes")
public class ControladorClientes extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Clientes clientes = (Clientes) request.getSession().getAttribute("clientes");
        if(clientes == null){
            clientes = new Clientes();
        }

        String nombreDelPerro = request.getParameter("nombreDelPerro");
        String cedula = request.getParameter("cedula");
        String fechaDeUltimoCorte = request.getParameter("fechaDeUltimoCorte");

        Cliente cliente = new Cliente(nombreDelPerro, cedula, false, fechaDeUltimoCorte);
        clientes.agregarCliente(cliente);
        request.getSession().setAttribute("clientes", clientes);

        request.getSession().setAttribute("msgDeError", "El cliente se agrego exitosamente");
        request.getRequestDispatcher("/registrar.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Clientes clientes = (Clientes) request.getSession().getAttribute("clientes");
        if(clientes == null){
            clientes = new Clientes();
        }
        request.getSession().setAttribute("clientes", clientes);
        request.getRequestDispatcher("/clientes.jsp").forward(request, response);

    }
}