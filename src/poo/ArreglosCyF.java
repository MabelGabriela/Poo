
package poo;

public class ArreglosCyF {
    public static void main(String[] args) {
        
       Camiones[] camiones = new Camiones[3];
        camiones[0] = new Camiones(2,"volvo",1300);
        camiones[1] = new Camiones(6, "Mercedes", 1000);
        camiones[2] = new Camiones(4, "Scania",1700);
        System.out.println("Precios camiones-------------------------");
        for (Camiones c : camiones){
            System.out.println("marca: "+c.marca+" , precio de venta: "+c.precioVenta);
        }
        
        Furgonetas[] furgonetas = new Furgonetas[2];
        furgonetas [0]= new Furgonetas(4,"ford",3000);
        furgonetas [1]= new Furgonetas(3,"renault",5000);
        System.out.println("Precios furgonetas-------------------------");
        for (Furgonetas f : furgonetas){
            System.out.println("marca: "+f.marca+ " , precio de venta: "+f.precioVenta);
        }
    }
}
