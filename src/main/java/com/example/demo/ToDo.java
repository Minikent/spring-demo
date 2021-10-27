package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String description;
    private Boolean is_done;
    private Integer user_id;
    private Integer parent_id;
    private Integer status;
    private Integer priority;
    private BigInteger time;
    private BigInteger time_create;
    private String email;

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public Boolean getIs_done() {return is_done;}

    public void setIs_done(Boolean is_done) {this.is_done = is_done;}

    public Integer getUser_id() {return user_id;}

    public void setUser_id(Integer user_id) {this.user_id = user_id;}

    public Integer getParent_id() {return parent_id;}

    public void setParent_id(Integer parent_id) {this.parent_id = parent_id;}

    public BigInteger getTime_create() {return time_create;}

    public void setTime_create(BigInteger time_create) {this.time_create = time_create;}

    public Integer getStatus() {return status;}

    public void setStatus(Integer status) {this.status = status;}

    public Integer getPriority() {return priority;}

    public void setPriority(Integer priority) {this.priority = priority;}

    public BigInteger getTime() {return time;}

    public void setTime(BigInteger time) {this.time = time;}
}
