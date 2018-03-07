package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import mapeo.Cliente;

/**
 *
 * @author erick osoy
 */
public class clienteDao extends DAO{
    
    public void insertar(Cliente cl) throws SQLException{
        try {
            this.Conectar();
            String sql = "INSERT INTO cliente(nombres, apellidos,direccion,no_rut,email,telefono_claro,telefono_movistar) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ns = this.getCn().prepareStatement(sql);
            ns.setString(1, cl.getNombres());
            ns.setString(2, cl.getApellidos());
            ns.setString(3, cl.getDireccion());
            ns.setString(4, cl.getNo_rut());
            ns.setString(5, cl.getEmail());
            ns.setInt(6, cl.getTelefono_claro());
            ns.setInt(7, cl.getTelefono_movistar());
            ns.executeUpdate();            
        } catch (SQLException e) {
            System.out.println("Error clienteDao insertar: "+e);
        } finally {
            this.Cerrar();
        }
    }
      
    public List<Cliente> listar() throws SQLException {
        List<Cliente> lista = null;
        ResultSet rs;

        try {
            this.Conectar();
            String sql = "SELECT * FROM cliente";
            PreparedStatement st = this.getCn().prepareCall(sql);
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                Cliente exa = new Cliente();
                exa.setCodCliente(rs.getInt("codCliente"));
                exa.setNombres(rs.getString("nombres"));
                exa.setApellidos(rs.getString("apellidos"));
                exa.setDireccion(rs.getString("direccion"));
                exa.setNo_rut(rs.getString("no_rut"));
                exa.setEmail(rs.getString("email"));
                exa.setTelefono_claro(rs.getInt("telefono_claro"));
                exa.setTelefono_movistar(rs.getInt("telefono_movistar"));
                lista.add(exa);
            }
        } catch (SQLException e) {
            System.out.println("Error al desplegar informacion en clienteDao Listar" + e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }
    
    
    
      public Cliente leerID(Cliente exx) throws SQLException{
        Cliente exaa = null;
        ResultSet nr;
        
        try {
            this.Conectar();
            String sql = "SELECT * FROM cliente WHERE codCliente = ?";
            PreparedStatement ns = this.getCn().prepareStatement(sql);
            ns.setInt(1, exx.getCodCliente());
            nr = ns.executeQuery();
            
            while (nr.next()){
                exaa = new Cliente();
                exaa.setCodCliente(nr.getInt("codCliente"));
                exaa.setNombres(nr.getString("nombres"));
                exaa.setApellidos(nr.getString("apellidos"));
                exaa.setDireccion(nr.getString("direccion"));
                exaa.setNo_rut(nr.getString("no_rut"));
                exaa.setEmail(nr.getString("email"));
                exaa.setTelefono_claro(nr.getInt("telefono_claro"));
                exaa.setTelefono_movistar(nr.getInt("telefono_movistar"));
            }
        } catch (SQLException e) {
            System.out.println("ERROR clienteDao leerID: "+e);
        } finally {
            this.Cerrar();
        } return exaa;
    }
      
      
      
    
    public void modificar(Cliente exam) throws SQLException {
        try {
            this.Conectar();
            String sql = "UPDATE cliente SET nombres=?,apellidos=?,direccion=?,no_rut=?,emial=?,telefono_claro=?,telefono_movistar=? WHERE codCliente=?";
            PreparedStatement ns = this.getCn().prepareStatement(sql);
            ns.setString(1, exam.getNombres());
            ns.setString(2, exam.getApellidos());
            ns.setString(3, exam.getDireccion());
            ns.setString(4, exam.getNo_rut());
            ns.setString(5, exam.getEmail());
            ns.setInt(6, exam.getTelefono_claro());
            ns.setInt(7, exam.getTelefono_movistar());
            ns.setInt(8, exam.getCodCliente());
            ns.executeUpdate(); 
        } catch (SQLException e) {
            System.out.println("Error clienteDao modificar: "+e);
        } finally {
            this.Cerrar();
        }
    }
    
    public void eliminar (Cliente eex) throws SQLException{
        try {
            this.Conectar();
            String sql = "DELETE FROM cliente WHERE codCliente = ?";
            PreparedStatement ns = this.getCn().prepareStatement(sql);
            ns.setInt(1, eex.getCodCliente());
            ns.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error clienteDao eliminar: "+e);
        } finally {
            this.Cerrar();
        }
    }
}
