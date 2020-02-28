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
public class Employer extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String policynumber;
    private String name;
    private String staffId;
    private String idStaff;
    private String location;
    private String status;
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

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(String idStaff) {
        this.idStaff = idStaff;
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

    public Employer(int id, String policynumber, String name, String staffId, String idStaff, String location,
            String status, String comment) {
        this.id = id;
        this.policynumber = policynumber;
        this.name = name;
        this.staffId = staffId;
        this.idStaff = idStaff;
        this.location = location;
        this.status = status;
        this.comment = comment;
    }

    public Employer() {
    }

    @Override
    public String toString() {
        return "Employer [comment=" + comment + ", id=" + id + ", idStaff=" + idStaff + ", location=" + location
                + ", name=" + name + ", policynumber=" + policynumber + ", staffId=" + staffId + ", status=" + status
                + "]";
    }
       
}