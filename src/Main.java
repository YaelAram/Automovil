public class Main {
    public static void main(String[] args) {
        Automovil automovil = new Automovil("Tesla", "Model S", 2023, 0, Automovil.TRANSMISION_AUTOMATICA);

        System.out.println("automovil = " + automovil);

        automovil.setMarca("Nissan");
        automovil.setSubmarca("Leaf");
        automovil.setAnio(2022);
        automovil.setKilometraje(100);
        automovil.setTransmision(Automovil.TRANSMISION_MANUAL);

        System.out.println("automovil = " + automovil);


    }
}