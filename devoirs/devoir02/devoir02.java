package devoirs.devoir02;

public class devoir02 {
    public static final int CAPACITE_RESERVOIR_A = 3;
    public static final int CAPACITE_RESERVOIR_B = 5;

    public static void main(String[] args) {

            int reservoirA = 0;
             int reservoirB = 0;
             int remplisage;

        remplisage = ( int) ( Math.random() * ( CAPACITE_RESERVOIR_A+CAPACITE_RESERVOIR_B - 0 + 1)) + 0;          

        System.out.println(" " + remplisage + "litres à remplir.");

        while (reservoirA + reservoirB < remplisage) {
                     if (reservoirA < CAPACITE_RESERVOIR_A) {
                reservoirA++;

            } else if (reservoirB < CAPACITE_RESERVOIR_B) {
                reservoirB++;
            }
                    System.out.println("Niveau réservoir A : " + reservoirA + " litres");

            System.out.println("Niveau réservoir A : " + reservoirB + "litres");

        }

             System.out.println("Niveau réservoir A : " + reservoirA + "litres");

        System.out.println("Niveau réservoir B : " + reservoirB + "litres");
        
        System.out.println("Remplissage terminé.");
    }
}
