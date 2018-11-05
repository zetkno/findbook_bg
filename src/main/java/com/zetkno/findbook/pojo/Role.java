package com.zetkno.findbook.pojo;

import java.util.List;

public class Role {
    private Integer id;

    private String role_name;

    // 角色可有多个权限、对应role_auth
    private List<Auth> authList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name == null ? null : role_name.trim();
    }

    public List<Auth> getAuthList() {
        return authList;
    }

    public void setAuthList(List<Auth> authList) {
        this.authList = authList;
    }
}