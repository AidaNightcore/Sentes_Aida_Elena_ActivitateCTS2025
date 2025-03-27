package clase;

public class RezervareBuilder implements IBuilder{
    private Boolean asezareGeam;
    private Boolean scauneErgonomice;
    private Boolean decorareMasa;
    private String genMuzica;

    @Override
    public Rezervare buildRezervate(String numeClient) {
        return new Rezervare(numeClient, this.asezareGeam, this.scauneErgonomice, this.decorareMasa, this.genMuzica);
    }

    @Override
    public IBuilder setAsezareGeam(Boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
        return this;
    }

    @Override
    public IBuilder setScauneErgonomice(Boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
        return this;
    }

    @Override
    public IBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    @Override
    public IBuilder setDecorareMasa(Boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
        return this;
    }

    @Override
    public IBuilder setNumeClient(String numeClient) {
        return null;
    }
}
