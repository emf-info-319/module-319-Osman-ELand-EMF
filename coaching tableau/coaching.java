public class coaching {

    public static void main(String[] args) {
        int[] notes = new int[5]; // créer/declarer un tableau de taille
        notes[4] = 5; // je remplis  l'index 4 avec 5

        // remplie le tableau "note" avec que des 5 dans tout le tableau
        for (int i = 0; i < notes.length; i++) {
            notes[i] = 5; // je rempli i avec 5 
        }

            System.out.println(notes[2]); //affiche l'index 2 => donc 5 parce que tout le tableau contient des 5 



         // créer une boucle pour afficher le tableau
         for (int i = 0; i < notes.length; i++) {
            System.out.println("note " + i + "  : " + notes[i]); // permet de lire le tableau : note + "index" + ":" + note[i] => 5 
        }
    }
}