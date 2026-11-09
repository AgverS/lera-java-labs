public class Game extends Software {
    private String genre;
    private int ram;   // ГБ

    public Game(String name, String version, double price, String genre, int ram) {
        super(name, version, price);
        this.genre = genre;
        this.ram = ram;
    }

    public String getGenre() { return genre; }

    // Переопределение
    @Override
    public String getRequirements() {
        return "Высокие требования";
    }

    // Собственный перегруженный метод
    public String install(String path, int size) {
        return "Устанавливаю игру в " + path + ", размер " + size + " ГБ";
    }

    // Собственная перегрузка getRequirements (не переопределение: другие параметры)
    public String getRequirements(int ramGb) {
        return ramGb >= ram ? "ОЗУ достаточно" : "Нужно ОЗУ минимум " + ram + " ГБ";
    }
}