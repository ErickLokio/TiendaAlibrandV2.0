package sys.model;
// Generated 5/03/2018 03:34:31 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Vendedor generated by hbm2java
 */
public class Vendedor  implements java.io.Serializable {


     private Integer codVendedor;
     private String nombres;
     private String apellido;
     private String dui;
     private String celular;
     private String direccion;
     private Set<Sucursal> sucursals = new HashSet<Sucursal>(0);
     private Set<Factura> facturas = new HashSet<Factura>(0);
     private Set<Cotizacion> cotizacionsForIdEmpleado = new HashSet<Cotizacion>(0);
     private Set<Cotizacion> cotizacionsForIdCliente = new HashSet<Cotizacion>(0);
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);

    public Vendedor() {
    }

	
    public Vendedor(String nombres, String apellido, String dui, String celular, String direccion) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.dui = dui;
        this.celular = celular;
        this.direccion = direccion;
    }
    public Vendedor(String nombres, String apellido, String dui, String celular, String direccion, Set<Sucursal> sucursals, Set<Factura> facturas, Set<Cotizacion> cotizacionsForIdEmpleado, Set<Cotizacion> cotizacionsForIdCliente, Set<Usuario> usuarios) {
       this.nombres = nombres;
       this.apellido = apellido;
       this.dui = dui;
       this.celular = celular;
       this.direccion = direccion;
       this.sucursals = sucursals;
       this.facturas = facturas;
       this.cotizacionsForIdEmpleado = cotizacionsForIdEmpleado;
       this.cotizacionsForIdCliente = cotizacionsForIdCliente;
       this.usuarios = usuarios;
    }
   
    public Integer getCodVendedor() {
        return this.codVendedor;
    }
    
    public void setCodVendedor(Integer codVendedor) {
        this.codVendedor = codVendedor;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDui() {
        return this.dui;
    }
    
    public void setDui(String dui) {
        this.dui = dui;
    }
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Set<Sucursal> getSucursals() {
        return this.sucursals;
    }
    
    public void setSucursals(Set<Sucursal> sucursals) {
        this.sucursals = sucursals;
    }
    public Set<Factura> getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set<Factura> facturas) {
        this.facturas = facturas;
    }
    public Set<Cotizacion> getCotizacionsForIdEmpleado() {
        return this.cotizacionsForIdEmpleado;
    }
    
    public void setCotizacionsForIdEmpleado(Set<Cotizacion> cotizacionsForIdEmpleado) {
        this.cotizacionsForIdEmpleado = cotizacionsForIdEmpleado;
    }
    public Set<Cotizacion> getCotizacionsForIdCliente() {
        return this.cotizacionsForIdCliente;
    }
    
    public void setCotizacionsForIdCliente(Set<Cotizacion> cotizacionsForIdCliente) {
        this.cotizacionsForIdCliente = cotizacionsForIdCliente;
    }
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }




}


