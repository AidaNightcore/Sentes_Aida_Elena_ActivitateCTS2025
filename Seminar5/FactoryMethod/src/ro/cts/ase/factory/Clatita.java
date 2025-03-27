package ro.cts.ase.factory;

public class Clatita extends FelMancare{
    private String crema;

    public Clatita(float pret, int nrCalorii, String crema) {
        super(pret, nrCalorii);
        this.crema = crema;
    }
}
