package com.zetkno.findbook.pojo;

public class User {
    private Integer userId;

    private String userName;

    private String password;

    private String gender;

    private String phoneNum;

    private Byte administrator;

    private Byte favoriteType;

    private Byte dailyType;

    private String email;

    private String avator;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Byte getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Byte administrator) {
        this.administrator = administrator;
    }

    public Byte getFavoriteType() {
        return favoriteType;
    }

    public void setFavoriteType(Byte favoriteType) {
        this.favoriteType = favoriteType;
    }

    public Byte getDailyType() {
        return dailyType;
    }

    public void setDailyType(Byte dailyType) {
        this.dailyType = dailyType;
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
}