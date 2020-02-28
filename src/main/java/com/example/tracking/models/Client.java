package com.example.tracking.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Client  extends Auditable<String>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String policynumber;
    private String location;
    private String department;
    private String status;
    private String comment;
    private String request;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public Client(int id, String policynumber, String location, String department, String status, String comment,
            String request) {
        this.id = id;
        this.policynumber = policynumber;
        this.location = location;
        this.department = department;
        this.status = status;
        this.comment = comment;
        this.request = request;
    }

    public Client() {
    }

    @Override
    public String toString() {
        return "Client [comment=" + comment + ", department=" + department + ", id=" + id + ", location=" + location
                + ", policynumber=" + policynumber + ", request=" + request + ", status=" + status + "]";
    }

    
}