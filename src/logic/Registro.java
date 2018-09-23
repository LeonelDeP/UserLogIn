package logic;

public class Registro {
    String usuario;
    String equipo;
    String accion;
    String fecha;
    
    public Registro(String usuario, String equipo, String accion, String fecha){
        this.usuario = usuario;
        this.equipo = equipo;
        this.accion = accion;
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
