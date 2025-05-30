public class Funcionario extends Usuario {
    private String Rol;
    private String Profesion;

    public Funcionario(String NombreCompleto, String Correo, String Contrasenia){
        super(NombreCompleto,Correo,Contrasenia);
    }
    public void setRol(String rol){
        this.Rol=rol;
    }
    public String getRol(){
        return Rol;
    }
    public void setProfesion(String profesion){
        this.Profesion=profesion;
    }
    public String getProfesion(){
        return Profesion;
    }
    public String toString(){
        return "Nombre:" + getNombre() +", Correo:" + getCorreo()+", Rol:" +getRol() +", Profesion:" + getProfesion();
    }
}
