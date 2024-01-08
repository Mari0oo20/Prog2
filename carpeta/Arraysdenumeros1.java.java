
public class Arraysdenumeros1 {

	public static void main(String[] args) {
	
		int tabla[] = {3, 6, 2, 77, 3, 10, 23, 14, 5, 8};
        int mitad = tabla.length / 2;
        int sumaPrimeraMitad = 0;
        int sumaSegundaMitad = 0;

        for (int i = 0; i < mitad; i++) {
            sumaPrimeraMitad += tabla[i];
        }

        for (int i = mitad; i < tabla.length; i++) {
            sumaSegundaMitad += tabla[i];
        }

        if (sumaPrimeraMitad > sumaSegundaMitad) {
            System.out.println("La suma de la primera mitad es mayor.");
        } else if (sumaPrimeraMitad < sumaSegundaMitad) {
            System.out.println("La suma de la segunda mitad es mayor.");
        } else {
            System.out.println("La suma de las dos mitades es igual.");
        }
	}

}
