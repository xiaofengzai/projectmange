package com.xhxk.projectmange.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private Integer creator=0;
    @Column
    private Integer updater=0;
    @Column
    private Date createdTime=new Date();
    @Column
    private Date updatedTime=new Date();
}
