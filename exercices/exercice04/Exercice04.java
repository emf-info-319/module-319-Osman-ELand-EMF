package exercices.exercice04;

public class Exercice04 {

    public static void main(String[] args) {

        int valeur1 = 5;
        int valeur2 = 9;
        int valeur3 = 0;
        System.out.println("Le contenu de la variable1 est : "+valeur1);
        System.out.println("Le contenu de la variable2 est : "+valeur2);
        valeur3 = valeur1; // valeur3=5
        valeur1 = valeur2; // valeur2=9
        valeur2 = valeur3; // valeur
        System.out.println("Le contenu de la variable1 est : "+valeur1);
        System.out.println("Le contenu de la variable2 est : "+valeur2);
        
    }
    
}
