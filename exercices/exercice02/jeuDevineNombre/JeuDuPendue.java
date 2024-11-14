
import java.util.Scanner;

public class JeuDuPendue {

    public static void main(String[] args) {
        String[] tabeauDeMot = { "Amour", "Livre", "Chanson", "Soleil", "Montagne", "Plage", "Arbre", "Lune", "Océan", "Voyage", "Bonheur", "Rêve", "Musique", "Sourire", "Café", "Poésie", "Liberté", "Étoile", "Jardin", "Légende" }; // mots  // disponibles
        int index = (int) (Math.random() * (tabeauDeMot.length)); // choisi le mot
        String motATrouver = tabeauDeMot[index];

        char[] lettresATrouver = motATrouver.toCharArray(); // transforme le mot en un tableau de char
        char[] lettresTrouvées = new char[lettresATrouver.length]; // deuxième tableau de char pour comparer
        for (int i = 0; i < lettresTrouvées.length; i++) { // pour remplir le deuxième taleau de tirets
        lettresTrouvées[i] = '-';
        }
        boolean gagne = false;
        System.out.println("Voici le mot à trouver :");
        System.out.print(lettresTrouvées); // pour afficher le mot en nombre de tirets
        Scanner entree = new Scanner(System.in);
        while (!gagne) {
            System.out.print("\nEntrez une lettre en minuscule svp : ");
            char lettre = entree.next().charAt(0);
            for (int i = 0; i < lettresTrouvées.length; i++) {
                if (lettre == lettresATrouver[i]) {
                    lettresTrouvées[i] = lettre;
                    System.out.println("cette lettre est dans le mot choisi");
                }
                System.out.print(lettresTrouvées[i]);

            }
            String motAChecker = new String(lettresTrouvées);
            if (motAChecker.equals(motATrouver)) {
                System.out.println("\nBRAVO! Le mot à trouver était " + motATrouver);
                gagne = true;
            }
        }
        entree.close();
    }
}
