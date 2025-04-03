package Class;

public class S_Medicament {
    private String NumeMedicament;
    private float pret;

    public S_Medicament(String numeMedicament, float pret) {
        NumeMedicament = numeMedicament;
        this.pret = pret;
    }

    public String getNumeMedicament() {
        return NumeMedicament;
    }

    public void setNumeMedicament(String numeMedicament) {
        NumeMedicament = numeMedicament;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("S-a cumparat medicamentul" + getNumeMedicament() + "si costa " + getPret());
    }

    public void prezintaReteta(){
            System.out.println("S-a prezentat reteta");

    }
}
