package clase;

public class Medic extends PersonalSpital {
    private String specialitate;

    public Medic(String numePersoana, String specialitate) {
        super(numePersoana);
        this.specialitate =specialitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append("specialitate='").append(specialitate).append('\'');
        sb.append(", numePersoana='").append(numePersoana).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void getPersoana() {
        System.out.println(this.toString());
    }
}
