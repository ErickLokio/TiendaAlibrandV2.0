package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import mapeo.Vendedor;

/**
 *
 * @author erick osoy
 */
public class Daovendedor extends DAO{
        public void insertar(Vendedor ven) throws SQLException{
        try {
            this.Conectar();
            String sql = "INSERT INTO vendedor(nombres, apellido,dui,celular,direccion) VALUES (?,?,?,?,?)";
            PreparedStatement ns = this.getCn().prepareStatement(sql);
            ns.setString(1, ven.getNombres());
            ns.setString(2, ven.getApellido());
            ns.setString(3, ven.getDui());
            ns.setString(4, ven.getCelular());
            ns.setString(5, ven.getDireccion());
            ns.executeUpdate();            
        } catch (SQLException e) {
            System.out.println("Error vendedorDao insertar: "+e);
        } finally {
            this.Cerrar();
        }
    }
        
        
      
    public List<Vendedor> listar() throws SQLException {
        List<Vendedor> lista = null;
        ResultSet rs;

        try {
            this.Conectar();
            String sql = "SELECT * FROM vendedor";
            PreparedStatement st = this.getCn().prepareCall(sql);
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                Vendedor exa = new Vendedor();
                exa.setCodVendedor(rs.getInt("codVendedor"));
                exa.setNombres(rs.getString("nombres"));
                exa.setApellido(rs.getString("apellido"));
                exa.setDui(rs.getString("dui"));
                exa.setCelular(rs.getString("celular"));
                exa.setDireccion(rs.getString("direccion"));
                lista.add(exa);
            }
        } catch (SQLException e) {
            System.out.println("Error al desplegar informacion en VendedorDao Listar" + e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }
    
    
    
      public Vendedor leerID(Vendedor exx) throws SQLException{
        Vendedor exaa = null;
        ResultSet nr;
        
        try {
            this.Conectar();
            String sql = "SELECT * FROM vendedor WHERE codVendedor = ?";
            PreparedStatement ns = this.getCn().prepareStatement(sql);
            ns.setInt(1, exx.getCodVendedor());
            nr = ns.executeQuery();
            
            while (nr.next()){
                exaa = new Vendedor();
                exaa.setCodVendedor(nr.getInt("codVendedor"));
                exaa.setNombres(nr.getString("nombres"));
                exaa.setApellido(nr.getString("apellido"));
                exaa.setDui(nr.getString("dui"));
                exaa.setCelular(nr.getString("celular"));
                exaa.setDireccion(nr.getString("direccion"));
            }
        } catch (SQLException e) {
            System.out.println("ERROR VendedorDao leerID: "+e);
        } finally {
            this.Cerrar();
        } return exaa;
    }
      
      
      
    
    public void modificar(Vendedor exam) throws SQLException {
        try {
            this.Conectar();
            String sql = "UPDATE vendedor SET nombres=?,apellido=?, dui=?, celular=?, direccion=? WHERE codVendedor=?";
            PreparedStatement ns = this.getCn().prepareStatement(sql);
            ns.setString(1, exam.getNombres());
            ns.setString(2, exam.getApellido());
            ns.setString(3, exam.getDui());
            ns.setString(4, exam.getCelular());
            ns.setString(5, exam.getDireccion());
            ns.setInt(6, exam.getCodVendedor());
            ns.executeUpdate(); 
        } catch (SQLException e) {
            System.out.println("Error VendedorDao modificar: "+e);
        } finally {
            this.Cerrar();
        }
    }
    
    public void eliminar (Vendedor eex) throws SQLException{
        try {
            this.Conectar();
            String sql = "DELETE FROM vendedor WHERE codVendedor = ?";
            PreparedStatement ns = this.getCn().prepareStatement(sql);
            ns.setInt(1, eex.getCodVendedor());
            ns.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error VendedorDao eliminar: "+e);
        } finally {
            this.Cerrar();
        }
    }
    
}
