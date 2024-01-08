import java.util.Random;

public class Arraysdenumeros8  {
    public static void main(String[] args) {
        int[] array = new int[8];

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            int nuevoValor;
            do {
                nuevoValor = rand.nextInt(40); // Genera numeros aleatorios de 0 a 39
            } while (contiene(array, nuevoValor));

            array[i] = nuevoValor;
        }

        // Imprime el array 
        System.out.print("Valores aleatorios sin repeticion: ");
        for (int valor : array) {
            System.out.print(valor + " ");
        }
    }

    // Funcion para verificar si un valor ya esta en el array
    private static boolean contiene(int[] array, int valor) {
        for (int i : array) {
            if (i == valor) {
                return true;
            }
        }
        return false;
    }
}