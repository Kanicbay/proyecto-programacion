
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brian
 */
public class Factura {
    ArrayList<ProductoInteligente> productosInteligentes = new ArrayList<>();

    public Factura(ArrayList<ProductoInteligente> productosComprados){
        this.productosInteligentes = productosComprados;
    }
    
    public ArrayList<ProductoInteligente> getProductosComprados() {
        return productosInteligentes;
    }

    public void setProductosInteligente(ArrayList<ProductoInteligente> productosComprados) {
        this.productosInteligentes = productosComprados;
    }
    
    public double obtenerTotalAPagarPorProducto(int index){
        double totalAPagar=0;
        totalAPagar += productosInteligentes.get(index).getPrecioPorUnidad()*productosInteligentes.get(index).getStockComprado();
        return totalAPagar;
    }
    
    public double obtenerTotalAPagar(){
        double totalAPagar=0;
        for(int i=0;i<productosInteligentes.size();i++){
            if(productosInteligentes.get(i).getStockComprado()!=0){
                totalAPagar += productosInteligentes.get(i).getPrecioPorUnidad()*productosInteligentes.get(i).getStockComprado();
            }
        }
        return totalAPagar;
    }
}
