package com.elissa;
 //Clase Usuario
public class Usuario {
    private String NombreCompleto;
    private String Correo;
    private String Contrasenia;

//Constructor del Usuario
    public Usuario(String NombreCompleto, String Correo, String Contrasenia) {
     //Se agrega validación de constructores
     if (nombreCompleto == null || nombreCompleto.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo ni vacío");
        }
        if (correo == null || correo.isEmpty()) {
            throw new IllegalArgumentException("El correo no puede ser nulo ni vacío");
        }
        if (contraseña == null || contraseña.isEmpty()) {
            throw new IllegalArgumentException("La contraseña no puede ser nula ni vacía");
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
        this.Correo = Correo;
    }

}



