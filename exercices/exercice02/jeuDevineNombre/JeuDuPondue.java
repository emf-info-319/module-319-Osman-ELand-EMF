
import java.util.Scanner;

public class JeuDuPondue {

    public static void main(String[] args) {                                           //main
        Scanner scanner = new Scanner (System.in);                                     //pour scanner notre clavier
        String[] tabeauDeMot = { "apple", "bread", "chair", "dance", "eagle", "flame", "grape", "house", "input", "jelly",
        "knife", "lemon", "mouse", "night", "ocean", "piano", "queen", "robot", "snake", "tiger",
        "ultra", "vivid", "whale", "xenon", "yacht", "zebra", "angel", "beach", "candy", "dream",
        "earth", "frost", "giant", "happy", "ideal", "jolly", "karma", "lucky", "magic", "noble",
        "olive", "pearl", "quiet", "raven", "smile", "trust", "unity", "vocal", "witty", "xylos"};        // un tableau de mot
        int index = (int) (Math.random() * (tabeauDeMot.length));        
        String motATrouver = tabeauDeMot[index];                                     // choisi un mot dans le ableau
        String tentative = "";                                                          //variable pour la lettre quand mets
        int nombreEssai = 0;                                                           //le nombre de fois quand entre une lettre, si trop game over
        boolean gagne = false;                                                         //pour que le jeu continue   
        System.out.println("Bienvenu dans le jeu du Pendue !");                      //debut du jeu
        System.out.println("J'ai choisi un Mot aléatoirement.");                     //il dit j'a choisi un mot
        System.out.println("Essaye de le deviner !");                                //il nous demande de deviner
        
        while (!gagne) {                                                               //boucle 
            System.out.println("Entrez votre lettre _ _ _ _ _ ");                             //il dit écrit une lettre
            //tentative = scanner.nextInt();                                           //la tentative = le clavier
            tentative = scanner.nextLine();
            if (tentative == motATrouver) {                                             //Si la tentative est dans motATrouver => c'est une lettre ok
                System.out.println("cette lettre est dans le mot choisi");
                
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
