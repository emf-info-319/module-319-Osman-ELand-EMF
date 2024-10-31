
import java.util.Scanner;

public class JeuDuPondue {

    public static void main(String[] args) {  
        Scanner scanner = new Scanner (System.in);                             
        String[] tabeauDeMot = { "apple", "bread", "chair", "dance", "eagle", "flame", "grape", "house", "input", "jelly",
        "knife", "lemon", "mouse", "night", "ocean", "piano", "queen", "robot", "snake", "tiger",
        "ultra", "vivid", "whale", "xenon", "yacht", "zebra", "angel", "beach", "candy", "dream",
        "earth", "frost", "giant", "happy", "ideal", "jolly", "karma", "lucky", "magic", "noble",
        "olive", "pearl", "quiet", "raven", "smile", "trust", "unity", "vocal", "witty", "xylos"};     // mots disponibles
        int index = (int) (Math.random() * (tabeauDeMot.length));  // choisi le mot
        String motATrouver = tabeauDeMot[index]; 

        char[] lettresATrouver = motATrouver.toCharArray(); // transforme le mot en un tableau de char
        char[] lettresTrouvées = new char[lettresATrouver.length]; // deuxième tableau de char pour comparer
        for (int i = 0; i < lettresTrouvées.length; i++) { // pour remplir le deuxième taleau de tirets
            lettresTrouvées[i] = '-';
        }

        boolean gagne = false;  
        System.out.println("Bienvenu dans le jeu du Pendue !");                      
        System.out.println("J'ai choisi un Mot aléatoirement.");
        System.out.println("Voici le mot à trouver :");
        System.out.print(lettresTrouvées); // pour afficher le mot en nombre de tirets   
        String tentative = "";
        int nombreEssai = 0; 


        while (!gagne) {                                                              
            System.out.println("Entrez votre lettre en minuscule SVP : "); 
                                                                                  
           tentative = scanner.nextLine();
            if (motATrouver.contains(tentative)) {                                             
                System.out.println("cette lettre est dans le mot choisi");
                // mettre la lettre à la place, ..
                
            } else if (tentative != motATrouver) {
                System.out.println("cette lettre n'est pas dans le mot choisi");
                nombreEssai++;
            } else {
                gagne = true;
                System.out.println("Bravo ! Vous avez deviné le Mot " + motATrouver +" en "+ nombreEssai + " essais");

            }if (nombreEssai>7){
                System.out.println("le mot etait " + motATrouver);
                System.out.println("Game Over !");break;
            }
          
            
          
        }
    }
}
