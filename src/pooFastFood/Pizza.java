
package pooFastFood;

import java.util.ArrayList;

public class Pizza extends Receta {

    public Pizza(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
    }

    @Override
    public int tiempoDePreparacion() {
        return (2+super.getNombre().length());
    }

    @Override
    public boolean isVegetariano() {
        for (String ingredientes : super.getIngredientes()){
            if(ingredientes.toLowerCase().contains("carne")){
                return false;
            }
        }
        return true;
    }

    @Override
    public String tipoDePreparacion() {
        return "Horno";
    }
    
}
