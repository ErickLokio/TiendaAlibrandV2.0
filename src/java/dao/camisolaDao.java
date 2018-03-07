package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import mapeo.Camisola;

/**
 *
 * @author erick osoy
 */
public class camisolaDao extends DAO {

    private String query;
    private PreparedStatement sta;
    private ResultSet res;

    public void insertar(Camisola cam) throws SQLException {
        try {
            this.Conectar();
            query = "insert into producto(nombreProducto, id_talla_camisola, precio_costo, precioVenta, margen_ganancia, stocMinimo, stocActual, codBarra) values(?,?,?,?,?,?,?,?)";
            sta = this.getCn().prepareStatement(query);
            sta.setString(1, cam.getNombreProducto());
            sta.setInt(2, cam.getId_talla_camisola());
            sta.setDouble(3, cam.getPrecioCosto());
            sta.setDouble(4, cam.getPrecioVenta());
            sta.setDouble(5, cam.getMargen_ganancia());
            sta.setInt(6, cam.getStocMinimo());
            sta.setInt(7, cam.getStocActual());
            sta.setInt(8, cam.getCodBarra());
            sta.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error CamisolaDao insertar: " + e);
        } finally {
            this.Cerrar();
        }
    }
    
    public List<Camisola> listar() throws SQLException {
        List<Camisola> lstCamisola = null;
        try {
            this.Conectar();
            query = "SELECT * FROM producto";
            sta = this.getCn().prepareStatement(query);
            res = sta.executeQuery();
            lstCamisola = new ArrayList<>();

            while (res.next()) {
                Camisola cam = new Camisola();
                cam.setCodProducto(res.getInt("codProducto"));
                cam.setNombreProducto(res.getString("nombreProducto"));
                cam.setId_talla_camisola(res.getInt("id_talla_camisola"));
                cam.setPrecioVenta(res.getDouble("precioVenta"));
                cam.setPrecioCosto(res.getDouble("precio_costo"));
                cam.setMargen_ganancia(res.getDouble("margen_ganancia"));
                cam.setStocMinimo(res.getInt("stocMinimo"));
                cam.setStocActual(res.getInt("stocActual"));
                cam.setCodBarra(res.getInt("codBarra"));
                lstCamisola.add(cam);
            }
        } catch (Exception ex) {
            System.out.println("ERROR LISTAR CAMISOLA" +ex);
        } finally {
            this.Cerrar();
        }
        return lstCamisola;
    }

   
    public Camisola leerID(Camisola exx) throws SQLException {
        Camisola exaa = null;
        ResultSet nr;

        try {
            this.Conectar();
            String sql = "SELECT * FROM producto WHERE codProducto = ?";
            PreparedStatement ns = this.getCn().prepareStatement(sql);
            ns.setInt(1, exx.getCodProducto());
            nr = ns.executeQuery();

            while (nr.next()) {
                exaa = new Camisola();
                exaa.setCodProducto(res.getInt("codProducto"));
                exaa.setNombreProducto(res.getString("nombreProducto"));
                exaa.setId_talla_camisola(res.getInt("id_talla_camisola"));
                exaa.setPrecioVenta(res.getDouble("precioVenta"));
                exaa.setPrecioCosto(res.getDouble("precio_costo"));
                exaa.setMargen_ganancia(res.getDouble("margen_ganancia"));
                exaa.setStocMinimo(res.getInt("stocMinimo"));
                exaa.setStocActual(res.getInt("stocActual"));
                exaa.setCodBarra(res.getInt("codBarra"));
            }
        } catch (SQLException e) {
            System.out.println("ERROR CAMISOLA-DAO leerID: " + e);
        } finally {
            this.Cerrar();
        }
        return exaa;
    }
    
    
    
    public void modificar(Camisola cam) throws SQLException {
        try {
            this.Conectar();
            String sql = "UPDATE producto SET nombreProducto=?, id_talla_Camisola=?, precioVenta=?, precioCosto=?, "
                    + " margen_ganancia=?, stocMinimo=?, stocActual=? WHERE codProducto=?";
            PreparedStatement ns = this.getCn().prepareStatement(sql);
            ns.setString(1, cam.getNombreProducto());
            ns.setInt(2, cam.getId_talla_camisola());
            ns.setDouble(3, cam.getPrecioVenta());
            ns.setDouble(4, cam.getPrecioCosto());
            ns.setDouble(5, cam.getMargen_ganancia());
            ns.setInt(5, cam.getStocMinimo());
            ns.setInt(6, cam.getStocActual());
            ns.setInt(7, cam.getCodProducto());
            ns.executeUpdate(); 
        } catch (SQLException e) {
            System.out.println("Error CAMISOLA modificar: "+e);
        } finally {
            this.Cerrar();
        }
    }
    
    public void eliminar (Camisola cam) throws SQLException{
        try {
            this.Conectar();
            String sql = "DELETE FROM producto WHERE codProducto = ?";
            PreparedStatement ns = this.getCn().prepareStatement(sql);
            ns.setInt(1, cam.getCodProducto());
            ns.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error ExamenDao eliminar: "+e);
        } finally {
            this.Cerrar();
        }
    }

   

    
}
