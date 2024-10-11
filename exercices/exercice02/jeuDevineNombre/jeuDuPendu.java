import java.util.Scanner;

public class jeuDuPendu {
    public static void main(String[] args) {

        String motADeviner = "fantastique";

        char[] lettresDevinees = new char[motADeviner.length()];

        for (int i = 0; i < lettresDevinees.length; i++) {
            lettresDevinees[i] = '_';
        }

        int tentativesRestantes = 6;

        boolean motDevine = false;

        Scanner scanner = new Scanner(System.in);

        while (tentativesRestantes > 0 && !motDevine) {

            System.out.println("Mot à deviner : " + new String(lettresDevinees));
            System.out.println("Tentatives restantes : " + tentativesRestantes);
            System.out.print("Entrez une lettre : ");

            char lettre = scanner.nextLine().charAt(0);

            boolean bonneLettre = false;

            for (int i = 0; i < motADeviner.length(); i++) {

                if (motADeviner.charAt(i) == lettre) {

                    lettresDevinees[i] = lettre;

                    bonneLettre = true;
                }
            }

            if (!bonneLettre) {

                tentativesRestantes--;

                System.out.println("Mauvaise lettre !");
            }

            motDevine = true;

            for (int i = 0; i < lettresDevinees.length; i++) {

                if (lettresDevinees[i] == '_') {

                    motDevine = false;
                    break;
                }
            }
        }

        if (motDevine) {
            System.out.println("Félicitations ! Vous avez deviné le mot : " + motADeviner);
        } else {
            System.out.println("Vous avez perdu ! Le mot était : " + motADeviner);
        }
        scanner.close();
    }
}
