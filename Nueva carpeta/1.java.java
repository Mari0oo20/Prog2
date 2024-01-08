public class Ejercicio1 {
    public static void main(String[] args) {
        String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};
        int[] longitudes = new int[cadenas.length];

        for (int i = 0; i < cadenas.length; i++) {
            longitudes[i] = cadenas[i].length();
        }

        System.out.println("Longitudes de caracteres en cada posicion: " + Arrays.toString(longitudes));
    }
}