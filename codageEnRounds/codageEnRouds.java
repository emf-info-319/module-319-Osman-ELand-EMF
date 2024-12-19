public class codageEnRouds {

    public final static String[] Eleve = new String[] { "Jean", "Paul", "Matthieu", "Jacques", "Louis", "Emile", "Eric",
            "Julien", "Yvan", "Philippe" };

    public static void main(String[] args) {
        String[] groupe = creerGroupe(4);
        
        System.out.println("Le groupe créé contient les élèves suivants:");
        for (String eleve : groupe) {
            System.out.println(eleve);
        }
    }

    public static String choisirEleve() {
        int nomAleatoir = (int) Math.random() * (Eleve.length - 0 + 1) + 0;

        return Eleve[nomAleatoir];
    }

    public static boolean controlerDoublon(String[] Groupe, String nom) {
        boolean present = false;
        for (int i = 0; i < Groupe.length; i++) {
            if (Groupe[i] == (nom)) {
                present = true;
            }
        }
        return present;
    }

    public static String[] creerGroupe(int nombre) {
        String[] Groupe = new String[nombre];
        int compteur = 0;
        while (compteur < Groupe.length) {
            String Eleve = choisirEleve();
            boolean estDedans = controlerDoublon(Groupe, Eleve);
            if (estDedans == false) {
                Groupe[compteur] = Eleve;
            } else {
                while (estDedans == true) {
                    Eleve = choisirEleve();
                    estDedans = controlerDoublon(Groupe, Eleve);
                    if (!estDedans) {
                        Groupe[0] = Eleve;
                    }
                }
                compteur++;
            }
        }
        return Groupe;
    }
}