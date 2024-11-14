public class ExerciceLivret {
    public final static int MAX = 20;
    public final static int MIN = 5;

    public static void main(String[] args) {
        int nombre1 = choisirUnNombre(MAX, MIN);
        int nombre2 = choisirUnNombre(MAX, MIN);
        System.out.println("Les chiffres sont : " + nombre1 + " " + nombre2);
        String[] tableau = construireTableMultiplication(nombre1, nombre2);
        for (String ligne : tableau) {
            System.out.println(ligne);
        }
    }

    public static int choisirUnNombre(int chiffre1, int chiffre2) {
        int random = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        return random;
    }

    public static String[] construireTableMultiplication(int n1, int n2) {

        int taille = n1 * n2;
        String[] table = new String[taille];
        int a = 1;
        int b = 1;

        

        for (int i = 0; i < table.length; i++) {
            table[i] = a + " x " + b + " = " + (a * b);
            b++;
            if (b > n2) {
                a++;
                b= 1;

            }
           
        }

        return table;

    }
}
