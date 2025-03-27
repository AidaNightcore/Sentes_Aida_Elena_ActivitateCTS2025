package clase;

public class Rezervare {
    @Override
    public String toString() {
        return "Rezervare{" +
                "numeClient='" + numeClient + '\'' +
                ", asezareGeam=" + asezareGeam +
                ", scauneErgonomice=" + scauneErgonomice +
                ", decorareMasa=" + decorareMasa +
                ", genMuzica='" + genMuzica + '\'' +
                '}';
    }

    private String numeClient;
    private Boolean asezareGeam;
    private Boolean scauneErgonomice;
    private Boolean decorareMasa;
    private String genMuzica;

    public Rezervare(String numeClient, Boolean asezareGeam, Boolean scauneErgonomice, Boolean decorareMasa, String genMuzica) {
        this.numeClient = numeClient;
        this.asezareGeam = asezareGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareMasa = decorareMasa;
        this.genMuzica = genMuzica;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public Boolean getAsezareGeam() {
        return asezareGeam;
    }

    public void setAsezareGeam(Boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
    }

    public Boolean getScauneErgonomice() {
        return scauneErgonomice;
    }

    public void setScauneErgonomice(Boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public Boolean getDecorareMasa() {
        return decorareMasa;
    }

    public void setDecorareMasa(Boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }
}
