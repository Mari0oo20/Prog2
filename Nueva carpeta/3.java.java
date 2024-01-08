public class Ejercicio3 {
    public static void main(String[] args) {
        String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};
        int[] mayusculasPorPosicion = new int[cadenas.length];

        for (int i = 0; i < cadenas.length; i++) {
            mayusculasPorPosicion[i] = contarMayusculas(cadenas[i]);
        }

        System.out.println("Numero de letras mayusculas en cada posicion: " + Arrays.toString(mayusculasPorPosicion));
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