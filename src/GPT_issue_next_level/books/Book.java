package GPT_issue_next_level.books;

/*
Задача: Фильтрация книг
Каждая книга имеет следующие атрибуты:
                                    title (название книги, строка)
                                    author (автор книги, строка)
                                    genre (жанр книги, строка)
                                    price (цена книги, число с плавающей точкой)
                                    rating (рейтинг книги, число с плавающей точкой)

 */
public class Book {
    private String title, author, genre;
    private Double price, rating;

    public Book(String title, String author, String genre, Double price, Double rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Книга: " + title +" ( +" +genre+ "), Автор "
                + author +", цена: " + price + ", оценка - " + rating;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
