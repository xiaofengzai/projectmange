package com.xhxk.projectmange.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "orginazition")
public class Orginazition extends BaseModel{
    private Integer leaderId;
    private String code;
    private String name;
    private Integer parentId;
    private Integer level;
}
