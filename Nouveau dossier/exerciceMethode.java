import java.util.Random;

public class exerciceMethode {
    public static void main(String[] args) {

        String[] sujets ={"paule","simon","julie"};
        String[] verbes ={"mange","boit","regarde"};
        String[] choses ={" une banane "," une maison "," un jus " + " une pomme "};

        for (int i = 0; i < 10; i++) {
            System.out.println(choisirMot(sujets)+" "+choisirMot(verbes)+" "+choisirMot(choses));
        }



    }
    
    public static String choisirMot(String[] mots) {
        return mots [nbreAleatoire (0, mots.length - 1)];
        
    }
    public static int  nbreAleatoire(int min, int max) {
        return ( int ) ( Math.random() * ( max - min + 1 ) ) + min;
               }
}