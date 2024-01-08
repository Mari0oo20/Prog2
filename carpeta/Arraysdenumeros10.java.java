public class Arraysdenumeros10 {
    public static void main(String[] args) {
        int[] array = {3, 6, 2, 77, 3, 10, 23, 14};

        int primos = 0;

        for (int valor : array) {
            if (esPrimo(valor)) {
                primos++;
            }
        }

        System.out.println("Cantidad de valores primos: " + primos);
    }

    // Funcion para verificar si un numero es primo
    private static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}