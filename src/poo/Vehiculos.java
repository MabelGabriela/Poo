package poo;

public class Vehiculos {
protected String marca;
protected double precioCompra;
protected double precioVenta;
 
public Vehiculos(String marca,double precioCompra){
    this.marca=marca;
    this.precioCompra=precioCompra;
    this.precioVenta=precioVenta();
}

public double precioVenta (){
    return this.precioCompra*1.60;
}
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "marca=" + marca + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + '}';
    }

}
