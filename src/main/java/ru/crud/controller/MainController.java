package ru.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.crud.dao.Book;
import ru.crud.dao.BookDAO;

@Controller
public class MainController {

    @Autowired
    private BookDAO bookDAO;

    @RequestMapping(value = {"/books","","/"}, method = RequestMethod.GET)
    public ModelAndView books() {
        ModelAndView model = new ModelAndView("main1");

        model.addObject("books", bookDAO.getBooks());
        model.addObject("book", new Book());

        return model;
    }

    @RequestMapping(value = "/books/add", method = RequestMethod.POST)
    public String addBook(@ModelAttribute("book") Book book)
    {
        if (book.getId() == null)
            this.bookDAO.addBook(book);
        else
            this.bookDAO.updateBook(book);
        return "redirect:/books";
    }

    @RequestMapping("/remove/{id}")
    public String removeBook(@PathVariable("id") int id)
    {
        this.bookDAO.removeBook(id);
        return "redirect:/books";
    }
    @RequestMapping("/edit/{id}")
    public String editBook(@PathVariable("id") int id, Model model)
    {
        model.addAttribute("book", this.bookDAO.getBookByID(id));
        model.addAttribute("books", this.bookDAO.getBooks());
        return "main1";
    }

    @RequestMapping("/bookdata/{id}")
    public String bookData(@PathVariable("id") int id, Model model)
    {
        model.addAttribute("book", this.bookDAO.getBookByID(id));
        return "bookdata";
    }

}
