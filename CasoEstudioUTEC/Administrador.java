// La clase Administrador hereda de la clase Usuario
public class Administrador extends Usuario {

    // Atributo privado que almacena el rol del administrador
    private String Rol;
    /**
     * Constructor de la clase Administrador.
     * Valida que ningún parámetro sea null.
     */
    public Administrador(String nombreCompleto, String correo, String contrasenia, String rol) {
        super(nombreCompleto, correo, contrasenia);

        if (nombreCompleto == null) {
            throw new IllegalArgumentException("El nombre no puede ser nulo");
        }
        if (correo == null) {
            throw new IllegalArgumentException("El correo no puede ser nulo");
        }
        if (contrasenia == null) {
            throw new IllegalArgumentException("La contrasenia no puede ser nula");
        }
        if (rol == null) {
            throw new IllegalArgumentException("El rol no puede ser nulo");
        }

    }

    /**
     * Establece el rol del administrador.
     */
    public void setRol(String rol) {
        if (rol == null) {
            throw new IllegalArgumentException("El rol no puede ser nulo");
        }
        this.Rol = rol;
    }

    /**
     * Devuelve el rol.
     */
    public String getRol() {
        return Rol;
    }

    /**
     * Representación textual del administrador.
     */
    @Override
    public String toString() {
        return "Nombre: " + getNombreCompleto() +
               ", Correo: " + getCorreo() +
               ", Rol: " + getRol();
    }
}
