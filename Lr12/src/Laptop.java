public class Laptop extends Device {
    private int battery; // Втч

    public Laptop(String model, int id, double power, int battery) {
        super(model, id, power);
        this.battery = battery;
    }

    @Override
    public String toString() {
        return super.toString() + ", battery=" + battery + " Втч}";
    }
}
