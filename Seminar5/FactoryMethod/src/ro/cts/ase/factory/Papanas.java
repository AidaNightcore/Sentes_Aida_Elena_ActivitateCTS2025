package ro.cts.ase.factory;

public class Papanas extends FelMancare{
    private String crema;

    public Papanas(float pret, int nrCalorii, String crema) {
        super(pret, nrCalorii);
        this.crema = crema;
    }
}
