public class ExerciceTableau3 {
    public final static int MAX = 6;
    public final static int MIN = 1;

    public static void main(String[] args) {
        int [] monTableau = new int [10];
        int somme = 0;
        for (int i = 0; i < monTableau.length; i++) {
            monTableau[i]  = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            somme += monTableau[1];
            System.out.println(" cellule " +i+ " : " + monTableau[i]);
        }

        double moyenne = (double) somme / monTableau.length;

        System.out.println("la moyenne est : " + moyenne);

    }
}
