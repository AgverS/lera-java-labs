public class Software {
    private String name;
    private String version;
    private double price;

    public Software(String name, String version, double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public String getName() { return name; }
    public String getVersion() { return version; }
    public double getPrice() { return price; }

    public String install() {
        return "Устанавливаю";
    }

    public String install(String path) {
        return "Устанавливаю в " + path;
    }

    public String install(int size) {
        return "Устанавливаю размером " + size + " ГБ";
    }

    public String getRequirements() {
        return "Стандартные требования";
    }

    @Override
    public String toString() {
        return name + " v" + version + " (" + price + " руб.)";
    }
}