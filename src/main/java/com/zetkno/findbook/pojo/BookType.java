package com.zetkno.findbook.pojo;

public class BookType {
    private Integer typeId;

    private String parentId;

    private String parentName;

    private String typeName;

    private String typeCode;

    public BookType() {

    }

//    public BookType (String  typeName) {
//        this.typeName = typeName;
//    }

    public BookType(Integer typeId, String parentId, String parentName, String typeName, String typeCode) {
        this.typeId = typeId;
        this.parentId = parentId;
        this.parentName = parentName;
        this.typeName = typeName;
        this.typeCode = typeCode;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName == null ? null : parentName.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }
}