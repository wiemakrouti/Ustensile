class AssietteRonde extends Assiette {
    private double rayon;

    public AssietteRonde(int anneeFabrication, double rayon) {
        super(anneeFabrication);
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerValeur(int anneeActuelle) {
        int age = anneeActuelle - getAnneeFabrication();
        return age > 50 ? age - 50 : 0;
    }

    @Override
    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }
}