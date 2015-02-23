package edu.javacourse.spring.model;import javax.persistence.*;import java.io.Serializable;/** * Author: Georgy Gobozov * Date: 21.07.13 */@Entity@Table(name = "jc_region")public class Region implements Serializable{    @Id    @GeneratedValue(strategy = GenerationType.IDENTITY)    @Column(name = "region_id")    private Integer id;    @Column(name = "region_name", nullable = false)    private String name;    public Region(String name) {        this.name = name;    }    public Region() {    }    public Integer getId() {        return id;    }    public void setId(Integer id) {        this.id = id;    }    public String getName() {        return name;    }    public void setName(String name) {        this.name = name;    }}