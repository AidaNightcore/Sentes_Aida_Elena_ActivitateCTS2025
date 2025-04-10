package clase;

public class CameraSpitalBuilder implements ICameraSpitalBuilder{
    CameraSpital cameraSpital;

    public CameraSpitalBuilder(String numePacient) {
        cameraSpital = new CameraSpital(numePacient, false, false, false, false);
    }

    @Override
    public CameraSpital build() {
        return cameraSpital;
    }

    @Override
    public ICameraSpitalBuilder setPatRabatabil(Boolean patRabatabil) {
        this.cameraSpital.setPatRabatabil(patRabatabil);
        return this;
    }

    @Override
    public ICameraSpitalBuilder setMicDejun(Boolean micDejun) {
        this.cameraSpital.setMicDejun(micDejun);
        return this;
    }

    @Override
    public ICameraSpitalBuilder setPapuci(Boolean papuci) {
        this.cameraSpital.setPapuci(papuci);
        return this;
    }

    @Override
    public ICameraSpitalBuilder setHalat(Boolean halat) {
        this.cameraSpital.setHalat(halat);
        return this;
    }

    @Override
    public CameraSpital getCameraSpital() {
        return this.cameraSpital;
    }
}
