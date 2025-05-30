package RedApoyo;

public class Estudiante {
    private String nombreCompleto;
    private int cedula;
    private int generacion;
    private String carrera;
    private String correo;
    private String contraseña;
    private String necesidadEspecifica;

    public Estudiante(String nombreCompleto, int generacion) {
        this.nombreCompleto = this.nombreCompleto;
        this.generacion = this.generacion;
    }

    @Override
    public String toString() {
        return "Estudiante: " + nombreCompleto + ", generacion: " + generacion;
    }
}