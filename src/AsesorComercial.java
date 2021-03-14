/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMIRZM
 */
public class AsesorComercial {
    private String nombre;
    private String apellido;
    private String numCelular;
    private String numTelefono;
    private String correo;
    
    public AsesorComercial(String nombre, String apellido, String numeCelular, String numTelefono, String correo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numCelular=numeCelular;
        this.numTelefono=numTelefono;
        this.correo=correo;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setNumCelular(String numCelular){
        this.numCelular=numCelular;
    }
    public void setNumTelefono(String numTelefono){
        this.numTelefono=numTelefono;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getNumCelular(){
        return numCelular;
    }
    public String getNumTelefono(){
        return numTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "AscesorComercial{" 
                + "Nombre= " + nombre 
                + "Apellido= " + apellido 
                + "NumCelular= " + numCelular 
                + "NumTelefono= " + numTelefono;
    }
    
    
    
    
    
}
