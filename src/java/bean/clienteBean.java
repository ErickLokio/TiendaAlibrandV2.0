package bean;

import dao.clienteDao;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import mapeo.Cliente;

/**
 *
 * @author erick osoy
 */
@ManagedBean
@ViewScoped
public class clienteBean {

    private Cliente ingreso = new Cliente();
    private List<Cliente> lstCliente = new ArrayList();

    public Cliente getIngreso() {
        return ingreso;
    }

    public void setIngreso(Cliente ingreso) {
        this.ingreso = ingreso;
    }

    public List<Cliente> getLstCliente() {
        return lstCliente;
    }

    public void setLstCliente(List<Cliente> lstCliente) {
        this.lstCliente = lstCliente;
    }

    public void insertar() {
        System.out.println("ha ingresado a Examenes Bean");
        clienteDao dao;
        try {
            dao = new clienteDao();
            dao.insertar(ingreso);
            this.listarCliente();
            this.limpiar();
        } catch (Exception e) {
            System.out.println("ERROOOOOOOOOOOOOOOOOOOOOOOOOOR INSERTAR  cliente BEAN" + e);
        }
    }

    public void listarCliente() {
        System.out.println("ha ingresado a listar cliente Bean");
        clienteDao dao;

        try {
            dao = new clienteDao();
            lstCliente = dao.listar();

        } catch (Exception e) {
            System.out.println("error listar cliente Bean" + e);
        }
    }
    
    
    public void modificar() {
        clienteDao dao;

        try {
            dao = new clienteDao();
            dao.modificar(ingreso);
            this.listarCliente();
        } catch (Exception e) {
            System.out.println("error Modificar cliente  Bean" + e);
        }
    }
    
    public void eliminar(Cliente cl) throws Exception {
        clienteDao dao;

        try {
            dao = new clienteDao();
            dao.eliminar(cl);
            this.listarCliente();
        } catch (Exception e) {
            System.out.println("error bean eliminar cliente:" + e);
        }
    }
    
    
    
    public void leerID(Cliente cl) throws Exception {
        System.out.println("ha ingresado a insertar");
        clienteDao dao;
        Cliente temp;
        try {
            dao = new clienteDao();
            temp = dao.leerID(cl);

            if (temp != null) {
                this.ingreso = temp;
            }

        } catch (Exception e) {
            System.out.println("ERROOOOOOOOOOOOOOOOOOOOOOOOOOR LEER cliente BEAN" + e);
        }   
    }
    
    public void limpiar() {
        ingreso.setCodCliente(0);
        ingreso.setNombres("");
        ingreso.setApellidos("");
        ingreso.setDireccion("");
        ingreso.setNo_rut("");
        ingreso.setEmail("");
        ingreso.setTelefono_claro(0);
        ingreso.setTelefono_movistar(0);
    }
}
