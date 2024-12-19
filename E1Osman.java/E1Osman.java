import java.util.Scanner;

public class E1Osman {
    public final static int DES_MAX = 6;
    public final static int DES_MIN = 1;
    public final static int NOMBRE_TUILES = 12;
    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] tuiles = new int[NOMBRE_TUILES];
        boolean enJeu = true;

        System.out.println("**********************************");
        System.out.println("*           'Shut The Box'       *");
        System.out.println("**********************************");
        System.out.println(
                "Il faut baisser les tuiles pour avoir un total équivalent au total de la sommes des dès. Le 0 permet de terminer la partie.");
        for (int i = 0; i < tuiles.length; i++) {
            tuiles[i] = 1;
        }
        while (!enJeu) {
            afficheTuiles(tuiles);
            int totalDes = tireLesDes();
            System.out.println("Donnez le(s) nombre(s) à enlever :");
            tuiles = enleveTuiles(tuiles, totalDes);
            boolean encore = contientEncoreDesTuilesABaisser(tuiles);
            if (encore) {
                System.out.println("Jeu terminé");
                SCANNER.close();
                enJeu = true;

            }

        }
    }

    public static void afficheTuiles(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 10) {
                System.out.println("| " + " 0 " + tab + " | ");
            }
            if (tab[i] == 0) {
                System.out.println("__");

            }
        }

    }

    public static int tireLesDes() {
        int des1 = (int) Math.random() * (DES_MAX - DES_MIN + 1) + DES_MIN;
        int des2 = (int) Math.random() * (DES_MAX - DES_MIN + 1) + DES_MIN;

        int additione = des1 + des2;

        System.out.println("Les nombres tirés sont : " + des1 + des2 + " qui font un total de " + additione);
        return additione;
    }

    public static int[] enleveTuiles(int[] tuiles, int totalDes) {
        int[] tuilesTemp = copieTableau(tuiles);
        int totalEnleve = 0;
        boolean demandeEncore = true;

        do {
            int valeur = SCANNER.nextInt();
            int additione = valeur + totalEnleve;
            totalEnleve = additione;
            if (valeur == 0) {
                System.out.println("Abandon…");
                for (int i = 0; i < tuilesTemp.length; --i) {

                }
                tuiles = copieTableau(tuilesTemp);
                demandeEncore = false;

            } else if (valeur < 1 || valeur > tuilesTemp.length) {
                System.out.println(" Hors limites !");

                totalEnleve = 0;

            } else if (tuilesTemp[-1] == 0) {
                System.out.println("Vous avez déjà baissé la tuile à la position " + valeur);
                int soustraire = valeur - totalEnleve;
                totalEnleve = soustraire;

            } else {
                if (totalEnleve < totalDes) {
                    tuilesTemp[-1] = 0;
                    System.out.println("Ce n'est pas suffisant, merci d'enlever encore");
                } else if (totalEnleve > totalDes) {
                    System.out.println("Le total est dépassez, choisissez d'autres nombres");
                    tuilesTemp = copieTableau(tuiles);
                    totalEnleve = 0;
                    afficheTuiles(tuiles);
                } else {
                    tuilesTemp[valeur - 1] = 0;
                    System.out.println("Parfait !");
                    tuiles = copieTableau(tuilesTemp);
                    demandeEncore = false;
                }

            }
        } while (demandeEncore == true);
        {
        }

        return tuiles;
    }

    public static int[] copieTableau(int[] tab) {
        int[] copie = tab;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = copie[i];

        }
        return copie;
    }

    public static boolean contientEncoreDesTuilesABaisser(int[] tab3) {
        boolean baisse;
        if (tab3.length < 0 || tab3.length > 0) {
            baisse = true;
        } else {
            baisse = false;
        }
        return baisse;
    }
}
