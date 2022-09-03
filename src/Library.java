public class Library {

    private Book[] books;

    public Library(int sizeArray) {
        books = new Book[sizeArray];
    }

    public void addBook(Book book) {

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
            if (books[books.length - 1] != null) {
                throw new RuntimeException("Массив полный");
            }
        }
    }

    public void informationBook (String nameBook) {
            for (int i = 0; i < books.length; i++)
            {
                if (books[i] == null) {

                }

                    if (books[i].getNameBook().equals(nameBook)) {
                        System.out.println(books[i]);
                        return;
                    }
                }
            }


    public void changeYear (String nameBook, int newPublicationYear) {
        for (int i = 0; i < books.length; i++){
            if (books[i] == null) {

            }
            if (books[i].getNameBook().equals(nameBook)) {
                books[i].setPublicationYear(newPublicationYear);
                return;
            }
        }
    }


}

