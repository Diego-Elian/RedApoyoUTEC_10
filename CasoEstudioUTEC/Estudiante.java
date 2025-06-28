//Clase  Estudiante , heredada de Usuarios
public class Estudiante extends Usuario {
    private int Cedula;
    private String Carrera;
    private String Generacion;
    private String NecesidadEspecifica;

    //Metodo que llama al constructor desde Usuario
    public Estudiante(String NombreCompleto, String Correo, String Contrasenia, String Carrera, String Generacion, String NecesidadEspecifica) {
        super(NombreCompleto, Correo, Contrasenia);
        this.Carrera = Carrera;
        this.Generacion = Generacion;
        this.NecesidadEspecifica = NecesidadEspecifica;
        
        if (NombreCompleto == null) {
            throw new IllegalArgumentException("Error: Entrada no válida.");
        }
        if (Correo == null) {
            throw new IllegalArgumentException("Error: Entrada no válida.");
        }
        if (Contrasenia == null) {
            throw new IllegalArgumentException("Error: Entrada no válida.");
        }
       if (Carrera == null) {
            throw new IllegalArgumentException("Error: Entrada no válida.");
        }
        if (Generacion == null) {
            throw new IllegalArgumentException("Error: Entrada no válida.");
        }
        if (NecesidadEspecifica == null) {
            throw new IllegalArgumentException("Error: Entrada no válida.");
        }
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
        return "Nombre :" + getNombreCompleto() + ", Correo: " + getCorreo() + ", Carrera: " + getCarrera() + ", Generacion: " + getGeneracion() + ", Necesidad Especifica: " + getNecesidadEspecifica();
    }
}
}
