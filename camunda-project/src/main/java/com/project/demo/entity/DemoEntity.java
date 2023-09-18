package com.project.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEMO_ENTITY")
public class DemoEntity {
    @Id
    Long id;

    @Column(name = "USER_NAME")
    String name;

    @Column(name = "PHONE_NUMBER")
    String phNum;

}
