package com.mycompany.lab02_421429979;


public abstract class Book implements LibraryItem {
    private String title;
    private String author;
    private boolean checkedOut;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.checkedOut = false;
    }

    @Override
    public void checkOut() {
        checkedOut = true;
    }

    @Override
    public void checkIn() {
        checkedOut = false;
    }

    @Override
    public boolean isCheckedOut() {
        return checkedOut;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

