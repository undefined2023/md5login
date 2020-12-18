package com.webencyclop.demo.model.mysql;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name="fileinfo")
public class Fileinfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private int size;

    private Timestamp uploadDate;

    private String uploaderUsername;

    // below can be null

    private String approverUsername;

    private boolean approved;

    public Fileinfo() {

    }

    public Fileinfo(String name, int size, Timestamp uploadDate, String uploaderUsername, String approverUsername) {

        this.name = name;
        this.size = size;
        this.uploadDate = uploadDate;
        this.uploaderUsername = uploaderUsername;
        this.approverUsername = approverUsername;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Timestamp uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getUploaderUsername() {
        return uploaderUsername;
    }

    public void setUploaderUsername(String uploaderUsername) {
        this.uploaderUsername = uploaderUsername;
    }

    public String getApproverUsername() {
        return approverUsername;
    }

    public void setApproverUsername(String approverUsername) {
        this.approverUsername = approverUsername;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }


}
