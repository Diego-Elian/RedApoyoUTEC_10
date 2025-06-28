public class Usuario {
    private String NombreCompleto;
    private String Correo;
    private String Contrasenia;

//Constructor del Usuario
    public Usuario(String NombreCompleto, String Correo, String Contrasenia) {
     //Se agrega validación de constructores
     if (NombreCompleto == null ) {
            throw new IllegalArgumentException("El nombre no puede ser nulo");
        }
        if (Correo == null) {
            throw new IllegalArgumentException("El correo no puede ser nulo");
        }
        if (Contrasenia == null) {
            throw new IllegalArgumentException("La contraseña no puede ser nula");
           }
        this.NombreCompleto = NombreCompleto;
        this.Correo = Correo;
     // Implementar encriptación de contraseña en futuras versiones.
        this.Contrasenia = Contrasenia;

    }
//Metodo para devolver nombre
//Se modifica nombre del metodo 
    public String getNombreCompleto() {
        return NombreCompleto;
    }
// Metodo para agregar nombre
//Se modifica nombre del metodo
    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }
// Metodo para devolver contraseña
    public String getContrasenia() {
        return Contrasenia;
    }
// Metodo para agregar contraseña
    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

//Metodo para devolver Correo
    public String getCorreo() {
        return Correo;
    }
 
    //Metodo para agregar correo
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
}
