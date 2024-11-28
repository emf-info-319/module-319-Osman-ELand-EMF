import java.util.Scanner;

public class Eval2 {
    public static final int NOMBRE_BATONNETS = 21;
    public static final int MAX = 3;
    public static final int MIN = 1;

    public static void main(String[] args) {
        System.out.println("test");
        int[] batonnets = new int[NOMBRE_BATONNETS];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < batonnets.length; i++) {
            batonnets[i] = 1;
        }
        boolean tourJoueur = true;
        while (nbBatonnetRestants(batonnets) > 0) {
            afficheBatonnets(batonnets);
            tourJoueur = !tourJoueur;
            if (tourJoueur) {
                int nbEnLeve = demanderNombre(scanner);
                batonnets = enLeverBatonnets(batonnets, nbEnLeve);

            } else {
                int nbEnLeveAi = (int) Math.random() * (MAX - MIN + 1) + MIN;
                System.out.println("l'ai veut enlever " + nbEnLeveAi);
                batonnets = enLeverBatonnets(batonnets, nbEnLeveAi);
            }
        }
    }

    public static void afficheBatonnets(int[] batonnets) {
        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == 1) {
                System.out.print("|");
            } else {
                System.out.print("-");
            }
        }
        System.out.println("");
        return;
    }

    public static int nbBatonnetRestants(int[] batonnets) {
        int compte = 0;
        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == 1) {
                compte++;
            }
        }
        return compte;
    }

    public static int[] enLeverBatonnets(int[] batonnets, int nbEnLeve) {
        int nbRestants = nbBatonnetRestants(batonnets);
        int nbEnLeveMax = Math.min(nbEnLeve, nbRestants);

        for (int i = batonnets.length - 1; i >= 0 && nbEnLeveMax > 0; i--) {
            if (batonnets[i] == 1) {
                batonnets[i] = 0;
                nbEnLeveMax--;
            }
        }
        return batonnets;
    }

    public static int demanderNombre(Scanner scanner) {
        System.out.println("entrer un nombre entre 1 et 3");
        int tentative = scanner.nextInt();
        while (tentative < 1 || tentative > 3) {
            System.out.println("nombre incorect");

        }
        System.out.println("entrer un nombre entre 1 et 3");

        return tentative;
    }
}
