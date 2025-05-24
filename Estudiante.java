
//Clase  Estudiantes , heredada de Usuarios
public class Estudiante extends Usuario {
    private int Cedula;
    String Carrera;
    String Generacion;
    String NecesidadEspecifica;

//Metodo que llama al constructor desde Usuario
    public Estudiante(String NombreCompleto, String Correo, String Contrasenia) {
        super(NombreCompleto, Correo, Contrasenia);
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

    public String toString() {
        return "Nombre :" + getNombre() + ", Correo: " + getCorreo() + ", Carrera: " + getCarrera() + ", Generacion: " + getGeneracion() + ", Necesidad Especifica: " + NecesidadEspecifica;
}
}