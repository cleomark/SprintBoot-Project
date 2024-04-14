package com.cleo.libraryapp.web;

import com.cleo.libraryapp.Book;
import com.cleo.libraryapp.LibraryManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class LibraryController {
    private final LibraryManager libraryManager;

    public LibraryController(LibraryManager libraryManager) {
        this.libraryManager = libraryManager;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("books", libraryManager.getAllBooks());
        return "index";
    }

    @PostMapping("/add")
    public String addBook(@RequestParam("title") String title,
                          @RequestParam("author") String author,
                          @RequestParam("year") int year) {
        Book book = new Book(title, author, year);
        libraryManager.addBook(book);
        return "redirect:/";
    }
}
