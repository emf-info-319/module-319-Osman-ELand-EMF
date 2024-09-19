public class ExerciceTableau2 {
    public final static int MAX = 6;
    public final static int MIN = 1;

    public static void main(String[] args) {
        int [] monTableau = new int [10];
        for (int i = 0; i < monTableau.length; i++) {
            monTableau[i]  = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            System.out.println(" cellule " +i+ " : " + monTableau[i]);
        }

    }
}
