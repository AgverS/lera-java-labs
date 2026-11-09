package task1;

public class Movie {
        private String title;
        private String director;
        private int year;
        private double rating;

        public Movie(String title, String director, int year, double rating) {
            this.title = title;
            this.director = director;
            this.year = year;
            this.rating = rating;
        }
        public boolean isExcellent() {
            return rating >= 8;
        }

        public void displayInfo() {
            System.out.println("Фильм: \"" + title + "\", режиссёр: " + director
                    + ", год: " + year + ", рейтинг: " + rating);
        }

}
