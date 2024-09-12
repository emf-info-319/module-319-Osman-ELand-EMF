package exercices.exercice08;

public class ExerciceBoucles2 {
    public static void main(String[] args) {
        System.out.println("Boucle for");
        for (int i = 5; i > 0; --i) { 
            System.out.println(i);
            
        } 
        System.out.println("Décollage!!");



        System.out.println("Boucle while");
        int nombre = 5;
        while (nombre > 0) {
           System.out.println(nombre);
           nombre--;
        }System.out.println("Décollage!!");

        System.out.println("Boucle do-while");
        int nombre3 = 5;
          do {
            System.out.println( nombre3);
            nombre3--;
        } while (nombre3>0); // le while fait l'inverse du "if" 
        System.out.println("Décollage!!");


    }
}
