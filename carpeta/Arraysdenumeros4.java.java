
public class Arraysdenumeros4  {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = factorial(i);
        }

        // Imprime el array 
        System.out.print("Factoriales: ");
        for (int valor : array) {
            System.out.print(valor + " ");
        }
    }

    // Funcion para calcular el factorial
    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}