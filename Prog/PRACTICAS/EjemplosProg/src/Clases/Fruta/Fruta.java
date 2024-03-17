package Clases.Fruta;

public class Fruta {
    private String nombre;
    private String color;
    
    public Fruta (String nombre,String color){ //Constructor de la clase de fruta, con los atributos (strings) de nombre y color
    this.nombre = nombre;
    this.color = color;
    }    
    public String getNombre(){ //Metodo para obtener el nombre de la fruta
        return nombre;
    }
    public String getColor(){ //Metodo para obtener el color de la fruta
        return color;
    }
    public void setNombre(String nombre){ //Metodo para establecer el nombre de la fruta
        this.nombre = nombre;
    }
    public void setColor(String color){ //Metodo para establecer el color de la fruta
        this.color = color;
    }
    public void mostrar(){
    System.out.println("Que fruta es?: "+ getNombre());
    }
}
