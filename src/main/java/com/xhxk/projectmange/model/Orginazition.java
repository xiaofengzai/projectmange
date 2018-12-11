package com.xhxk.projectmange.model;

import lombok.Data;

@Data
public class Orginazition {
    private Integer id;
    private Integer leader;
    private String code;
    private String name;
    private Integer parentId;
    private Integer level;
}
