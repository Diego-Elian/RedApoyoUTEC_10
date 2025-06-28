// La clase Administrador hereda de la clase Usuario
public class Administrador extends Usuario {
    
    // Atributo privado que almacena el rol del administrador
    private String Rol;

    // Constructor de la clase Administrador
    // Llama al constructor de la clase padre Usuario con nombre, correo y contraseña, y recibe rol
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

    // Método para obtener el valor del rol
    public String getRol() {
        return Rol;
    }

    // Método que devuelve una representación en texto del objeto Administrador
    // Incluye nombre, correo y rol
    @Override
    public String toString(){
        return "Nombre :" + getNombreCompleto() + ", Correo: " + getCorreo() + ", Rol: " + getRol();
    }
}
