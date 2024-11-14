public class methode {
    public static void main(String[] args) {
        int reponse = addittonne(3, 4);
        int reponse2 = addittonne(2, 6);
        System.out.println("la réponse est : " + reponse + " " + reponse2);

        String[] tabVide = new String[10];
        String[] tabRempl = rempliTableau(tabVide);

        for (int i = 0; i < tabVide.length; i++) {
            System.out.println(tabRempl[i]);
        }
    }

    public static int addittonne(int n1, int n2) {
        int resultat = n1 + n2;
        return resultat;
    }

    public static String[] rempliTableau(String[] tab) {
        for (int i = 0; i < tab.length; i++) {  //fori
            tab[i] = "Bonjour";   // remplit le tableau avec bonjour
        }
        return tab;
    }
}
