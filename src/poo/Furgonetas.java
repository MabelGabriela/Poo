
package poo;

public class Furgonetas extends Vehiculos{
    private double capacidadCarga;
    public Furgonetas(double capacidadCarga, String marca, double precioCompra) {
        super(marca, precioCompra);
        this.capacidadCarga=capacidadCarga;
        this.precioVenta=precioVenta();
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Furgonetas{" + "capacidadCarga=" + capacidadCarga + " marca=" + marca + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta +  '}';
    }

    @Override
    public double getPrecioVenta() {
        if (capacidadCarga>10){
            return this.precioCompra*1.80;
        }else {
    return this.precioCompra*1.60;
    }
}
    
    
}
