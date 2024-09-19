public class ExerciceTableau {
    public static void main(String[] args) {

        int[] monTableau2 = new int[5]; // Declaaration du tableau, il s'affichera "0 0 0 0 0 "
        for (int i = 0; i < monTableau2.length; i++) {
            System.out.println(monTableau2[i]);
        }
        int taille = monTableau2.length; // ça c'est pour connaitre la taille du tableau
        System.out.println(taille); // ca aussi

        int[] monTableau = new int[] { 45, 23, 4, 3, 28, 90, 100 }; // il s'affichera "45, 23, 4, 3, 28, 90, 100"
        for (int i = 0; i < monTableau.length; i++) {
            System.out.println(monTableau[i]);
        }

        int [] monTableau3 = new int [] {45, 23 ,4};  // IL VA AFFICHER LA DEUXIEME CELLULE DU TABLEAU DONC 4 !!!  et pas "45, 23, 4"
        int valeurcellule2 = monTableau3 [2];
        System.out.println(valeurcellule2);

        String[] tableau = new String[5];
        for (int nombredecellule = 0; nombredecellule < tableau.length; nombredecellule)    // il faut finir le code, demander a chatgpt
        System.out.println(tableau [nombredecellule]);

           

    }
}
