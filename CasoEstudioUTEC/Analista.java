// Clase Analista , heredada de Usuarios
public class Analista extends Usuario {

    //Metodo que llama al constructor desde Usuario
    public Analista(String NombreCompleto, String Correo, String Contrasenia) {
        super(NombreCompleto, Correo, Contrasenia);
    }

    // Método que devuelve una cadena de texto con los datos
    public String toString() {
        return "Nombre: " + getNombre() + ", Correo: " + getCorreo();
}
}
