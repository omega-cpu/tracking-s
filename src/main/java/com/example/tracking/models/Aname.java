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
public class Aname extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String policyNumber;
    private String oldName;
    private String newName;
    private String location;
    private String status;
    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public Aname(int id, String policyNumber, String oldName, String newName, String location, String status,
            String comment) {
        this.id = id;
        this.policyNumber = policyNumber;
        this.oldName = oldName;
        this.newName = newName;
        this.location = location;
        this.status = status;
        this.comment = comment;
    }

    public Aname() {
    }

    @Override
    public String toString() {
        return "Aname [comment=" + comment + ", id=" + id + ", location=" + location + ", newName=" + newName
                + ", oldName=" + oldName + ", policyNumber=" + policyNumber + ", status=" + status + "]";
    }

  
}