package ru.crud.dao;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "book")
public class Book {

    public Book() {
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title", columnDefinition = "varchar(100)")
    private String title;

    @Column(name = "description", columnDefinition = "varchar(255)")
    private String description;

    @Column(name = "author", columnDefinition = "varchar(100)")
    private String author;

    @Column(name = "isbn", columnDefinition = "varchar(20)")
    private String isbn;

    @Column(name = "printYear", columnDefinition = "int(11)")
    private Integer printYear;

    @Column(name = "readAlready", columnDefinition = "tinyint(1) not null default 0")
    private Boolean readAlready;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getPrintYear() {
        return printYear;
    }

    public void setPrintYear(Integer printYear) {
        this.printYear = printYear;
    }

    public Boolean getReadAlready() {
        return readAlready;
    }

    public void setReadAlready(Boolean readAlready) {
        this.readAlready = readAlready;
    }
}
