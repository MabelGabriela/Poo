
package pooPerJubiJYOC;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public void esMayorDeEdad(){
        if (edad >= 18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
    public int cuantoHaceMayorEdad (){
        int cuantoHace;
        if (edad>18){
             cuantoHace = edad - 18;
        }
        else if (edad==18){
             cuantoHace = 0;
        }
        else{
            cuantoHace = edad -18;
        }
        return cuantoHace;
    }
    public boolean asignarDNI(String nuevoDni){
       if(nuevoDni.length()==9){
           this.dni=nuevoDni;
           return true;
       } else{
           return false;
       }
    }
    public boolean estaJubilado(){
        if (edad>=65){
            return true;
        }
        else{
            return false;
        }
    }
    
}
