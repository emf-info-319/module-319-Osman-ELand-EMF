
public class sept_boucle {

    public static void main(String[] args) {

        int nombreDepart = 5;
        int somme = 0;
        for (int i = 1; i <= nombreDepart ; i++) {
            somme += i;
        }
        System.out.println("La somme des entiers de 1 à " + nombreDepart + " est : " + somme);
    }
}