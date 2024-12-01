class AssietteCarree extends Assiette {
    private double cote;

    public AssietteCarree(int anneeFabrication, double cote) {
        super(anneeFabrication);
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    @Override
    public double calculerValeur(int anneeActuelle) {
        int age = anneeActuelle - getAnneeFabrication();
        double valeurRonde = age > 50 ? age - 50 : 0;
        return 5 * valeurRonde;
    }

    @Override
    public double calculerSurface() {
        return cote * cote;
    }
}
