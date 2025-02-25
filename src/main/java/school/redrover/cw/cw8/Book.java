package school.redrover.cw.cw8;

import java.util.Arrays;

public class Book {

    private final String isbn;
    private final String title;
    private final String[] author;
    private final int noOfPAges;

    private static String border = "================================";

    public Book(String isbn, String title, String[] author, int noOfPAges) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.noOfPAges = noOfPAges;
    }

    public static void setBorder(String border) {
        Book.border = border;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String[] getAuthor() {
        return author;
    }

    public int getNoOfPAges() {
        return noOfPAges;
    }

    public String makeCatalogCard() {

        return "Title: " + getTitle() + "\n" +
                "Author: " + Arrays.toString(getAuthor()) + "\n" +
                getNoOfPAges() + " pages, ISBN: " + getIsbn() + "\n" + border;
    }

    public boolean isValid(){
        return validateIsbn(this.isbn);
    }

    static boolean validateIsbn(String isbn) {

        return isbn.length() == 10 || isbn.length() == 13;
    }
}