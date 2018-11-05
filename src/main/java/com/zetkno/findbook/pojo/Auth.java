package com.zetkno.findbook.pojo;

public class Auth {
    private Integer id;

    private String auth_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuth_name() {
        return auth_name;
    }

    public void setAuth_name(String auth_name) {
        this.auth_name = auth_name == null ? null : auth_name.trim();
    }
}