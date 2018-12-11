package com.xhxk.projectmange.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "authority_info")
public class AuthorityInfo extends BaseModel{
    private Integer userId;
    private Integer roleId;
}
