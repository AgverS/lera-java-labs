import java.util.ArrayList;
import java.util.List;

public class AudioBook {
    private final int id;
    private final String title;
    private final String author;
    private int rating;
    private final List<Integer> listenerRatings;

    public AudioBook(int id, String title, String author, int rating, List<Integer> listenerRatings) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.listenerRatings = new ArrayList<>(listenerRatings);
    }

    public double getAverageRating() {
        if (listenerRatings.isEmpty()) {
            return 0;
        }
        return listenerRatings.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("AudioBook{id=%d, title='%s', author='%s', rating=%d, средний=%.2f}", id, title, author, rating, getAverageRating());
    }
}
