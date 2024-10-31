import java.util.Scanner;
 
public class pendue {
    public static void main(String[] args) {
        String[] tableauDeMotsATrouver = new String[] { "lapin", "grenouille", "renard", "singe", "cochon", "dragon","serpent", "sanglier", "mouton" }; // mots disponibles
        int index = (int) (Math.random() * (tableauDeMotsATrouver.length)); // choisi le mot
        String motATrouver = tableauDeMotsATrouver[index];
 
        char[] lettresATrouver = motATrouver.toCharArray(); // transforme le mot en un tableau de char
        char[] lettresTrouvées = new char[lettresATrouver.length]; // deuxième tableau de char pour comparer
        for (int i = 0; i < lettresTrouvées.length; i++) { // pour remplir le deuxième taleau de tirets
            lettresTrouvées[i] = '-';
        }
        boolean trouvé=false;// une condition qui, vraie, va arrêter de demander une lettre et finir le jeu
 
        System.out.println("Voici le mot à trouver :");
        System.out.print(lettresTrouvées); // pour afficher le mot en nombre de tirets
        Scanner entree = new Scanner(System.in);
 
        while (!trouvé) {
            System.out.print("\nEntrez une lettre en minuscule svp : ");
            char lettre = entree.next().charAt(0);
            for (int i = 0; i < lettresTrouvées.length; i++) {
                if (lettre == lettresATrouver[i]) { // compare la lettre entrée à la lettre dans le tableau des lettres à trouver
                    lettresTrouvées[i] = lettre; // si la condition est remplie, remplace un tiret par la bonne lettre dans le deuxième tableau
                }
                System.out.print(lettresTrouvées[i]);
            }
            String motAChecker = new String(lettresTrouvées); // crée un mot à partir des char du deuxième tableau
            if (motAChecker.equals(motATrouver)) { // si les deux mots sont les mêmes alors...
                System.out.println("\nBRAVO! Le mot à trouver était "+motATrouver);
                trouvé = true; // ...la condition devient vraie, le jeu va s'arrêter
            }
        }
        entree.close();
    }
}
 