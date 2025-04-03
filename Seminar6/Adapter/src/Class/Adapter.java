package Class;

public class Adapter extends F_Medicament {
    private S_Medicament medicamentS;

    public Adapter(String numeMedicament, float pret, int cantitate, String expirare) {
        super(numeMedicament, pret, cantitate, expirare);
    }

    public Adapter(S_Medicament medicamentS){
        super(medicamentS.getNumeMedicament(),
                medicamentS.getPret(),
                30,
                "01/2027");

        this.medicamentS = medicamentS;
    }

    @Override
    public void cumparaMedicament() {
        medicamentS.achizitioneazaMedicament();
    }
}
