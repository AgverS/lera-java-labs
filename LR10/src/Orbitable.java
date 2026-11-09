public interface Orbitable {
    void orbit();
    double getOrbitTime();


    static String formatOrbitTime(double days) {
        if (days >= 365) {
            return String.format("%.2f земных лет", days / 365.0);
        }
        return String.format("%.1f земных суток", days);
    }
}
























//public interface Vehicle {
//    // 1. Константа (public static final)
//    int MAX_SPEED = 200;
//
//    // 2. Абстрактные методы (public abstract)
//    void start();
//    int getSpeed();
//
//    // 3. Default-метод
//    default void info() {
//        System.out.println(format("Скорость: " + getSpeed()));
//    }
//
//    // 4. Static-метод (Java 8+) - вызывается через имя интерфейса
//    static boolean isSpeedAllowed(int speed) {
//        return speed <= MAX_SPEED;
//    }
//
//    // 5. Private-метод
//    private String format(String text) {
//        return "[Vehicle] " + text;
//    }
//}







// public interface ElectricVehicle extends Vehicle {
//    void charge(int percent);
//    int getBattery();
//}








//public class ElectricCar implements ElectricVehicle {
//    private String model;
//    private int speed;
//    private int battery;
//    public ElectricCar(String model, int battery) {
//        this.model = model;
//        this.battery = battery;
//    }
//    @Override
//    public void start() {
//        speed = 60;
//        System.out.println(model + " поехала");
//    }
//    @Override
//    public int getSpeed() {
//        return speed;
//    }
//    @Override
//    public void charge(int percent) {
//        battery = Math.min(100, battery + percent);
//        System.out.println(model + " заряжена до " + battery + "%");
//    }
//    @Override
//    public int getBattery() {
//        return battery;
//    }
//    // Переопределение default-метода
//    @Override
//    public void info() {
//        Vehicle.super.info();
//        System.out.println(model + ", заряд: " + battery + "%");
//    }
//}







//public class Main {
//    public static void main(String[] args) {
//        ElectricCar car = new ElectricCar("Tesla", 50);
//        System.out.println("Макс. скорость: " + Vehicle.MAX_SPEED);
//        // Static-метод интерфейса
//        System.out.println("120 разрешено? " + Vehicle.isSpeedAllowed(120));
//        System.out.println("250 разрешено? " + Vehicle.isSpeedAllowed(250));
//        // Ссылка типа интерфейса (полиморфизм)
//        ElectricVehicle ev = car;
//        ev.start();       // из Vehicle
//        ev.charge(30);    // из ElectricVehicle
//        ev.info();        // переопределённый default-метод
//        Vehicle v = car;  // можно и через родительский интерфейс
//        v.info();
//        // Vehicle v2 = new Vehicle(); // ОШИБКА: нельзя создать объект интерфейса
//    }
//}