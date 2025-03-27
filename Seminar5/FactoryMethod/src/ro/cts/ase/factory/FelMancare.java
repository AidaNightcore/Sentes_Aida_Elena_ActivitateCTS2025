package ro.cts.ase.factory;

public abstract class FelMancare {
    float pret;
    int nrCalorii;
    public FelMancare(float pret, int nrCalorii) {
        this.pret = pret;
        this.nrCalorii = nrCalorii;
    }

    @Override
    public String toString() {
        return "FelMancare{" +
                "pret=" + pret +
                ", nrCalorii=" + nrCalorii +
                '}';
    }


}
