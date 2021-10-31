package ru.skillbox;

 class Book2 {
    private final String name;
    private final String author;
    private final int numberOfPages;
    private final int numberISB;

     public String getName() {
         return name;
     }

     public String getAuthor() {
         return author;
     }

     public int getNumberOfPages() {
         return numberOfPages;
     }

     public int getISBNumber() {
         return numberISB;
     }

     public Book2(String name, String author, int numberOfPages, int ISBNumber) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.numberISB = ISBNumber;
    }

}
