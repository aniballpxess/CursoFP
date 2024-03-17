package Bucles;

public class Bucle_3_WhileMegaPro {
    public static void main(String[] args) {
        int fahrenheit = 10; //contiene las temperaturas fahrenheit
        double celsius;      //contiene las temperaturas celsius
        System.out.printf(" ºF \t  ºC \n");
        System.out.println("---------------");
        while (fahrenheit <= 100 ){ //inicio del bucle while
            celsius = (fahrenheit - 32)*5/9.0;
            System.out.printf("%3d\t%6.2f \n", fahrenheit, celsius);
            fahrenheit += 10;
        }  //fin del bucle while
    }
}
