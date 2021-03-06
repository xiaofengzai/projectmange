package com.xhxk.projectmange.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "role")
public class Role extends BaseModel {
    private String roleName;
    private String roleDesc;
}
