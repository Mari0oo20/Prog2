public class Ejercicio2 {
    public static void main(String[] args) {
        String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};
        String primeraCadena = cadenas[0];
        int posicionPrimera = 0;

        for (int i = 1; i < cadenas.length; i++) {
            if (cadenas[i].compareTo(primeraCadena) < 0) {
                primeraCadena = cadenas[i];
                posicionPrimera = i;
            }
        }

        System.out.println("Cadena alfabeticamente primera: " + primeraCadena + ", en posicion: " + (posicionPrimera + 1));
    }
}