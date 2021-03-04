/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMIRZM
 */
public class AscesorComercial {
    private String nombre;
    private String apellido;
    private int numCelular;
    private int numTelefono;
    
    public AscesorComercial(String nombre, String apellido, int numeCelular, int numTelefono){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numCelular=numCelular;
        this.numTelefono=numTelefono;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setNumCelular(int numCelular){
        this.numCelular=numCelular;
    }
    public void setNumTelefono(int numTelefono){
        this.numTelefono=numTelefono;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getNumCelular(){
        return numCelular;
    }
    public int getNumTelefono(){
        return numTelefono;
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
