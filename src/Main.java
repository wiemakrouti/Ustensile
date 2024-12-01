public class Main {
    public static void main(String[] args) {
        int anneeActuelle = 2024;


        Ustensile[] us = new Ustensile[5];
        us[0] = new Cuillere(1943);
        us[1] = new AssietteRonde(1970, 10);
        us[2] = new AssietteCarree(1943, 5);
        us[3] = new Cuillere(1980);
        us[4] = new AssietteRonde(1960, 8);


        afficherCuilleres(us);
        afficherSurfaceAssiettes(us);
        afficherValeurTotale(us, anneeActuelle);
    }

    public static void afficherCuilleres(Ustensile[] us) {
        int count = 0;
        for (Ustensile u : us) {
            if (u instanceof Cuillere) {
                count++;
            }
        }
        System.out.println("Il y a " + count + " cuillères.");
    }

    public static void afficherSurfaceAssiettes(Ustensile[] us) {
        double surfaceTotale = 0;
        for (Ustensile u : us) {
            if (u instanceof Assiette) {
                surfaceTotale += ((Assiette) u).calculerSurface();
            }
        }
        System.out.println("Surface totale des assiettes: " + surfaceTotale);
    }

    public static void afficherValeurTotale(Ustensile[] us, int anneeActuelle) {
        double valeurTotale = 0;
        for (Ustensile u : us) {
            valeurTotale += u.calculerValeur(anneeActuelle);
        }
        System.out.println("Valeur totale de la collection: " + valeurTotale);
    }
}