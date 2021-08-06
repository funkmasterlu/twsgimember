package com.example.openapidemo.model;

import com.example.openapidemo.entity.UserAuthority;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.Date;
import java.util.List;


@ApiModel(description = "用戶資訊")
public class User {
    @ApiModelProperty(value = "ID", required = true)
    private int id;
    @ApiModelProperty(value = "姓名", required = true)
    private String name;
    @ApiModelProperty(value = "會員編號", required = true)
    private String memberNumbering;
    @ApiModelProperty(value = "生日", required = true)
    public Date birthday;
    @ApiModelProperty(value = "email", required = true)
    private String email;
    @ApiModelProperty(value = "住址", required = true)
    private String address;
    @ApiModelProperty(value = "電話", required = true)
    private String phone;
    @ApiModelProperty(value = "手機號碼", required = true)
    private String cellPhone;
    @ApiModelProperty(value = "部別", required = true)
    private String memberType;
    @ApiModelProperty(value = "所屬組織", required = true)
    private String organizationName;
    @ApiModelProperty(value = "使命", required = true)
    private String mission;
    @ApiModelProperty(value = "是否有管理權限", required = true)
    private boolean isAdmin;
    @ApiModelProperty(value = "密碼", required = true)
    private String password;



    public User(int id, String name, String memberNumbering, Date birthday,
                String email, String address, String phone,
                String cellPhone, String memberType, String organizationName,
                String mission, boolean isAdmin, String password) {
        this.id = id;
        this.name = name;
        this.memberNumbering = memberNumbering;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.cellPhone = cellPhone;
        this.memberType = memberType;
        this.organizationName = organizationName;
        this.mission = mission;
        this.isAdmin = isAdmin;
        this.password = password;
//        this.authorities = authorities;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMemberNumbering() {
        return memberNumbering;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public String getMemberType() {
        return memberType;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public String getMission() {
        return mission;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
