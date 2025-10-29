
package pooPerJubiJYOC;

public class TestPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Mabel", 34,"");
        boolean bienDni = persona.asignarDNI("45682409A");
        if (bienDni){
            System.out.println("DNI correcto: "+persona.getDni());
        }else{
            System.out.println("DNI incorrecto");
        }
        
        System.out.println("Nombre: "+persona.getNombre() );
        System.out.println("Hace "+persona.cuantoHaceMayorEdad()+ " años es mayor de edad");
        
        }
    }

