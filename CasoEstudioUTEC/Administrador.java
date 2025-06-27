// La clase Administrador hereda de la clase Usuario
public class Administrador extends Usuario {
    
    // Atributo privado que almacena el rol del administrador
    private String Rol;

    // Constructor de la clase Administrador
    // Llama al constructor de la clase padre Usuario con nombre, correo y contraseña
    public Administrador(String NombreCompleto, String Correo, String Contrasenia) {
        super(NombreCompleto, Correo, Contrasenia);
    }

    // Método para establecer el valor del rol
    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    // Método para obtener el valor del rol
    public String getRol() {
        return Rol;
    }

    // Método que devuelve una representación en texto del objeto Administrador
    // Incluye nombre, correo y rol
    // Corrección hecha: se agrega @Override y se corrige "ToString" a "toString"
    @Override
    public String toString(){
        return "Nombre :" + getNombreCompleto() + ", Correo: " + getCorreo() + ", Rol: " + getRol();
    }
}
