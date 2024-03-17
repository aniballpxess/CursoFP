package Ejercicios_24_03_05.IPM_Tech;

public class Main {
    public static void main(String[] args) {
        Programador marcos = new Programador("Marcos","Fernández","",26,false,12000.0,2500,"JavaScriptcd" +
                "");

        System.out.print(marcos);
        marcos.categoria();

        marcos.cambiarSalario(20);
        System.out.println();

        System.out.print(marcos);
        marcos.categoria();
    }
}
