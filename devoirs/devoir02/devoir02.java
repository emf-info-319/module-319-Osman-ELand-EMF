package devoirs.devoir02;

public class devoir02 {
    public static final int CAPACITE_RESERVOIR_A = 3;
    public static final int CAPACITE_RESERVOIR_B = 5;

    public static void main(String[] args) {
        int reservoirA = 0;
        int reservoirB = 0;
        Random rand = new Random();
        int remplisage = rand.nextInt(CAPACITE_RESERVOIR_A + CAPACITE_RESERVOIR_B + 1);
        System.out.println("litres à remplir : " + remplisage);
        while (reservoirA + reservoirB < remplisage) {
            if (reservoirA < CAPACITE_RESERVOIR_A) {
                reservoirA++;
            } else if (reservoirB < CAPACITE_RESERVOIR_B) {
                reservoirB++;
            }
            System.out.println("Niveau réservoir A : " + reservoirA + " litres");
            System.out.println("Niveau réservoir A : " + reservoirB + "litres");

        }
        System.out.println("Remplissage terminé.");
        System.out.println("Niveau réservoir A : " + reservoirA + "litres");
        System.out.println("Niveau réservoir B : " + reservoirB + "litres");
    }
}
