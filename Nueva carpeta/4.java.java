public class Ejercicio4 {
    public static void main(String[] args) {
        String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};
        int[] mayusculasPorPosicion = new int[cadenas.length];

        for (int i = 0; i < cadenas.length; i++) {
            mayusculasPorPosicion[i] = contarMayusculas(cadenas[i]);
        }

        int contadorMayusculasMayorQueMinusculas = 0;
        for (int i = 0; i < cadenas.length; i++) {
            if (mayusculasPorPosicion[i] > (cadenas[i].length() - mayusculasPorPosicion[i])) {
                contadorMayusculasMayorQueMinusculas++;
            }
        }

        System.out.println("Numero de cadenas con mas mayusculas que minusculas: " + contadorMayusculasMayorQueMinusculas);
    }

    private static int contarMayusculas(String cadena) {
        int contador = 0;
        for (char c : cadena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                contador++;
            }
        }
        return contador;
    }
}