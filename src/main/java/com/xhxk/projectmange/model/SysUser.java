package com.xhxk.projectmange.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "sys_user")
@Data
public class SysUser extends BaseModel{
    @Column(length = 50)
    private String username;
    @Column(length = 100)
    private String password;
    @Column(length = 100)
    private String nickname;
    @Column(length = 50)
    private String email;
    @Column(length = 20)
    private String phone;
}
