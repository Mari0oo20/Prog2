public class Arraysdenumeros7  {
    public static void main(String[] args) {
        int[] array = {3, 6, 2, 77, 3, 10, 23, 14};

        boolean esPalindromo = true;

        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            if (array[i] != array[j]) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La secuencia es  igual.");
        } else {
            System.out.println("La secuencia no es igual.");
        }
    }
}