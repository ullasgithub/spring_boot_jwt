package com.DAL.entity;

import javax.persistence.*;

@Entity
@Table(schema = "public")
public class Employee {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String lname;

    public Employee() {
        super();
    }

    public Employee(Integer id, String name, String lname) {

        this.id = id;
        this.name = name;
        this.lname = lname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
