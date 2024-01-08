public class Arraysdenumeros6  {
    public static void main(String[] args) {
        int[] array = {3, 6, 2, 77, 3, 10, 23, 14};

        int pares = 0;
        int impares = 0;

        for (int valor : array) {
            if (valor % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        if (pares > impares) {
            System.out.println("Hay mas numeros pares.");
        } else if (pares < impares) {
            System.out.println("Hay mas numeros impares.");
        } else {
            System.out.println("El numero de pares e impares es igual.");
        }
    }
}