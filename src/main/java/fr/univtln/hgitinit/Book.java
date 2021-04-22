package fr.univtln.hgitinit;

public class Book {
    private int idBook;
    private String nameBook;

    public Book() {
    }

    public Book(int idBook, String nameBook) {
        this.idBook = idBook;
        this.nameBook = nameBook;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", nameBook='" + nameBook + '\'' +
                '}';
    }
}
