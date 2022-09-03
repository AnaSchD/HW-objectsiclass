public class Author {

     private String nameAuthor;
     private String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {

        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;

    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getSurnameAuthor() {
        return surnameAuthor;
    }

    public String toString() {
        return " " + nameAuthor + " " + surnameAuthor;
    }

    public boolean equals(Author author1) {
        if (nameAuthor.equals(author1.getNameAuthor()) && surnameAuthor.equals(author1.getSurnameAuthor())) {
            return true;
        } else {
            return false;
        }
    }
    public int hashCode() {
        return java.util.Objects.hash(this.nameAuthor) + java.util.Objects.hash(this.surnameAuthor);
    }
}
