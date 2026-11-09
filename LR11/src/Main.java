public class Main {

    static String describe(Software s) {
        return "describe(Software)";
    }

    static String describe(Game g) {
        return "describe(Game)";
    }

    public static void main(String[] args) {
        Software base = new Software("Notepad", "1.0", 0);
        Game game = new Game("Cyberpunk", "2.1", 2500, "RPG", 16);
        Editor editor = new Editor("VS Code", "1.9", 0, ".java");

        // 1. Перегрузка
        System.out.println("=== Перегрузка ===");
        System.out.println(base.install());
        System.out.println(base.install("C:/Programs"));
        System.out.println(base.install(5));
        System.out.println(game.install("D:/Games", 70));        // свой метод Game
        System.out.println(editor.install("C:/Tools", true));    // свой метод Editor
        System.out.println(game.getRequirements(8));             // своя перегрузка


        System.out.println("\n Переопределение");
        Software[] list = {base, game, editor};
        for (Software s : list) {
            // версия getRequirements() выбирается во время выполнения
            System.out.println(s + " -> " + s.getRequirements());
        }


        System.out.println("\n Статический vs динамический ");
        Software s = new Game("Doom", "1.0", 1500, "Shooter", 8);


        System.out.println("Перегрузка:      " + describe(s));
        System.out.println("Если ссылка Game: " + describe(game));


        System.out.println("Переопределение: " + s.getRequirements());

        // instanceof и приведение типов
        System.out.println("\n instanceof ");
        for (Software item : list) {
            if (item instanceof Game) {
                Game g = (Game) item;   // нисходящее преобразование
                System.out.println(item.getName() + " - игра, жанр: " + g.getGenre()
                        + ", " + g.getRequirements(8));
            } else if (item instanceof Editor) {
                Editor e = (Editor) item;
                System.out.println(item.getName() + " - редактор, формат: " + e.getFormat());
            } else {
                System.out.println(item.getName() + " - обычное ПО");
            }
        }
    }
}

