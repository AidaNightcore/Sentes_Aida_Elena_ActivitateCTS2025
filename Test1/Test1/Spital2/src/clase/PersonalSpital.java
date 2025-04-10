package clase;

public abstract class PersonalSpital {
    protected String numePersoana;

    public String getNumePersoana() {
        return numePersoana;
    }

    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public PersonalSpital(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public abstract void getPersoana();
}
