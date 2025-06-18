// Clase Analista , heredada de Usuarios
public class Analista extends Usuario {

    //Metodo que llama al constructor desde Usuario
    public Analista(String nombreCompleto, String correo, String contrasenia) {
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



    // Método que devuelve una cadena de texto con los datos
    @Override
    public String toString() {
        return "Nombre: " + getNombreCompleto() + ", Correo: " + getCorreo();
}
}