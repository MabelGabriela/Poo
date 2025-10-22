
package poo;

public class Test {
    public static void main(String[] args) {
        Vehiculos vehiculo = new Vehiculos("tesla",3000);
        System.out.println(vehiculo.toString());
        
        Coches coche = new Coches(4,"honda",2500);
        System.out.println(coche.toString());
        
        Furgonetas furgoneta = new Furgonetas(3,"ford",5000);
        System.out.println(furgoneta.toString());
        
        Camiones camion = new Camiones(2,"volvo",7000);
        System.out.println(camion.toString());
    }
}
