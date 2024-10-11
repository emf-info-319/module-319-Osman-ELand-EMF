
import java.util.Scanner;

public class JeuDuPondue {

    public static void main(String[] args) {                                          
        String[] tabeauDeMot = { "apple", "bread", "chair", "dance", "eagle", "flame", "grape", "house", "input", "jelly",
        "knife", "lemon", "mouse", "night", "ocean", "piano", "queen", "robot", "snake", "tiger",
        "ultra", "vivid", "whale", "xenon", "yacht", "zebra", "angel", "beach", "candy", "dream",
        "earth", "frost", "giant", "happy", "ideal", "jolly", "karma", "lucky", "magic", "noble",
        "olive", "pearl", "quiet", "raven", "smile", "trust", "unity", "vocal", "witty", "xylos"};    

        int index = (int) (Math.random() * (tabeauDeMot.length)); 
        
        String motATrouver = tabeauDeMot[index]; 
        


        String tentative = ""; 
        

        int nombreEssai = 0;                                                           
        
        boolean gagne = false;      

        System.out.println("Bienvenu dans le jeu du Pendue !");                      
        System.out.println("J'ai choisi un Mot aléatoirement.");                     
        System.out.println("Essaye de le deviner !"); 

        Scanner scanner = new Scanner (System.in); 

        while (!gagne) {                                                              
            System.out.println("Entrez votre lettre _ _ _ _ _ "); 
                                                                                  
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
