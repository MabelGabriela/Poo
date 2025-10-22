
package poo;

public class PmfismoV {
    public static void main(String[] args) {
        Vehiculos[] vehiculos = new Vehiculos[5];
    vehiculos[0]= new Camiones (2,"volvo",1300);
    vehiculos[1] = new Camiones(6, "Mercedes", 1000);
    vehiculos[2] = new Camiones(4, "Scania", 1700);
    vehiculos[3] = new Furgonetas(4, "Ford", 3000);
    vehiculos[4] = new Furgonetas(12, "Renault", 5000);
        System.out.println("Precios de los vehiculos------------");
        for (Vehiculos v:vehiculos){
            System.out.println("marca: "+v.marca+" , su precio es: "+v.precioVenta());
        }
    }
    
}
