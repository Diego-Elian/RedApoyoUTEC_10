
//Clase  Estudiantes , heredada de Usuarios
public class Estudiante extends Usuario {
    private int Cedula;
    String Carrera;
    String Generacion;
    String NecesidadEspecifica;

//Metodo que llama al constructor desde Usuario
    public Estudiante(String nombreCompleto, String correo, String contrasenia) {
        if (nombreCompleto == null) {
            throw new IllegalArgumentException("Error: Rol no válido.");
        }
        if (correo == null) {
            throw new IllegalArgumentException("Error: Rol no válido.");
        }
        if (contrasenia == null) {
            throw new IllegalArgumentException("Error: Rol no válido.");
        }
        super(nombreCompleto, correo, contrasenia);
    }

    //Metodo seters permite modificar valores
    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }
    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    public void setGeneracion(String Generacion) {
        this.Generacion = Generacion;
    }
    public void setNecesidadEspecifica(String NecesidadEspecifica) {
        this.NecesidadEspecifica = NecesidadEspecifica;
    }

    // Metodos getters permiten obtener los valores
    public int getCedula() {
        return Cedula;
    }
    public String getCarrera() {
        return Carrera;
    }
    public String getGeneracion() {
        return Generacion;
    }
    public String getNecesidadEspecifica() {
        return NecesidadEspecifica;
}

// Método que devuelve una cadena de texto con los datos del estudiante
@Override
    public String toString() {
        return "Nombre :" + getNombreCompleto() + ", Correo: " + getCorreo() + ", Carrera: " + getCarrera() + ", Generacion: " + getGeneracion() + ", Necesidad Especifica: " + NecesidadEspecifica;
}
}