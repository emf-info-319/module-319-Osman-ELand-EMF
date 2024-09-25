public class devoir03 {
    public static void main(String[] args) {

        int jour = 24;
        int mois = 9;
        int annee = 2024;
        int resultat = 0;

        switch (mois) { // remplace la variable (arg) part la variable qui va être utiliser
            case 1:
                resultat = jour;

                break;
            case 2:
                resultat = jour + 31; // on ajoute 31 jours (dépend du mois)

                break;
            case 3:
                resultat = jour + 31 + 28;

                break;
            case 4:
                resultat = jour + 31 + 28 + 31;

                break;
            case 5:
                resultat = jour + 31 + 28 + 31 + 30;

                break;
            case 6:
                resultat = jour + 31 + 28 + 31 + 30 + 31;

                break;
            case 7:
                resultat = jour + 31 + 28 + 31 + 30 + 31 + 30;

                break;
            case 8:
                resultat = jour + 31 + 28 + 31 + 30 + 31 + 30 + 31;

                break;
            case 9:
                resultat = jour + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30;

                break;
            case 10:
                resultat = jour + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31;

                break;
            case 11:
                resultat = jour + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30;

                break;
            case 12:
                resultat = jour + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + 31;

                break;
            default:
                break;
        }
        if(annee % 4 == 0 && mois >2) {
            resultat++;
        }


        // Affichage du résultat
        System.out.println("le " + jour + "/" + mois + "/" + annee + " est le jour " + resultat + " de l'an");

    }
}
