package fabrici;

import ro.cts.ase.factory.*;

public class DesertFactory implements TipMancareFactory{
    public String getCrema() {
        return crema;
    }

    public void setCrema(String crema) {
        this.crema = crema;
    }

    private String crema;

    @Override
    public FelMancare preparaFelMancare(TipMancare tipMancare, float pret, int nrCalorii) {
        return switch (tipMancare){
            case Desert.Papanas-> new Papanas(pret,nrCalorii, this.crema);
            case Desert.Clatita->new Clatita(pret,nrCalorii, this.crema);
            case null, default -> null;
        };
    }
}
