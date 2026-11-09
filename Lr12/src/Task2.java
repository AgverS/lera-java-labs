import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<AudioBook> books = new ArrayList<>(List.of(
                new AudioBook(1, "Тайны леса", "Иван Петров", 3, List.of(5, 4, 4, 5)),
                new AudioBook(1, "айны леса", "Иван Петров", 3, List.of(5, 4, 4, 5)),
                new AudioBook(2, "Путь к звёздам", "Анна Смирнова", 2, List.of(2, 3, 2, 1)),
                new AudioBook(3, "Ночной город", "Олег Соколов", 4, List.of(4, 4, 5, 4)),
                new AudioBook(4, "Река времени", "Мария Волкова", 3, List.of(3, 3, 4, 3)),
                new AudioBook(5, "Тень прошлого", "Сергей Лебедев", 1, List.of(2, 1, 2, 2)),
                new AudioBook(6, "Последний рассвет", "Елена Попова", 5, List.of(3, 4, 3, 2))
        ));

        System.out.println("=== Исходный список ===");
        books.forEach(System.out::println);

        // 1. Удалить аудиокниги со средним рейтингом < 3
        books.removeIf(b -> b.getAverageRating() < 3);
        System.out.println("\n=== После удаления (средний рейтинг < 3) ===");
        books.forEach(System.out::println);

        // 2. Повысить рейтинг аудиокниг со средним рейтингом >= 4
        for (AudioBook b : books) {
            if (b.getAverageRating() >= 4) {
                b.setRating(b.getRating() + 1);
            }
        }
        System.out.println("\n=== После повышения рейтинга (средний >= 4) ===");
        books.forEach(System.out::println);

        // 3. Печать аудиокниг с заданным рейтингом
        System.out.println("\n=== Аудиокниги с рейтингом 4 ===");
        printAudioBooks(books, 4);

        // 4. Сортировка по убыванию среднего рейтинга, при равенстве — по названию
        //books.sort(Comparator.comparingDouble(AudioBook::getAverageRating).reversed().thenComparing(AudioBook::getTitle).reversed());
        books.sort(Comparator.comparingDouble(AudioBook::getAverageRating).reversed().thenComparing(Comparator.comparing(AudioBook::getTitle).reversed())
        );

        System.out.println("\n=== Отсортированный список (ID, название, средний рейтинг) ===");
        for (AudioBook b : books) {
            System.out.printf("ID: %d, \"%s\", средний рейтинг: %.2f%n",
                    b.getId(), b.getTitle(), b.getAverageRating());
        }
    }

    public static void printAudioBooks(List<AudioBook> books, int rating) {
        boolean found = false;
        for (AudioBook b : books) {
            if (b.getRating() == rating) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Аудиокниг с рейтингом " + rating + " не найдено.");
        }
    }
}
