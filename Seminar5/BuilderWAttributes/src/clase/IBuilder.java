package clase;

public interface IBuilder {
    Rezervare buildRezervate(String numeClient);

    IBuilder setAsezareGeam(Boolean asezareGeam);
    IBuilder setScauneErgonomice(Boolean scauneErgonomice);
    IBuilder setGenMuzica(String genMuzica);

    IBuilder setDecorareMasa(Boolean decorareMasa);

    IBuilder setNumeClient(String numeClient);

}
