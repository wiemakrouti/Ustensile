class Cuillere extends Ustensile {
    public Cuillere(int anneeFabrication) {
        super(anneeFabrication);
    }

    @Override
    public double calculerValeur(int anneeActuelle) {
        int age = anneeActuelle - getAnneeFabrication();
        return age > 50 ? age - 50 : 0;
    }
}