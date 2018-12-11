package com.xhxk.projectmange.model;

import lombok.Data;

@Data
public class Project {
    private Integer id;
    private String name;
    private Integer owner;
    private String remark;
}
