// La clase Administrador hereda de la clase Usuario
public class Administrador extends Usuario {

    // Atributo privado que almacena el rol del administrador
    private String Rol;

    /**
     * Constructor de la clase Administrador.
     * Valida que ningún parámetro sea null.
     */
    public Administrador(String NombreCompleto, String Correo, String Contrasenia, String Rol) {
        super(NombreCompleto, Correo, Contrasenia);

        if (NombreCompleto == null) {
            throw new IllegalArgumentException("El nombre no puede ser nulo");
        }
        if (Correo == null) {
            throw new IllegalArgumentException("El correo no puede ser nulo");
        }
        if (Contrasenia == null) {
            throw new IllegalArgumentException("La contraseña no puede ser nula");
        }
        if (Rol == null) {
            throw new IllegalArgumentException("El rol no puede ser nulo");
        }

        this.Rol = Rol;
    }

    /**
     * Establece el rol del administrador.
     */
    public void setRol(String Rol) {
        if (Rol == null) {
            throw new IllegalArgumentException("El rol no puede ser nulo");
        }
        this.Rol = Rol;
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
