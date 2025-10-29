
package pooFastFood;

import java.util.ArrayList;

public class Sandwich extends Receta {

    public Sandwich(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
    }

    @Override
    public int tiempoDePreparacion() {
        String nombre = super.getNombre().toLowerCase();
        int vocales = 0;
        for (int i=0; i< nombre.length();i++){
            char c = nombre.charAt(i);// el caracter(letra) que esté en la posicion i
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vocales++;
            }
        }
        return 2+vocales;
    }

    @Override
    public boolean isVegetariano() {
        return true;
    }

    @Override
    public String tipoDePreparacion() {
        return "Plancha";
    }
    
}
