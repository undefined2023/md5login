package com.webencyclop.demo.model.mysql;

import java.sql.Timestamp;

//@Entity
//@Table(name="fileinfo")
public class Fileinfo {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private int size;

    private Timestamp upload_date;

    private String uploaderUsername;

    // below can be null

    private String approverUsername;

    private boolean approved;

    private String fileLocation;

    public Fileinfo() {

    }

    public Fileinfo(String name, int size, Timestamp upload_date, String uploaderUsername, String approverUsername) {

        this.name = name;
        this.size = size;
        this.upload_date = upload_date;
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

    public Timestamp getUpload_date() {
        return upload_date;
    }

    public void setUpload_date(Timestamp upload_date) {
        this.upload_date = upload_date;
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

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }


}
