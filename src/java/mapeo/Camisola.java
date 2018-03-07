package mapeo;


/**
 *
 * @author erick osoy
 */
public class Camisola {
    private int codProducto;
    private String nombreProducto;
    private int id_talla_camisola;
    private double precioVenta;
    private double precioCosto;
    private double margen_ganancia;
    private int stocMinimo;
    private int stocActual;
    private int codBarra;
    
    public void Camisola(){
        this.codProducto=0;
        this.nombreProducto="";
        this.id_talla_camisola=0;
        this.precioCosto=0;
        this.precioVenta=0;
        this.margen_ganancia=0;
        this.stocActual=0;
        this.stocMinimo=0;
        this.codBarra=0;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getId_talla_camisola() {
        return id_talla_camisola;
    }

    public void setId_talla_camisola(int id_talla_camisola) {
        this.id_talla_camisola = id_talla_camisola;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getMargen_ganancia() {
        return margen_ganancia;
    }

    public void setMargen_ganancia(double margen_ganancia) {
        this.margen_ganancia = margen_ganancia;
    }

    public int getStocMinimo() {
        return stocMinimo;
    }

    public void setStocMinimo(int stocMinimo) {
        this.stocMinimo = stocMinimo;
    }

    public int getStocActual() {
        return stocActual;
    }

    public void setStocActual(int stocActual) {
        this.stocActual = stocActual;
    }

    public int getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(int codBarra) {
        this.codBarra = codBarra;
    }
    
    
    
}
