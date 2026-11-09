public class Editor extends Software {
    private String format;

    public Editor(String name, String version, double price, String format) {
        super(name, version, price);
        this.format = format;
    }

    public String getFormat() { return format; }

    // Переопределение
    @Override
    public String getRequirements() {
        return "Низкие требования";
    }

    // Собственный перегруженный метод
    public String install(String path, boolean addToMenu) {
        return "Устанавливаю в " + path + (addToMenu ? " и добавляю в меню" : "");
    }
}
