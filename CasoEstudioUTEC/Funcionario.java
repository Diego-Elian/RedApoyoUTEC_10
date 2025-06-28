// Clase Funcionario que hereda de Usuario
public class Funcionario extends Usuario {
    private String Rol;
    private String Profesion;

    //Constructor que llama al de Usuario
    public Funcionario(String NombreCompleto, String Correo, String Contrasenia, String Rol, String Profesion){
        super(NombreCompleto,Correo,Contrasenia);
        this.Rol=Rol;
        this.Profesion=Profesion;

    }

    //Setters y getters para Rol
    public void setRol(String rol){
     if (rol == null) {
    throw new IllegalArgumentException("Error: Rol no válido.");
    }
      this.Rol = rol;
    }
    public String getRol(){
        return Rol;
    }

    //Setters y getters para Profesion
    public void setProfesion(String profesion){
  if (profesion == null) {
      throw new IllegalArgumentException("Error: Profesión no válida.");
  }
        this.Profesion = profesion;
    }

    public String getProfesion(){
        return Profesion;
    }

    //Representación en texto del objeto
    @Override
    public String toString(){
        return "Nombre:" + getNombreCompleto() + ", Correo:" + getCorreo() + ", Rol:" + getRol() + ", Profesion:" + getProfesion();
    }
}
