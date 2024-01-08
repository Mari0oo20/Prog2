public class Ejercicio8 {
    public static void main(String[] args) {
        String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};
        int contadorComienzanConA = 0;

        for (int i = 0; i < cadenas.length; i++) {
            if (cadenas[i].startsWith("A") || cadenas[i].startsWith("a")) {
                contadorComienzanConA++;
            }
        }

        System.out.println("Numero de cadenas que comienzan con la letra 'A': " + contadorComienzanConA);
    }
}