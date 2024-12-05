package devoirs.devoir01;

public class devoir01 {
    public static void main(String[] args) {
        int monAge = 16;
        boolean estMajeur;
        System.out.println("je m'appelle eland osman");
        System.out.println("j'ai " + monAge + " ans");
        if (monAge >= 20) {
            estMajeur = true;

        } else {
            estMajeur = false;
        }
        if (estMajeur) {
            System.out.println("je suis Majeur");

        } else {
            System.out.println("je suis mineur");
        }

    }
}
