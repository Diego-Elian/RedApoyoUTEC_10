package RedApoyo;

// Clase que representa a un estudiante
public class Estudiante {
    private String nombreCompleto;
    private int cedula;
    private int generacion;
    private String carrera;
    private String correo;
    private String contraseña;
    private String necesidadEspecifica;

    // Constructor que inicializa nombre y generación
    public Estudiante(String nombreCompleto, int generacion) {
        this.nombreCompleto = this.nombreCompleto;
        this.generacion = this.generacion;
    }

     // Representación en texto del objeto Estudiante
    @Override
    public String toString() {
        return "Estudiante: " + nombreCompleto + ", generacion: " + generacion;
    }
}
