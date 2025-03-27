package clase;

public interface IBuilder {
    Rezervare buildRezervate();

    IBuilder setAsezareGeam(Boolean asezareGeam);
    IBuilder setScauneErgonomice(Boolean scauneErgonomice);
    IBuilder setGenMuzica(String genMuzica);
    IBuilder setNumeClient(String numeClient);

}
