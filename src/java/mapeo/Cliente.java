package mapeo;

/**
 *
 * @author erick osoy
 */
public class Cliente {
    private int codCliente;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String no_rut;
    private String email;
    private int telefono_claro;
    private int telefono_movistar;
    
    public void Cliente(){
        this.codCliente=0;
        this.nombres="";
        this.apellidos="";
        this.direccion="";
        this.no_rut="";
        this.email="";
        this.telefono_claro=0;
        this.telefono_movistar=0;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNo_rut() {
        return no_rut;
    }

    public void setNo_rut(String no_rut) {
        this.no_rut = no_rut;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono_claro() {
        return telefono_claro;
    }

    public void setTelefono_claro(int telefono_claro) {
        this.telefono_claro = telefono_claro;
    }

    public int getTelefono_movistar() {
        return telefono_movistar;
    }

    public void setTelefono_movistar(int telefono_movistar) {
        this.telefono_movistar = telefono_movistar;
    }
}
