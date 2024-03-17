package Clases.Fruta;

public class Main {
    public static void main(String[] args) {
    
    Platano platano = new Platano(true,"Es un Platano Canario","Tiene un color amarillo verdoso");
    Fruta clasefruta = new Fruta ("Platano","amarillo");
    Fresa fresa = new Fresa (true,"fresa silvestre","roja");
    
    System.out.println("-----------------------");
    clasefruta.mostrar();
    System.out.println("---------------------------------------------------");
    platano.mostrar();
    System.out.println("---------------------------------------------------");
    fresa.mostrar();
    }
}