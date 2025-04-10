package clase;

public interface ICameraSpitalBuilder {
    public CameraSpital build();

    public ICameraSpitalBuilder setPatRabatabil(Boolean patRabatabil);
    public ICameraSpitalBuilder setMicDejun(Boolean micDejun);
    public ICameraSpitalBuilder setPapuci(Boolean papuci);
    public ICameraSpitalBuilder setHalat(Boolean halat);

    public CameraSpital getCameraSpital();
}


