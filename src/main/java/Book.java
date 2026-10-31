public class Book {
    private String name;
    private String author;
    private int publishingYear;
    private String isbn;
    private String publisher;

    public Book() {
    }

    public Book(String name, String author, int publishingYear,
                String isbn, String publisher) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "Book{name='" + name + "', author='" + author
                + "', publishingYear=" + publishingYear
                + ", isbn='" + isbn + "', publisher='" + publisher + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        return publishingYear == other.publishingYear
                && java.util.Objects.equals(name, other.name)
                && java.util.Objects.equals(author, other.author)
                && java.util.Objects.equals(isbn, other.isbn)
                && java.util.Objects.equals(publisher, other.publisher);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, author, publishingYear, isbn, publisher);
    }
}