package clase;

public class CameraSpital{
    private String numePacient;
    private Boolean patRabatabil;
    private Boolean micDejun;
    private Boolean papuci;
    private Boolean halat;

    public CameraSpital(String numePacient, Boolean patRabatabil, Boolean micDejun, Boolean papuci, Boolean halat) {
        this.numePacient = numePacient;
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuci = papuci;
        this.halat = halat;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }


    public Boolean getPatRabatabil() {
        return patRabatabil;
    }

    public void setPatRabatabil(Boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public Boolean getMicDejun() {
        return micDejun;
    }

    public void setMicDejun(Boolean micDejun) {
        this.micDejun = micDejun;
    }

    public Boolean getPapuci() {
        return papuci;
    }

    public void setPapuci(Boolean papuci) {
        this.papuci = papuci;
    }

    public Boolean getHalat() {
        return halat;
    }

    public void setHalat(Boolean halat) {
        this.halat = halat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CameraSpital{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", patRabatabil=").append(patRabatabil);
        sb.append(", micDejun=").append(micDejun);
        sb.append(", papuci=").append(papuci);
        sb.append(", halat=").append(halat);
        sb.append('}');
        return sb.toString();
    }
}
