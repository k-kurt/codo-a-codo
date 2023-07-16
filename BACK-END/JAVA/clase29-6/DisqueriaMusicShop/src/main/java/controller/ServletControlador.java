
package controller;



import data.DiscosDAO;
import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Discos;


@WebServlet("/servletControlador")
public class ServletControlador extends HttpServlet{
    
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String accion = req.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "editar":
                    editarDisco(req, res);
                    break;
                case "eliminar":
                    eliminar(req, res);
                    break;
                default:
                    accionDefault(req, res);
                    break;
            }
        } else {
            accionDefault(req, res);
        }
    }
    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String accion = req.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "insertar":
                    insertarDisco(req, res);
                    break;
                case "modificar":
                    modificarDisco(req, res);
                    break;
                default:
                    accionDefault(req, res);
                    break;
            }
        } else {
            accionDefault(req, res);
        }
    }

    private void accionDefault(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List<Discos> discos = new DiscosDAO().seleccionar();
        discos.forEach(System.out::println);

        HttpSession sesion = req.getSession();

        sesion.setAttribute("discos", discos);
        sesion.setAttribute("cantidadDiscos", discos.size());
        sesion.setAttribute("precioTotal", calcularPrecio(discos));

        System.out.println(sesion);

        res.sendRedirect("discos.jsp");

    }

    private void insertarDisco(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        String autor = req.getParameter("autor");
        int cantCanciones = Integer.parseInt(req.getParameter("cantCanciones"));
        double precio = Double.parseDouble(req.getParameter("precio"));
        int copias = Integer.parseInt(req.getParameter("copias"));

        Discos discoNuevo = new Discos(nombre, autor, cantCanciones, precio, copias);

        int registrosMod = new DiscosDAO().insertar(discoNuevo);

        System.out.println("Registros agregados: " + registrosMod);

        accionDefault(req, res);

    }

    private void editarDisco(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        Discos disco = new DiscosDAO().seleccionarPorId(id);

        req.setAttribute("disco", disco);

        req.getRequestDispatcher("/WEB-INF/paginas/operaciones/editarDisco.jsp").forward(req, res);
    }
    
    private void modificarDisco(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        int id = Integer.parseInt(req.getParameter("id"));
        String nombre = req.getParameter("nombre");
        String autor = req.getParameter("autor");
        int cantCanciones = Integer.parseInt(req.getParameter("cantCanciones"));
        double precio = Double.parseDouble(req.getParameter("precio"));
        int copias = Integer.parseInt(req.getParameter("copias"));
        
        Discos discoMod = new Discos(id,nombre,autor,cantCanciones,precio,copias);
        
        int registrosMod = new DiscosDAO().actualizar(discoMod);
        
        System.out.println("Registros modificados: "+ registrosMod );
        
        accionDefault(req, res);
    }
    
    private void eliminar(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        int id = Integer.parseInt(req.getParameter("id"));
        
        int regBorrados = new DiscosDAO().eliminar(id);
        
        System.out.println("Registros eliminados: "+ regBorrados);
        
        accionDefault(req, res);
    }

    private double calcularPrecio(List<Discos> discos) {
        double precioTotal = 0;

        for (Discos dis : discos) {
            precioTotal += dis.getPrecio();
        }
        return precioTotal;
    }
    
}
