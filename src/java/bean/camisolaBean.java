package bean;

import dao.camisolaDao;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import mapeo.Camisola;

/**
 *
 * @author erick osoy
 */

@ManagedBean
@ViewScoped
public class camisolaBean {
    private Camisola camisola = new Camisola();
    private List<Camisola> lstCamisola = new ArrayList<>();

    public Camisola getCamisola() {
        return camisola;
    }

    public void setCamisola(Camisola camisola) {
        this.camisola = camisola;
    }

    public List<Camisola> getLstCamisola() {
        return lstCamisola;
    }

    public void setLstCamisola(List<Camisola> lstCamisola) {
        this.lstCamisola = lstCamisola;
    }
    
    
    public void insertar() throws Exception {
        System.out.println("ha ingresado a Examenes Bean");
        camisolaDao dao;
        try {
            dao = new camisolaDao();
            dao.insertar(camisola);
            this.listarCamisola();
            this.limpiar();
        } catch (Exception e) {
            System.out.println("ERROOOOOOOOOOOOOOOOOOOOOOOOOOR INSERTAR  CAMISOLA BEAN" + e);
        }
    }

    public void listarCamisola() throws Exception {
        System.out.println("ha ingresado a listar Examenes Bean");
        camisolaDao dao;

        try {
            dao = new camisolaDao();
            lstCamisola = dao.listar();

        } catch (Exception e) {
            System.out.println("error genero Camisola Bean" + e);
        }

    }

    public void modificar() {
        camisolaDao dao;

        try {
            dao = new camisolaDao();
            dao.modificar(camisola);
            this.listarCamisola();
        } catch (Exception e) {
            System.out.println("error Modificar camisola  Bean" + e);
        }
    }

    public void eliminar(Camisola ex) throws Exception {
        camisolaDao dao;

        try {
            dao = new camisolaDao();
            dao.eliminar(ex);
            this.listarCamisola();
        } catch (Exception e) {
            System.out.println("error bean camisola Examenes :" + e);
        }
    }

    public void leerID(Camisola cam) throws Exception {
        System.out.println("ha ingresado a buscar");
        camisolaDao dao;
        try {
            dao = new camisolaDao();
            dao.leerID(cam);
            this.listarCamisola();
        } catch (Exception e) {
            System.out.println("ERROOOOOOOOOOOOOOOOOOOOOOOOOOR LEER camisola BEAN" + e);
        }
    }

    public void limpiar() {
        camisola.setCodProducto(0);
        camisola.setNombreProducto("");
        camisola.setId_talla_camisola(0);
        camisola.setPrecioVenta(0);
        camisola.setPrecioCosto(0);
        camisola.setMargen_ganancia(0);
        camisola.setStocMinimo(0);
        camisola.setStocActual(0);
        camisola.setCodBarra(0);
    }
}
