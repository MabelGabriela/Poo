
package pooFastFood;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Restaurante {
    
    private HashMap<String,IFastFood> mapaRecetasRestaurante; 
    private Menu menu;
    
    
    public Restaurante(){
    mapaRecetasRestaurante = new HashMap<>();
    menu = new Menu();
}
  public void crearReceta(String nombre, IFastFood receta) {
    mapaRecetasRestaurante.put(nombre, receta);
}  
  public void anadirRecetaAlMenu(IFastFood receta) {
    menu.getItems().add(receta);
}
  public void anadirRecetaAlMenu() { /*is.Empty = esta vacio*/
    if (mapaRecetasRestaurante.isEmpty()) { 
        System.out.println("No hay recetas disponibles en el restaurante.");
        return;
    }
     System.out.println("Elige una receta para añadir al menú:");
    int i = 1;
    for (String nombre : mapaRecetasRestaurante.keySet()) { /* keySet las claves que estan en el hashmap*/
        System.out.println(i + ". " + nombre);
        i++;
    }
    Scanner sc = new Scanner(System.in);
    int opcion = sc.nextInt();
     int contador = 1;
    for (String nombre : mapaRecetasRestaurante.keySet()) {
        if (contador == opcion) {
            menu.getItems().add(mapaRecetasRestaurante.get(nombre));/*se añade a la lista de menu la receta de la opcion que escogio el usuario*/
            System.out.println("Receta " + nombre + " añadida al menú.");
            return;
        }
        contador++;
    }
    System.out.println("Opción no válida.");
  }
  public double tiempoMedio(){
      if (menu.getItems().isEmpty()){
          return -1;
      }
      double suma = 0;
      for ( IFastFood receta : menu.getItems()){
         suma += receta.tiempoDePreparacion();
      }
      return suma / menu.getItems().size();
  }
  public double porcentajeVegetariano() {
    if (menu.getItems().isEmpty()) {
        return -1; // no hay recetas en el menú
    }

    int contadorVegetariano = 0;
    for (IFastFood receta : menu.getItems()) {
        if (receta.isVegetariano()) {
            contadorVegetariano++;
        }
    }

    return ((double) contadorVegetariano / menu.getItems().size())*100;
    
}
  //MAIN
    public static void main(String[] args) {
        //PIZZAS
        ArrayList<String> ing = new ArrayList<>();
        ing.add("queso");
        ing.add("masa");
        ing.add("salsa");
        ing.add("jamon");
        ing.add("carneee");
        
        ArrayList<String> pasos = new ArrayList<>();
        pasos.add("amasar la harina");
        pasos.add("extender masa");
        pasos.add("agregar salsa");
        pasos.add("Dispersar jamon y piña");
        pasos.add("cubrir con queso");
        pasos.add("meter al horno");
        pasos.add("sacar del horno");
        
        
        //SANDWICH
        ArrayList<String> ingS = new ArrayList<>();
        ingS.add("pan");
        ingS.add("queso");
        ingS.add("salsa");
        ingS.add("verdura");
        ingS.add("tomate");
        
        ArrayList<String> pasosS = new ArrayList<>();
        pasosS.add("poner mantequilla al pan");
        pasosS.add("poner queso");
        pasosS.add("agregar tomate");
        pasosS.add("Dispersar verdura");
        pasosS.add("cubrir con salsa");
        pasosS.add("ponerlo a la plancha");
        pasosS.add("sacar de la plancha");
        
        
        //MOSTRAR
        Pizza haw = new Pizza ("Hawaiana",ing,pasos);
        System.out.println("-----PIZZA-----");
        System.out.println("Tiempo de preparacion = "+haw.tiempoDePreparacion()+" min");
        System.out.println("Es vegetariano? "+haw.isVegetariano());
        System.out.println("Su tipo de preparacion es: "+haw.tipoDePreparacion());
        
        Sandwich san = new Sandwich ("crioll",ingS,pasosS);
        System.out.println("-----SANDWICH-----");
        System.out.println("Tiempo de preparacion = "+san.tiempoDePreparacion()+ " min");
        System.out.println("Es vegetariano? "+san.isVegetariano());
        System.out.println("Su tipo de preparacion es: "+san.tipoDePreparacion());
        
        Restaurante restaurante = new Restaurante();
        System.out.println("-----RESTAURANTE-----");
        restaurante.crearReceta(haw.getNombre(),haw);
        restaurante.crearReceta(san.getNombre(),san);
        restaurante.anadirRecetaAlMenu(haw);
        restaurante.anadirRecetaAlMenu();
        System.out.println("tiempo medio del menu: "+restaurante.tiempoMedio()+ "min");
        System.out.println("Porcentaje de recetas vegetarianas: "+restaurante.porcentajeVegetariano()+"%");
    }
}

  
