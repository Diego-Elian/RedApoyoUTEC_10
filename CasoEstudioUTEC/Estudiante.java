public class Estudiante extends Usuario {
    private int Cedula;
    private String Carrera;
    private String Generacion;
    private String NecesidadEspecifica;

    //Metodo que llama al constructor desde Usuario
    // Corrección hecha: se llama primero a super() y se eliminan validaciones redundantes
    public Estudiante(String nombreCompleto, String correo, String contrasenia) {
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
    return "Nombre: " + getNombreCompleto() + "\n" +
           "Correo: " + getCorreo() + "\n" +
           "Carrera: " + getCarrera() + "\n" +
           "Generación: " + getGeneracion() + "\n" +
           "Necesidad Específica: " + getNecesidadEspecifica() + "\n";
}

}
