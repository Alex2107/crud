package ru.crud.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class BookImpl implements BookDAO {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addBook(Book book)
    {
        this.sessionFactory.getCurrentSession().persist(book);
        //session.persist(book);
        //logger.info("Book succesfully added"+ book);
    }

    @Override
    public void updateBook(Book book)
    {
        //Session session =
        this.sessionFactory.getCurrentSession().update(book);;
        //session.update(book);
        //logger.info("Book succesfully updated"+ book);
    }

    @Override
    public void removeBook(int ID)
    {
        Session session = this.sessionFactory.getCurrentSession();
        Book book = (Book) session.get(ru.crud.dao.Book.class,new Integer (ID));

        if (book != null)
            session.delete(book);
        //logger.info("Book succesfully removed"+ book);
    }

    @Override
    public List<Book> getBooks() {
        List<Book> books = sessionFactory.getCurrentSession().createCriteria(Book.class)
                .list();

        return books;
    }

    @Override
    public Book getBookByID(int id) {
        return (Book) sessionFactory.getCurrentSession().get(Book.class, id);
    }


}
