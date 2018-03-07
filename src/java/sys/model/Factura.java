package sys.model;
// Generated 5/03/2018 03:34:31 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Factura generated by hbm2java
 */
public class Factura  implements java.io.Serializable {


     private Integer codFactura;
     private Cliente cliente;
     private Vendedor vendedor;
     private String numeroFactura;
     private long totalVenta;
     private Date fechaRegistro;
     private Set<Detallefactura> detallefacturas = new HashSet<Detallefactura>(0);

    public Factura() {
    }

	
    public Factura(Cliente cliente, Vendedor vendedor, String numeroFactura, long totalVenta, Date fechaRegistro) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.numeroFactura = numeroFactura;
        this.totalVenta = totalVenta;
        this.fechaRegistro = fechaRegistro;
    }
    public Factura(Cliente cliente, Vendedor vendedor, String numeroFactura, long totalVenta, Date fechaRegistro, Set<Detallefactura> detallefacturas) {
       this.cliente = cliente;
       this.vendedor = vendedor;
       this.numeroFactura = numeroFactura;
       this.totalVenta = totalVenta;
       this.fechaRegistro = fechaRegistro;
       this.detallefacturas = detallefacturas;
    }
   
    public Integer getCodFactura() {
        return this.codFactura;
    }
    
    public void setCodFactura(Integer codFactura) {
        this.codFactura = codFactura;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Vendedor getVendedor() {
        return this.vendedor;
    }
    
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    public String getNumeroFactura() {
        return this.numeroFactura;
    }
    
    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
    public long getTotalVenta() {
        return this.totalVenta;
    }
    
    public void setTotalVenta(long totalVenta) {
        this.totalVenta = totalVenta;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public Set<Detallefactura> getDetallefacturas() {
        return this.detallefacturas;
    }
    
    public void setDetallefacturas(Set<Detallefactura> detallefacturas) {
        this.detallefacturas = detallefacturas;
    }




}


