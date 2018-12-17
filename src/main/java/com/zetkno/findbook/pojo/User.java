package com.zetkno.findbook.pojo;

import java.util.List;

public class User {
    private Integer userid;

    private String userName;

    private String password;

    private String gender;

    private String phoneNum;

    private Boolean administrator;

    private List<BookType> favoriteType;

    private List<BookType> dailyType;

//    private BookType favoriteType;
//
//    private BookType dailyType;

    private String email;

    private String avator;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public Boolean getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Boolean administrator) {
        this.administrator = administrator;
    }

    public List<BookType> getFavoriteType() {
        return favoriteType;
    }

    public void setFavoriteType(List<BookType> favoriteType) {
        this.favoriteType = favoriteType;
    }

    public List<BookType> getDailyType() {
        return dailyType;
    }

    public void setDailyType(List<BookType> dailyType) {
        this.dailyType = dailyType;
    }


//    public BookType getFavoriteType() {
//        return favoriteType;
//    }

//    public void setFavoriteType(BookType favoriteType) {
//        this.favoriteType = favoriteType;
//    }

//    public BookType getDailyType() {
//        return dailyType;
//    }

//    public void setDailyType(BookType dailyType) {
//        this.dailyType = dailyType;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator == null ? null : avator.trim();
    }
}