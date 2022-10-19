package com.nestdigital.libraryApp.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libraries")

public class LibraryModel {
@Id
@GeneratedValue
    private int id;
    private int bookcode;
    private String bookname;
    private String booktype;
    private String authorname;
    private String issuedate;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookcode() {
        return bookcode;
    }

    public void setBookcode(int bookcode) {
        this.bookcode = bookcode;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(String issuedate) {
        this.issuedate = issuedate;
    }

    public LibraryModel() {
    }

    public LibraryModel(int id, int bookcode, String bookname, String booktype, String authorname, String issuedate) {
        this.id = id;
        this.bookcode = bookcode;
        this.bookname = bookname;
        this.booktype = booktype;
        this.authorname = authorname;
        this.issuedate = issuedate;
    }
}
