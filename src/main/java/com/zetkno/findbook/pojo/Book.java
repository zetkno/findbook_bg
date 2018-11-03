package com.zetkno.findbook.pojo;

import java.util.Date;

public class Book {
    private Integer bookId;

    private String bookName;

    private String bookEngName;

    private String author;

    private String translator;

    private Byte bookType;

    private String bookNum;

    private String publishHours;

    private Date publishDate;

    private String introduce;

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

    public Byte getBookType() {
        return bookType;
    }

    public void setBookType(Byte bookType) {
        this.bookType = bookType;
    }

    public String getBookNum() {
        return bookNum;
    }

    public void setBookNum(String bookNum) {
        this.bookNum = bookNum == null ? null : bookNum.trim();
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