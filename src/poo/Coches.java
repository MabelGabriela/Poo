
package poo;

public class Coches extends Vehiculos{
    private int puertas;
    
    public Coches(int puertas,String marca, double precioCompra) {
        super(marca, precioCompra);
        this.puertas=puertas;
        this.precioVenta = precioVenta();
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    

    @Override
    public String toString() {
        return "Coches{" + "puertas=" + puertas + " marca=" + marca + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + '}';
    }

    

   
    
}
