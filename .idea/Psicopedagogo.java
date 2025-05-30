package RedApoyo;

// Clase Psicopedagogo que hereda de la clase Usuario
public class Psicopedagogo extends Usuario {
    private String Especialidad;

    //Constructor del psicopedagogo
    public Psicopedagogo(String NombreCompleto, String Correo, String Contrasenia) {
        super(NombreCompleto, Correo, Contrasenia);
    }

    //Metodo para establecer la especialidad
    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    //Metodo para devolver la especialidad
    public String getEspecialidad() {
        return Especialidad;
    }

    //Metodo para devolver cadena de texto con el nombre, correo y especialidad del psicopedagogo
    public String ToString(){
        return "Nombre :" + getNombreCompleto() + ", Correo: " + getCorreo() + ", Especialidad: " + getEspecialidad();
    }
}
