package bean;

import dao.Daovendedor;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import mapeo.Vendedor;

/**
 *
 * @author erick osoy
 */

@ManagedBean
@ViewScoped

public class BeanVendedor {
    public Vendedor ingreso = new Vendedor();
    private List<Vendedor> lstVendedor = new ArrayList();

    public Vendedor getIngreso() {
        return ingreso;
    }

    public void setIngreso(Vendedor ingreso) {
        this.ingreso = ingreso;
    }

    public List<Vendedor> getLstVendedor() {
        return lstVendedor;
    }

    public void setLstVendedor(List<Vendedor> lstVendedor) {
        this.lstVendedor = lstVendedor;
    }
    
    
    public void insertar() {
        Daovendedor dao;
        try {
            dao = new Daovendedor();
            dao.insertar(ingreso);
            this.listarVendedor();
            this.limpiar();
        } catch (Exception e) {
            System.out.println("ERROOOOOOOOOOOOOOOOOOOOOOOOOOR INSERTAR  vendedor BEAN" + e);
        }
    }
    
    public void listarVendedor() {
        Daovendedor dao;

        try {
            dao = new Daovendedor();
            lstVendedor = dao.listar();

        } catch (Exception e) {
            System.out.println("error listar vendedor Bean" + e);
        }
    }
    
    
    public void modificar() {
        Daovendedor dao;

        try {
            dao = new Daovendedor();
            dao.modificar(ingreso);
            this.listarVendedor();
        } catch (Exception e) {
            System.out.println("error Modificar vendedor  Bean" + e);
        }
    }
    
    public void eliminar(Vendedor ven) throws Exception {
        Daovendedor dao;

        try {
            dao = new Daovendedor();
            dao.eliminar(ven);
            this.listarVendedor();
        } catch (Exception e) {
            System.out.println("error bean eliminar vendedor:" + e);
        }
    }
    
    
    
    public void leerID(Vendedor ven) throws Exception {
        Daovendedor dao;
        Vendedor temp;
        try {
            dao = new Daovendedor();
            temp = dao.leerID(ven);

            if (temp != null) {
                this.ingreso = temp;
            }

        } catch (Exception e) {
            System.out.println("ERROOOOOOOOOOOOOOOOOOOOOOOOOOR LEER vendedor BEAN" + e);
        }   
    }
    
    public void limpiar() {
        ingreso.setCodVendedor(0);
        ingreso.setNombres("");
        ingreso.setApellido("");
        ingreso.setDui("");
        ingreso.setCelular("");
        ingreso.setDireccion("");
    }
}
