// Clase Analista , heredada de Usuarios
public class Analista extends Usuario {
    //Metodo que llama al constructor desde Usuario
    // Corrección hecha: se llama a super() como primera línea, se eliminan validaciones redundantes
    public Analista(String nombreCompleto, String correo, String contrasenia) {
        super(nombreCompleto, correo, contrasenia);
    }
    // Método que devuelve una cadena de texto con los datos
    @Override
    public String toString() {
        return "Nombre: " + getNombreCompleto() + ", Correo: " + getCorreo();
    }
}
