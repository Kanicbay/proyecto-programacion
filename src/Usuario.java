
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kanic
 */
public class Usuario{
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;
    private double numCelular;
    private double numTelefono;
    private String usuario;
    private String contrasenia;
    
    
    public Usuario(String nombre, String apellido, String correo, String direccion,
            double numCelular, double numTelefono, String usuario, String contrasenia){
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.direccion=direccion;
        this.numCelular=numCelular;
        this.numTelefono=numTelefono;
        this.usuario=usuario;
        this.contrasenia=contrasenia;
    }
    
    public Usuario(String usuario, String contrasenia){
        this.usuario=usuario;
        this.contrasenia=contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(double numCelular) {
        this.numCelular = numCelular;
    }

    public double getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(double numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    public void crearCuenta(String usuario, String contrasenia){
        
    }
    
    public boolean iniciarSesion(String usuario, String contrasenia){
        boolean booleano;           
        if((usuario.equals(this.usuario)) &&  (contrasenia.equals(this.contrasenia))){
            booleano = true;
            System.out.println("Entro en el if");
        }
        else{
            booleano = false;
            System.out.println("Entro en el else");
        }
        return booleano;
    }
}
