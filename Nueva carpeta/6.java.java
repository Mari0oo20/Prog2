public class Ejercicio6 {
    public static void main(String[] args) {
        String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};
        int contadorPalindromos = 0;

        for (int i = 0; i < cadenas.length; i++) {
            if (esPalindromo(cadenas[i])) {
                contadorPalindromos++;
            }
        }

        System.out.println("Número de cadenas que son palíndromos: " + contadorPalindromos);
    }

    private static boolean esPalindromo(String cadena) {
        String reverso = new StringBuilder(cadena).reverse().toString();
        return cadena.equalsIgnoreCase(reverso);
    }
}