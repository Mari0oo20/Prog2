

public class Arraysdenumeros2{
    public static void main(String[] args) {
        int tabla[] = {3, 6, 2, 77, 3, 10, 23, 14};
        boolean todosDiferentes = true;

        for (int i = 0; i < tabla.length - 1; i++) {
        	
        	 for (int j = i + 1; j < tabla.length; j++) {
                 if (tabla[i] == tabla[j]) {
                     todosDiferentes = false;
                     break;
                 }
             }
             if (!todosDiferentes) {
                 break;
             }
         }

         if (todosDiferentes) {
             System.out.println("Todos los elementos son diferentes.");
         } else {
             System.out.println("No todos los elementos son diferentes.");
         }
     }
 }