package Clases.Fruta;

public class Fresa extends Fruta {
      private boolean semilla;
        
    public Fresa (boolean semilla, String nombre, String color){
        super(nombre, color);
        this.semilla = semilla;
    }
    public boolean getSemilla(){
        return semilla;
    }
    public void setPiel(boolean semilla){
        this.semilla = semilla;
    }
    public void mostrar(){ 
        System.out.println("La fresa tiene semillas?: "+ getSemilla());
        System.out.println("Que tipo de fresa es?: " + getNombre());
        System.out.println("Que color tiene?: "+ getColor());
    }
}
