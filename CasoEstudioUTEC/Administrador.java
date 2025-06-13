// La clase Administrador hereda de la clase Usuario
public class Administrador extends Usuario {

    // Atributo privado que almacena el rol del administrador
    /** 
     * 🔧 Modificado: de 'String Rol' a 'String rol' para seguir la convención camelCase de Java.
     */
    private String rol;

    /**
     * Constructor de la clase Administrador
     * Llama al constructor de la clase padre Usuario con nombre, correo y contraseña.
     * 🔧 Modificado:
     * - Se agregó el parámetro 'rol' al constructor.
     * - Se corrigieron los nombres de parámetros a camelCase.
     * - Se agregó validación para evitar valores nulos o vacíos.
     */
    public Administrador(String nombreCompleto, String correo, String contrasenia, String rol) {
        super(nombreCompleto, correo, contrasenia);
        if (rol == null || rol.trim().isEmpty()) {
            throw new IllegalArgumentException("El rol no puede ser nulo o vacío.");
        }
        this.rol = rol;
    }

    /**
     * Método para establecer el valor del rol
     * 
     * 🔧 Modificado: nombre del parámetro corregido a 'rol' y se agregó validación.
     */
    public void setRol(String rol) {
        if (rol == null || rol.trim().isEmpty()) {
            throw new IllegalArgumentException("El rol no puede ser nulo o vacío.");
        }
        this.rol = rol;
    }

    // Método para obtener el valor del rol
    public String getRol() {
        return rol;
    }

    /**
     * Método que devuelve una representación en texto del objeto Administrador
     * Incluye nombre, correo y rol.
     * 🔧 Modificado:
     * - Se corrigió 'ToString()' por 'toString()' (Java es case-sensitive).
     * - Se usaron los métodos correctos heredados de Usuario: getNombreCompleto() y getCorreo().
     */
    @Override
    public String toString() {
        return "Nombre: " + getNombreCompleto() +  ", Correo: " + getCorreo() +  ", Rol: " + getRol();
    }
}
