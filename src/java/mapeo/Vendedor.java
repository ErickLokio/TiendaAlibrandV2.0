package mapeo;

/**
 *
 * @author erick osoy
 */
public class Vendedor {
    private int codVendedor;
    private String nombres;
    private String apellido;
    private String dui;
    private String celular;
    private String direccion;
    
    public void Vendedor(){
        this.codVendedor=0;
        this.nombres="";
        this.apellido="";
        this.dui="";
        this.celular="";
        this.direccion="";
    }

    public int getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(int codVendedor) {
        this.codVendedor = codVendedor;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
