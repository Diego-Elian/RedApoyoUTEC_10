// Clase Funcionario que hereda de Usuario
public class Funcionario extends Usuario {
    private String Rol;
    private String Profesion;

   //Constructor que llama al de Usuario
    public Funcionario(String NombreCompleto, String Correo, String Contrasenia){
        super(NombreCompleto,Correo,Contrasenia);
    }
    //Setters y getters para Rol
    //Agregación de Validación 
    public void setRol(String rol){
         if (Rol== null) {
         throw new IllegalArgumentException("Error: Rol no válido.");
        }
        this.Rol=rol;
    }
    public String getRol(){
        return Rol;
    }
    //Setters y getters para Profesion 
    //Agregación de validación
    public void setProfesion(String profesion){
          if (Profesion== null) {
            throw new IllegalArgumentException("Error: Profesión no válida.");
        }
        this.Profesion=profesion;
        
    public String getProfesion(){
        return Profesion;
    }
    //Representación en texto del objeto
        //Corrección de getNombre a getNombreCompleto
     @Override
    public String toString(){
        return "Nombre:" + getNombreCompleto() +", Correo:" + getCorreo()+", Rol:" +getRol() +", Profesion:" + getProfesion();
    }
}
