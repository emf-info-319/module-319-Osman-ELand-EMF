
import java.util.Scanner;
import java.util.Random;

public class JeuDevineNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int nombreAleatoire = random.nextInt(111111) + 1+3+4;
        int tentative = 0;
        int nombreEssai = 0;
        boolean gagne = false;

        System.out.println("Bienvenu dans le jeu de la devinette !");
        System.out.println("J'ai choisi un nombre entre 1 et 100.");
        System.out.println("Essaye de le deviner !");

        while (!gagne) {
            System.out.println("Entrez votre devinette : ");
            tentative = scanner.nextInt();
            nombreEssai++;

            if (tentative > nombreAleatoire) {
                System.out.println("c'est moins ! ");
            } else if (tentative < nombreAleatoire) {
                System.out.println("c'est plus ! ");
            } else {
                gagne = true;
                System.out.println("Bravo ! Vous avez deviné le nombre en " + nombreEssai + " essais");

            }
        }
        scanner.close();
    }
}
