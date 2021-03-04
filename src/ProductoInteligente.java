/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMIRZM
 */
public class ProductoInteligente {
    private String nombre;
    private String categoria;
    private double precioPorUnidad;
    private int stock;
    private boolean asistenteVirtualCompatible;
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setCategoria(String categoria){
        this.categoria=categoria;
    }
    public void setPrecioPorUnidad(double precioPorUnidad){
        this.precioPorUnidad=precioPorUnidad;
    }
    public void setStock(int stock){
        this.stock=stock;
    }

    public void setCompatibilidadAsistenteVirtual(boolean compatibilidadAsistenteVirtual) {
        this.asistenteVirtualCompatible = compatibilidadAsistenteVirtual;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getCategoria(){
        return categoria;
    }
    public double getPrecioPorUnidad(){
        return precioPorUnidad;
    }
    public int getStock(){
        return stock;
    }

    public boolean isCompatibilidadAsistenteVirtual() {
        return asistenteVirtualCompatible;
    }
    
    
}
