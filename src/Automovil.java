public class Automovil {
    private String marca;
    private String submarca;
    private int anio;
    private int kilometraje;
    private String transmision;

    public static final String TRANSMISION_MANUAL = "Manual";
    public static final String TRANSMISION_AUTOMATICA = "Automatica";

    public Automovil(String marca, String submarca, int anio, int kilometraje, String transmision){
        this.marca = marca;
        this.submarca = submarca;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.transmision = (!transmision.equals(TRANSMISION_MANUAL) && !transmision.equals(TRANSMISION_AUTOMATICA))
                            ? Automovil.TRANSMISION_MANUAL
                            : transmision;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubmarca() {
        return submarca;
    }

    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", submarca='" + submarca + '\'' +
                ", anio=" + anio +
                ", kilometraje=" + kilometraje +
                ", transmision='" + transmision + '\'' +
                '}';
    }
}
