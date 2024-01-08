public class Ejercicio7 {
    public static void main(String[] args) {
        String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};
        int contadorSubcadenaZar = 0;

        for (int i = 0; i < cadenas.length; i++) {
            if (cadenas[i].contains("zar")) {
                contadorSubcadenaZar++;
            }
        }

        System.out.println("Número de cadenas que contienen la subcadena 'zar': " + contadorSubcadenaZar);
    }
}