/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ao.co.a2x.library.model;

/**
 *
 * @author scherman
 */
public class Book {
    
    private String title;
    private int edition;
    private int releaseYear;
    private String serialNumber;
    
    private Author author;
    private PublishingCompany publishinCompany;
    
    public String getTitle() {
        
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public PublishingCompany getPublishinCompany() {
        return publishinCompany;
    }

    public void setPublishinCompany(PublishingCompany publishinCompany) {
        this.publishinCompany = publishinCompany;
    }
    
    
}
