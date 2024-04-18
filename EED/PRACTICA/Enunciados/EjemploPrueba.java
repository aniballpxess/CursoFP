public class EjemploPrueba 
{
    public static void main(String[] args) 
    {
        // Java no me deja poner - char cadena[10] - asi que lo he declarado aquí
        char[] miCadena = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char miLetra = 'z';
        int numeroDeVeces = contarLetrasMiguel(miCadena, miLetra);
        System.out.println(numeroDeVeces);
    }

    // LO QUE MIGUEL HA MOSTRADO
    public static int contarLetrasMiguel(char[] cadena, char letra) {
        int contador = 0, n= 0, lon;
        lon = cadena.length;
        if (lon > 0) {
            do {
                if (cadena[contador] == letra)  n++;
                contador++;
                lon--;
            } while (lon > 0);
        }
        return n;
    }

    // COMO YO LO HABRÍA ESCRITO
    public static int contarLetrasMarcos(char[] cadena, char letra) 
    {
        int posicion = 0, repeticionesDeLetra = 0;
        int letrasPorMirar = cadena.length;
        if (letrasPorMirar > 0) 
        {
            do 
            {
                if (cadena[posicion] == letra) 
                {
                    repeticionesDeLetra++;
                }
                posicion++;
                letrasPorMirar--;
            } 
            while (letrasPorMirar > 0);
        }
        return repeticionesDeLetra;
    }

    // REPARANDO SUS ACTOS TERRORISTAS
    public static int contarLetrasBien(char[] cadena, char letra) 
    {
        if (cadena == null) 
        {
            return 0;
        }
        int posicion = 0;
        int repeticionesDeLetra = 0;
        int letrasPorMirar = cadena.length;
        while (letrasPorMirar > 0) 
        {
            if (cadena[posicion] == letra) 
            {
                repeticionesDeLetra++;
            }
            posicion++;
            letrasPorMirar--;;
        }
        return repeticionesDeLetra;
    }
}