package fabrici;

import ro.cts.ase.factory.FelMancare;
import ro.cts.ase.factory.SupaCiuperci;
import ro.cts.ase.factory.SupaLegume;

public class SupaFactory implements TipMancareFactory{

    private int cantitate;

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public FelMancare preparaFelMancare(TipMancare tipMancare, float pret, int nrCalorii) {
        return switch (tipMancare){
            case Supa.SupaCiuperci-> new SupaCiuperci(pret,nrCalorii, this.cantitate);
            case Supa.SupaLegume->new SupaLegume(pret,nrCalorii, this.cantitate);
            default -> null;
        };
    }

}
