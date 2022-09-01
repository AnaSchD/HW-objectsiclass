public class Book {


    String nameBook;
    Author author;
    int publicationYear;

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

    public void setPublicationYear (int publicationYear1) {
       this.publicationYear = publicationYear1;
    }

}

