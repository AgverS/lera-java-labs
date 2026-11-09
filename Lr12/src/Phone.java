public class Phone extends Device {
    private int camera; // Мпикс

    public Phone(String model, int id, double power, int camera) {
        super(model, id, power);
        this.camera = camera;
    }

    @Override
    public String toString() {
        return super.toString() + ", camera=" + camera + " Мп}";
    }
}
