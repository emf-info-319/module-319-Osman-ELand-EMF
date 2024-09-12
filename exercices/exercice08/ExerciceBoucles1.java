package exercices.exercice08;

public class ExerciceBoucles1 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Boucle for, itération: " + i);
        }
       
        int nombre = 1;
         while (nombre <= 5) {
            System.out.println("Boucle while, itération: " + nombre);
            nombre++;
         }

         int nombre2 = 1;
          boolean condition = true;
          while(condition){
            System.out.println("Boucle while2, itération : "+ nombre2);
            nombre2++;
            if(nombre2>5){
                condition=false;
            }
          }


          int nombre3 = 1;
          do {
            System.out.println("Boucle do-while, itération: " + nombre3);
            nombre3++;
        } while (nombre3<=5); // le while fait l'inverse du "if" 

        

        for (int i = 1; i <= 5; i++) { 
            if (i == 3) {
                continue; // Saute l'itération 3
            }
            System.out.println("Boucle for, itération: " + i);
        }
        
        int nombre4 = 1;
         while (nombre4 <= 5) {
            System.out.println("Boucle while, itération: " + nombre4);
            nombre4++;
            if (nombre4 == 4) {
                break;
            }
         }
        
    }
}
