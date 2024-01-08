public class Ejercicio9 {
    public static void main(String[] args) {
        String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};
        int posicionMaxCaracteres = 0;

        for (int i = 1; i < cadenas.length; i++) {
            if (cadenas[i].length() > cadenas[posicionMaxCaracteres].length()) {
                posicionMaxCaracteres = i;
            }
        }

        System.out.println("Posición de la cadena con más caracteres: " + (posicionMaxCaracteres + 1));
    }
}