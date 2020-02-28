package com.example.tracking.models;

import javax.persistence.Entity;


import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Assured extends Auditable<String>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String policynumber;
    private String name;
    private String percentage;
    private String dob;
    private String relation;
    private String requestType;
    private String status;
    private String location;
    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPolicynumber() {
        return policynumber;
    }

    public void setPolicynumber(String policynumber) {
        this.policynumber = policynumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Assured(int id, String policynumber, String name, String percentage, String dob, String relation,
            String requestType, String status, String location, String comment) {
        this.id = id;
        this.policynumber = policynumber;
        this.name = name;
        this.percentage = percentage;
        this.dob = dob;
        this.relation = relation;
        this.requestType = requestType;
        this.status = status;
        this.location = location;
        this.comment = comment;
    }

    public Assured() {
    }

    @Override
    public String toString() {
        return "Assured [comment=" + comment + ", dob=" + dob + ", id=" + id + ", location=" + location + ", name="
                + name + ", percentage=" + percentage + ", policynumber=" + policynumber + ", relation=" + relation
                + ", requestType=" + requestType + ", status=" + status + "]";
    }

   }