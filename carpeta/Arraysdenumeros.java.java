
public class Arraysdenumeros {

	public static void main(String[] args) {
		
		int tabla[]= {3,6,2,77,3,10,23,14};
		int count= 0;
		for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == 3) {
                count++;
            }
        }

        System.out.println("Cantidad de numeros 3: " + count);


	}

}
