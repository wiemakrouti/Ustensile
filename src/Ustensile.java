
abstract class Ustensile {
    private int anneeFabrication;

    public Ustensile(int anneeFabrication) {
        this.anneeFabrication = anneeFabrication;
    }

    public int getAnneeFabrication() {
        return anneeFabrication;
    }

    public void setAnneeFabrication(int anneeFabrication) {
        this.anneeFabrication = anneeFabrication;
    }

    public abstract double calculerValeur(int anneeActuelle);
}

