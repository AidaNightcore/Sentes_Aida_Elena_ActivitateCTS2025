package fabrici;

import ro.cts.ase.factory.FelMancare;

public interface TipMancareFactory {
    FelMancare preparaFelMancare(TipMancare tipMancare, float pret, int nrCalorii);
}
