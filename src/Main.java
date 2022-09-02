public class Main {


    public static void main(String[] args) {


        Author author1 = new Author("Viktor", "Frankl");
        Book book = new Book("Say yes to life", author1, 2012);

        Author author2 = new Author("Mona", "Kasten");
        Book book1 = new Book("Save you", author2, 2019);

        System.out.println(book.getPublicationYear());

        book.setPublicationYear(2015);
        System.out.println("book.getPublicationYear() = " + book.getPublicationYear());


    }
}