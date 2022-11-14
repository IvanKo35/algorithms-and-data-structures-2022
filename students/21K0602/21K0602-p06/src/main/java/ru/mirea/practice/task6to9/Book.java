package ru.mirea.practice.task6to9;


public class Book implements Printable {
    private final  String name;
    private final String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }


    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", author='" + author + '\'' + '}';
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}
