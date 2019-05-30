package Question1;

public class Book {

    private String name;
    private int price;
    private Author author;

    public Book(String name, int price, Author author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }//constructor

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String whoIsTheAuthor() {
        return author.getName();
    }
}
