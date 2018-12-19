package com.zetkno.findbook.pojo;

import java.util.List;

public class User {
    private Integer userid;

    private String userName;

    private String password;

    private String gender;

    private String phoneNum;

    private Boolean administrator;

    private String signature;

    private List<FavoriteType> favoriteTypes;

//    private List<BookType> dailyType;

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

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public List<FavoriteType> getFavoriteTypes() {
        return favoriteTypes;
    }

    public void setFavoriteTypes(List<FavoriteType> favoriteTypes) {
        this.favoriteTypes = favoriteTypes;
    }
}