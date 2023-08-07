/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockbuster;

/**
 *
 * @author Azalia
 */
public class VideoGameItem extends BlockBusterItem {
    
    String nameConsola;
    static final String consola1 = "PLAYSTATION";
    static final String consola2 = "XBOX";
    static final String consola3 = "WII";
    static final int precioRenta=30;
            

    public VideoGameItem() {
    }

    public VideoGameItem(String nameConsola, int codigo, String nombre, double precioRenta) {
        super(codigo, nombre, precioRenta);
        this.nameConsola = nameConsola;
    }
    

    @Override
    double pagoRenta(int dias) {
        return precioRenta*dias;
    }
    
    @Override
    public String toString() {
        return super.toString() +"Game";
    }
    
    public void setNameConsola(String nameConsola){
        this.nameConsola=nameConsola;
    }

    public String getNameConsola() {
        return nameConsola;
    }
    
    
    

    
}
