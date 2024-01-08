public class Arraysdenumeros9  {
    public static void main(String[] args) {
        int[] array = {3, 6, 2, 77, 3, 10, 23, 14};

        int divisiblesPor7 = 0;

        for (int valor : array) {
            if (valor % 7 == 0) {
                divisiblesPor7++;
            }
        }

        System.out.println("Cantidad de valores divisibles entre 7: " + divisiblesPor7);
    }
}