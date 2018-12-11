package com.xhxk.projectmange.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "project")
public class Project extends BaseModel{
    private String name;
    private Integer ownerId;
    private String remark;
}
