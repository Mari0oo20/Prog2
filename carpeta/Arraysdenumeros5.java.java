public class Arraysdenumeros5  {
    public static void main(String[] args) {
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = fibonacci(i);
        }

        // Imprime el array 
        System.out.print("Secuencia Fibonacci: ");
        for (int valor : array) {
            System.out.print(valor + " ");
        }
    }

    // Funcion para calcular la secuencia Fibonacci
    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}