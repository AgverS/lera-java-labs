public class Tablet extends Device {
    private double screen;

    public Tablet(String model, int id, double power, double screen) {
        super(model, id, power);
        this.screen = screen;
    }

    @Override
    public String toString() {
        return super.toString() + ", screen=" + screen + "\"}";
    }
}
