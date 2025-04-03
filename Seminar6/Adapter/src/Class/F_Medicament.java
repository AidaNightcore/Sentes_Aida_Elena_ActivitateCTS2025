package Class;

public class F_Medicament {
    private String NumeMedicament;
    private float pret;
    private int cantitate;

    private String expirare;

    public F_Medicament(String numeMedicament, float pret, int cantitate, String expirare) {
        NumeMedicament = numeMedicament;
        this.pret = pret;
        this.cantitate = cantitate;
        this.expirare = expirare;
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

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public String getExpirare() {
        return expirare;
    }

    public void setExpirare(String expirare) {
        this.expirare = expirare;
    }

    public void cumparaMedicament(){
        System.out.println("S-a cumparat medicamentul" + getNumeMedicament() + "cu pretul de" + getPret() + " in cant de" + getCantitate()+ "expirand la data de" +getExpirare());
        this.cantitate--;
    }

}
