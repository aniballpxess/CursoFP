package Clases.Fruta;

public class Platano extends Fruta {
    private boolean piel;
        
    public Platano(boolean piel, String nombre, String color){
        super(nombre, color);
        this.piel = piel;
    }
    public boolean getPiel(){
        return piel;
    }
    public void setPiel(boolean piel){
        this.piel = piel;
    }
    public void mostrar(){ 
        System.out.println("El platano tiene piel?: "+ getPiel());
        System.out.println("Que tipo de platano es?: " + getNombre());
        System.out.println("Que color tiene?: "+ getColor());
    }
}
