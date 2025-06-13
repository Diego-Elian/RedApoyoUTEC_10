package RedApoyo;

// Clase Psicopedagogo que hereda de la clase Usuario
public class Psicopedagogo extends Usuario {
    private String Especialidad;

    //Constructor del psicopedagogo
    //Corrección hecha:se valida que los parámetros no sean nulos
    public Psicopedagogo(String NombreCompleto, String Correo, String Contrasenia, String Especialidad) {
        super(NombreCompleto, Correo, Contrasenia);
        if (NombreCompleto == null) {
            throw new IllegalArgumentException("Nombre no puede ser nulo");
        }
        if (Correo == null) {
            throw new IllegalArgumentException("Correo no puede ser nulo");
        }
        if (Contrasenia == null) {
            throw new IllegalArgumentException("Contraseña no puede ser nula");
        }
        if (Especialidad == null) {
            throw new IllegalArgumentException("Especialidad no puede ser nula");
        }
        
        
    
 // Metodo para establecer la especialidad
        this.Especialidad = Especialidad;
    }

    //corrección hecha: se valida que el parámetro no sea nulo
    public void setEspecialidad(String Especialidad) {
        if (Especialidad == null) {
            throw new IllegalArgumentException("Especialidad no puede ser nula");
        }
        this.Especialidad = Especialidad; 
    }
    
    //Metodo para devolver la especialidad
    public String getEspecialidad() {
        return Especialidad;
    }

    //Metodo para devolver cadena de texto con el nombre, correo y especialidad del psicopedagogo
    //corrección hecha: se agrega el override y se pone le pone minúscula a "toString"
    @Override
    public String toString(){
        return "Nombre :" + getNombreCompleto() + ", Correo: " + getCorreo() + ", Especialidad: " + getEspecialidad();
    }
}
