public class Book {

    private String nameBook;
    private Author author;
    private int publicationYear;

    public Book (String nameBook, Author author, int publicationYear) {
        this.nameBook = nameBook;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear (int publicationYear1) {
       this.publicationYear = publicationYear1;
    }

    @Override
    public String toString() {
        return nameBook + author + " " + publicationYear;
    }

    public boolean equals (Book book) {
        if (this.nameBook.equals(book.getNameBook()) && this.publicationYear == book.getPublicationYear()) {
            if (this.author.equals(book.getAuthor())) {
                return true;
            }
        }  return false;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(this.nameBook) + java.util.Objects.hash(this.publicationYear) + java.util.Objects.hash(this.author);
    }
}

