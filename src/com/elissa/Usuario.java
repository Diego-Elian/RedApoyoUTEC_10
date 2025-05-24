package com.elissa;
 //Clase Usuario
public class Usuario {
    private String NombreCompleto;
    private String Correo;
    private String Contrasenia;

//Constructor del Usuario
    public Usuario(String NombreCompleto, String Correo, String Contrasenia) {
        this.NombreCompleto = NombreCompleto;
        this.Correo = Correo;
        this.Contrasenia = Contrasenia;

    }
//Metodo para devolver nombre
    public String getNombre() {
        return NombreCompleto;
    }
// Metodo para agregar nombre
    public void setNombre(String NombreCompleto) {
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
        this.Correo = Correo;
    }

}



