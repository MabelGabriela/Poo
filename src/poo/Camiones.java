
package poo;

public class Camiones extends Vehiculos{
    private int ejes;
    public Camiones(int ejes,String marca, double precioCompra) {
        super(marca, precioCompra);
        this.ejes=ejes;
        this.precioVenta=precioVenta();
        
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    @Override
    public String toString() {
        return "Camiones{" + "ejes=" + ejes + " marca=" + marca + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + '}';
    }

    @Override
    public double getPrecioVenta() {
        return this.precioCompra*ejes;
    }
    
}
