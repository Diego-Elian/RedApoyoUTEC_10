// Clase Analista , heredada de Usuarios
public class Analista extends Usuario {

    //Metodo que llama al constructor desde Usuario
    //Se agrego validacion de constructor
    public Analista(String NombreCompleto, String Correo, String Contrasenia) {
        super(NombreCompleto, Correo, Contrasenia);
        if (NombreCompleto == null) {
            throw new IllegalArgumentException("Error: Entrada no válida.");
        }
        if (Correo == null) {
            throw new IllegalArgumentException("Error: Entrada no válida.");
        }
        if (Contrasenia == null) {
            throw new IllegalArgumentException("Error: Entrada no válida.");
        }
    }
    // Método que devuelve una cadena de texto con los datos
    @Override
    public String toString() {
        return "Nombre: " + getNombreCompleto() + ", Correo: " + getCorreo();
    }
}
