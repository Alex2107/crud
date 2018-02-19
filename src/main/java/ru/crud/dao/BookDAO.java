package ru.crud.dao;

import java.util.List;

public interface BookDAO {

    public void addBook(Book book);
    public void updateBook(Book book);
    public void removeBook(int ID);
    public Book getBookByID(int ID);
    public List<Book> getBooks();
}
