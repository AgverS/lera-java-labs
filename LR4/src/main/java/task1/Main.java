package task1;

public class Main {
        public static void main(String[] args) {
            Movie movie1 = new Movie("Интерстеллар", "Кристофер Нолан", 2014, 8.6);
            Movie movie2 = new Movie("Трансформеры: Месть падших", "Майкл Бэй", 2009, 6.0);

            movie1.displayInfo();
            System.out.println("Отличный фильм? " + (movie1.isExcellent() ? "Да" : "Нет"));
            System.out.println();

            movie2.displayInfo();
            System.out.println("Отличный фильм? " + (movie2.isExcellent() ? "Да" : "Нет"));
        }

}
