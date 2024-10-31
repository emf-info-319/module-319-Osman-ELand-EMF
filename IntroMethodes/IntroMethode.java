import java.util.Scanner;

public class IntroMethode {
    public static void main(String[] args) {
        debut();
        int nombre = demandeNombre();
        int nombre2 = demandeNombre();
        int nombre3 = demandeNombre();
        int resltua = somme(nombre, nombre2, nombre3);

        fin();

    }

    public static void debut() {
        System.out.println("Bonjour et bienvenue sur ce premier programme.");
        System.out.println("On va voir les méthodes dans ce cours");

    }

    public static void fin() {
        System.out.println("Programme terminé");

    }

    public static int demandeNombre() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre un nombre : >1");
        int nombre = scanner.nextInt();
        System.out.println("Merci, j'enregistre " + nombre + " ! ");
        return nombre;

    }
    public static int somme(int nombre, int nombre2, int nombre3) {
        int somme = nombre + nombre2 + nombre3;
        System.out.println("La somme est : " + somme);
        return somme;
}
}