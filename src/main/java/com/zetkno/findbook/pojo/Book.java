package com.zetkno.findbook.pojo;

import java.util.Date;

public class Book {
    private Integer bookId;

    private String bookName;

    private String bookEngName;

    private String author;

    private String translator;

    private Long category;

    private String bookNumber;

    private String publishHours;

    private Date publishDate;

    private String introduce;

    private BookType bookType;

    public Book() {

    }

    public Book(Integer bookId, String bookName,
                String bookEngName, String author,
                String translator, Long category,
                String bookNumber, String publishHours,
                Date publishDate, String introduce,
                BookType bookType) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookEngName = bookEngName;
        this.author = author;
        this.translator = translator;
        this.category = category;
        this.bookNumber = bookNumber;
        this.publishHours = publishHours;
        this.publishDate = publishDate;
        this.introduce = introduce;
        this.bookType = bookType;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookEngName() {
        return bookEngName;
    }

    public void setBookEngName(String bookEngName) {
        this.bookEngName = bookEngName == null ? null : bookEngName.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator == null ? null : translator.trim();
    }

    public Long getCategory() {
        return category;
    }

    public void setCategory(Long category) {
        this.category = category;
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber == null ? null : bookNumber.trim();
    }

    public String getPublishHours() {
        return publishHours;
    }

    public void setPublishHours(String publishHours) {
        this.publishHours = publishHours == null ? null : publishHours.trim();
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }
}