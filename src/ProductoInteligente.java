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
    private int stockComprado;
    private int stock;
    private String asistenteVirtualCompatible;
    
    public ProductoInteligente(String nombre, String categoria, String asistenteVirtualCompatible, double precioPorUnidad, int stock){
        this.nombre=nombre;
        this.categoria=categoria;
        this.asistenteVirtualCompatible=asistenteVirtualCompatible;
        this.precioPorUnidad=precioPorUnidad;
        this.stock=stock;
    }
    
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

    public void setCompatibilidadAsistenteVirtual(String compatibilidadAsistenteVirtual) {
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

    public int getStockComprado() {
        return stockComprado;
    }

    public void setStockComprado(int stockComprado) {
        this.stockComprado = stockComprado;
    }

    public String getAsistenteVirtualCompatible() {
        return asistenteVirtualCompatible;
    }

    public void setAsistenteVirtualCompatible(String asistenteVirtualCompatible) {
        this.asistenteVirtualCompatible = asistenteVirtualCompatible;
    }
    
    
 
    @Override
    public String toString() {
        return nombre + " Precio Unitario: " + precioPorUnidad + " Compatibilidad Asistente Virtual: " + asistenteVirtualCompatible + "Stock Comprado: "+stockComprado;
    }
    
    
}
