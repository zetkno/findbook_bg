package com.zetkno.findbook.pojo;

public class Employee {
    private Integer id;

    private String userName;

    private String password;

    private String gender;

    private String phoneNum;

    private Boolean administrator;

    private Byte favoriteType;

    private Byte dailyType;

    private String email;

    private String avator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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