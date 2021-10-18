/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ao.co.a2x.library.model.services;

import ao.co.a2x.library.model.Author;
import ao.co.a2x.library.model.Book;
import ao.co.a2x.library.model.PublishingCompany;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author scherman
 */
public class DataBase {

    private List<Book> books;
    private List<Author> authors;
    private List<PublishingCompany> publishinCompanies;

    public DataBase() {
        authors = new ArrayList<>();
        publishinCompanies = new ArrayList<>();
        books = new ArrayList<>();
    }

    public boolean createAuthor(Author author) {
        return authors.add(author);
    }

    public Author getAuthor(String name) {
        for (Author author : authors) {
            if (author.getName().equalsIgnoreCase(name)) {
                return author;
            }
        }
        return null;
    }

    public boolean deleteAuthor(Author author) {
        if (authors.contains(author)) {
            return authors.remove(author);
        }
        return false;
    }

    public Author updateAuthor(Author author) {
        if (authors.contains(author)) {
            deleteAuthor(author);
            authors.add(author);

        }
        return author;
    }
}
