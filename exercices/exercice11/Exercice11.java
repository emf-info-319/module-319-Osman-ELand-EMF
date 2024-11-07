package exercice11;

public class Exercice11 {

    public final static int MAX = 100;
    public final static int MIN = 0;

    public static void main(String[] args) {
        int[] tableauInitial = new int[4];
        for (int i = 0; i < tableauInitial.length; i++) {
            tableauInitial[i] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            System.out.println(" Tableau initial [0]" + " : " + tableauInitial[i]);
        }
        int[] tableauFinal = inverseLeTableau(tableauInitial);



        afficheNombre(342534534); //fait par le prof, a revoire pour comprendre 
        additionne(3, 5);   //fait par le prof, a revoire pour comprendre 
    }

    public static int[] inverseLeTableau(int[] tableauInitial) {
        return null;
    }

    public static void afficheNombre(int nombre){   //fait par le prof, a revoire pour comprendre 
        System.out.println(nombre);
    }

    public static int additionne(int nombre1, int nombre2){   //fait par le prof, a revoire pour comprendre 
        System.out.println(nombre1+nombre2);
        return nombre1 + nombre2;
    }
}
