public class Main {


    public static void main(String[] args) {


        Author author1 = new Author("Viktor", "Frankl");
        Book book2 = new Book("Say yes to life", author1, 2012);
        Book book3 = new Book("Say yes to life", author1, 2012);

        Author author2 = new Author("Mona", "Kasten");
        Book book1 = new Book("Save you", author2, 2019);

       // System.out.println(book2.getPublicationYear());

        /* book2.setPublicationYear(2015);
         System.out.println("book.getPublicationYear() = " + book2.getPublicationYear());*/

//        Book[] books = new Book[5];
//        books[0] = book2;
//        books[1] = book1;


        Library nasti = new Library(7);
        nasti.addBook(book1);
        nasti.addBook(book1);
        nasti.addBook(book2);
        nasti.addBook(book1);
        nasti.addBook(book1);



        nasti.informationBook("Say yes to life");
        nasti.changeYear("Say yes to life", 2022);
        System.out.println();
        nasti.informationBook("Say yes to life");
        }




}



